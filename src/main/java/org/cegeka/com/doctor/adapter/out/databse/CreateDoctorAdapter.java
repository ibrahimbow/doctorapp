package org.cegeka.com.doctor.adapter.out.databse;

import org.cegeka.com.doctor.adapter.out.databse.model.DoctorData;
import org.cegeka.com.doctor.application.port.persistence.out.CreateDoctorPersistencePort;
import org.cegeka.com.doctor.common.Adapter;
import org.cegeka.com.doctor.domain.Doctor;

@Adapter
public class CreateDoctorAdapter implements CreateDoctorPersistencePort {

    private final DoctorRepository doctorRepository;
    private final DoctorJpaMapper doctorJpaMapper;

    public CreateDoctorAdapter(DoctorRepository doctorRepository, DoctorJpaMapper doctorJpaMapper) {
        this.doctorRepository = doctorRepository;
        this.doctorJpaMapper = doctorJpaMapper;
    }

    @Override
    public Doctor saveNewDoctor(Doctor doctor) {
        DoctorData doctorData = doctorJpaMapper.toJpaEntity(doctor);
        DoctorData doctorSaved = doctorRepository.save(doctorData);
        return doctorJpaMapper.toDomain(doctorSaved);
    }
}
