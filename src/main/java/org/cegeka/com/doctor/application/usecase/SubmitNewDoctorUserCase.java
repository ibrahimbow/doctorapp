package org.cegeka.com.doctor.application.usecase;

import org.cegeka.com.doctor.domain.Doctor;

public interface SubmitNewDoctorUserCase {

    Doctor saveDoctor(Doctor doctor);
}
