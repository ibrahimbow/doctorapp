package org.cegeka.com.doctor.application.port.in;


import org.cegeka.com.doctor.domain.Doctor;

public interface CreateDoctorUseCase {

    boolean createDoctor(Doctor doctor);
}
