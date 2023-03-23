package org.cegeka.com.doctor.application.port.entrypoint.in;

import org.cegeka.com.doctor.adapter.in.web.dto.DoctorDto;
import org.cegeka.com.doctor.adapter.in.web.dto.SaveDoctorBodyDto;


public interface CreateDoctorEndPointPort {

    DoctorDto saveDoctor(SaveDoctorBodyDto saveDoctorBodyDto);

    DoctorDto updateDoctor(Integer id, SaveDoctorBodyDto saveDoctorBodyDto);

    void deleteDoctor(Integer userId);
}
