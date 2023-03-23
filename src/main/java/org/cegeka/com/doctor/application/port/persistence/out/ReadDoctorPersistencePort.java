package org.cegeka.com.doctor.application.port.persistence.out;

import org.cegeka.com.doctor.domain.Doctor;

import java.util.List;
import java.util.Optional;

public interface ReadDoctorPersistencePort {

    Boolean existsDoctorByEmail(String email);

    Optional<Doctor> getDoctorById(int userId);

    List<Doctor> getAllDoctors();
}
