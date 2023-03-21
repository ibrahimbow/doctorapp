package org.cegeka.com.doctor.application.port.out;


import org.cegeka.com.doctor.domain.Doctor;

public interface CreateDoctorPort {

    boolean createDoctor(Doctor doctor);
}
