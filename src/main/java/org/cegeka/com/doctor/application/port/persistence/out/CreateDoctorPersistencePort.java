package org.cegeka.com.doctor.application.port.persistence.out;

import org.cegeka.com.doctor.domain.Doctor;

public interface CreateDoctorPersistencePort {

    Doctor saveNewDoctor(Doctor doctor);
}
