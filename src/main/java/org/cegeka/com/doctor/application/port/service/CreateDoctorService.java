package org.cegeka.com.doctor.application.port.service;

import org.cegeka.com.doctor.application.port.in.CreateDoctorUseCase;
import org.cegeka.com.doctor.application.port.out.CreateDoctorPort;
import org.cegeka.com.doctor.domain.Doctor;

import java.util.regex.Pattern;


public class CreateDoctorService implements CreateDoctorUseCase {

    private final static String REGEX_PATTERN = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private final CreateDoctorPort createDoctorPort;

    public CreateDoctorService(CreateDoctorPort createDoctorPort) {
        this.createDoctorPort = createDoctorPort;
    }

    @Override
    public boolean createDoctor(Doctor doctor) {
        if (doctor != null && isEmailExists(doctor.getEmail())) {
            return createDoctorPort.createDoctor(doctor);
        }
        return false;
    }

    public boolean isEmailExists(String email) {
        if (email == null) {
            return false;
        }
        return !email.isBlank() && patternMatches(email, REGEX_PATTERN);
    }

    public boolean isNameValid(String name) {
        return name == null;
    }

    public boolean isSpecialistValid(String specialist) {
        return specialist == null;
    }

    public static boolean patternMatches(String email, String regexPattern) {
        return Pattern.compile(regexPattern)
                .matcher(email)
                .matches();
    }

    public static boolean lookatcomment(String email, String regexPattern) {
        return false;
    }
}
