package org.cegeka.com.doctor.adapter.in.web;

import org.cegeka.com.doctor.adapter.in.web.dto.DoctorDto;
import org.cegeka.com.doctor.adapter.in.web.dto.SaveDoctorBodyDto;
import org.cegeka.com.doctor.adapter.in.web.mapper.DoctorDtoMapper;

import org.cegeka.com.doctor.application.port.entrypoint.in.CreateDoctorEndPointPort;
import org.cegeka.com.doctor.application.usecase.SubmitNewDoctorUserCase;
import org.cegeka.com.doctor.common.Adapter;
import org.cegeka.com.doctor.domain.Doctor;

@Adapter
public class CreateDoctorPersistenceEndPointAdapter implements CreateDoctorEndPointPort {

    private final SubmitNewDoctorUserCase submitNewDoctorUserCase;


    public CreateDoctorPersistenceEndPointAdapter(SubmitNewDoctorUserCase submitNewDoctorUserCase) {
        this.submitNewDoctorUserCase = submitNewDoctorUserCase;
    }


    @Override
    public DoctorDto saveDoctor(SaveDoctorBodyDto saveDoctorBodyDto) {
        Doctor doctor = DoctorDtoMapper.toDomainFromSavedBody(saveDoctorBodyDto);
        Doctor savedDoctor = submitNewDoctorUserCase.saveDoctor(doctor);
        return  DoctorDtoMapper.toDo(savedDoctor);
    }

    @Override
    public DoctorDto updateDoctor(Integer id, SaveDoctorBodyDto saveDoctorBodyDto) {
        return null;
    }

    @Override
    public void deleteDoctor(Integer userId) {

    }
}
