package org.cegeka.com.doctor.adapter.in.web.mapper;

import org.cegeka.com.doctor.adapter.in.web.dto.DoctorDto;
import org.cegeka.com.doctor.adapter.in.web.dto.SaveDoctorBodyDto;

import org.cegeka.com.doctor.common.Mapper;
import org.cegeka.com.doctor.domain.Doctor;

@Mapper
public class DoctorDtoMapper {

    public DoctorDtoMapper() {
        super();
    }

    public static DoctorDto toDo(Doctor doctor){
        return DoctorDto.builder()
                .doctorId(doctor.getId())
                .fullName(doctor.getName())
                .specialist(doctor.getSpecialist())
                .email(doctor.getEmail())
                .build();
    }

    public static Doctor mapTo(DoctorDto doctorDto) {
        return new Doctor(doctorDto.getDoctorId(),
                doctorDto.getFullName(),
                doctorDto.getSpecialist(),
                doctorDto.getEmail());
    }

    public static Doctor toDomainFromSavedBody(SaveDoctorBodyDto saveDoctorBodyDto) {
        return Doctor.builder()
                .id(saveDoctorBodyDto.getDoctorId())
                .name(saveDoctorBodyDto.getFullName())
                .specialist(saveDoctorBodyDto.getSpecialist())
                .email(saveDoctorBodyDto.getEmail()).build();}
}
