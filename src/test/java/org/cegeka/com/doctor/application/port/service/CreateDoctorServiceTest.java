package org.cegeka.com.doctor.application.port.service;

import org.cegeka.com.doctor.application.port.out.CreateDoctorPort;
import org.cegeka.com.doctor.domain.Doctor;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CreateDoctorServiceTest {

    private static final String regexPattern ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private final CreateDoctorPort createDoctorPort = Mockito.mock(CreateDoctorPort.class);

    private final CreateDoctorService createDoctorService = new CreateDoctorService(createDoctorPort);


    @Test
    void createDoctor() {
        //given
        Doctor doctor = getDoctor();
        //when
        boolean success = createDoctorService.createDoctor(doctor);
        //then
        assertThat(success).isFalse();
    }

    @Test
    void createNoDoctor() {
        boolean success = createDoctorService.createDoctor(null);
        assertThat(success).isFalse();
    }

    @Test
    public void getDoctorId() {
        //given
        Doctor doctor = getDoctor();
        //when
        int doctorId = doctor.getDoctorId();
        //then
        int expectedDoctorId = 1;
        assertThat(doctorId).isEqualTo(expectedDoctorId);
    }

    @Test
    public void createDoctorWithoutNameIsNotAllowed() {
        Doctor doctor = new Doctor(1, null, "doctor", "ibrahim@look.com");
        String name = doctor.getName();
        boolean expectedName = createDoctorService.isNameValid(name);
        assertTrue(expectedName);
    }

    @Test
    public void createDoctorWithoutSpecialistIsNotAllowed() {
        Doctor doctor = new Doctor(1, null, null, "ibrahim@look.com");
        String name = doctor.getName();
        boolean expectedName = createDoctorService.isSpecialistValid(name);
        assertTrue(expectedName);
    }

    @Test
    public void emailNotNull() {
        Doctor doctor = new Doctor(1, "ibrahim", "doctor", "ibrahim@look.com");
        String emailAddress = doctor.getEmail();
        boolean expectedEmail = createDoctorService.isEmailExists(emailAddress);
        assertTrue(expectedEmail);
    }

    @Test
    public void emailNotAllowedToBeBlank() {
        Doctor doctor = new Doctor(1, "ibrahim", "doctor", "");
        String emailAddress = doctor.getEmail();
        boolean expectedEmail = createDoctorService.isEmailExists(emailAddress);
        assertFalse(expectedEmail);
    }

    @Test
    public void emailNotAllowedToBeNull() {
        Doctor doctor = new Doctor(1, "ibrahim", "doctor", null);
        String emailAddress = doctor.getEmail();
        boolean expectedEmail = createDoctorService.isEmailExists(emailAddress);
        assertFalse(expectedEmail);
    }

    @Test
    public void emailIsValidWhenUsingStrictRegex() {
       String emailAddress = "ibrahim@look.com";
        assertTrue(CreateDoctorService.patternMatches(emailAddress, regexPattern));
    }

    @Test
    public void emailIsNotValidWhenUsingStrictRegex() {
        String emailAddress = "ibrahimookom";
        assertFalse(CreateDoctorService.patternMatches(emailAddress, regexPattern));
    }


    private static Doctor getDoctor() {
        return new Doctor(1, "ibrahim", "doctor", "ibrahim@look.com");
    }
}