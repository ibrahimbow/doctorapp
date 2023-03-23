package org.cegeka.com.doctor.application.service;

import org.cegeka.com.doctor.application.port.persistence.out.CreateDoctorPersistencePort;
import org.cegeka.com.doctor.application.port.persistence.out.ReadDoctorPersistencePort;
import org.cegeka.com.doctor.application.usecase.SubmitNewDoctorUserCase;
import org.cegeka.com.doctor.domain.Doctor;
import org.springframework.stereotype.Service;

@Service
public class CreateNewDoctorService implements SubmitNewDoctorUserCase {

    private final CreateDoctorPersistencePort createDoctorPersistencePort;
//    private final ReadDoctorPersistencePort readDoctorPersistencePort;


    public CreateNewDoctorService(CreateDoctorPersistencePort createDoctorPersistencePort) {
        this.createDoctorPersistencePort = createDoctorPersistencePort;
    }

    @Override
    public Doctor saveDoctor(Doctor doctor) {
//        if(readDoctorPersistencePort.existsDoctorByEmail(doctor.getEmail())){
//            throw new IllegalArgumentException("Doctor duplicated..!");
//        }
        return createDoctorPersistencePort.saveNewDoctor(doctor);
    }
}
