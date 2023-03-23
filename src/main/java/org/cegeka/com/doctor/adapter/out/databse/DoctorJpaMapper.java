package org.cegeka.com.doctor.adapter.out.databse;

import org.cegeka.com.doctor.adapter.out.databse.model.DoctorData;
import org.cegeka.com.doctor.common.Mapper;
import org.cegeka.com.doctor.domain.Doctor;

@Mapper
public class DoctorJpaMapper {

    DoctorJpaMapper() {
        super();
    }

    DoctorData toJpaEntity(Doctor doctor) {
        return DoctorData.builder()
                .id(doctor.getId())
                .fullName(doctor.getName())
                .specialist(doctor.getSpecialist())
                .email(doctor.getEmail())
                .build();
    }

    DoctorData toJpaEntity(Doctor doctor, DoctorData persistedDoctorData) {
        return persistedDoctorData.toBuilder()
                .id(doctor.getId())
                .fullName(doctor.getName())
                .specialist(doctor.getSpecialist())
                .email(doctor.getEmail())
                .build();
    }

    Doctor toDomain(DoctorData userData) {
        return Doctor.builder()
                .id(userData.getId())
                .name(userData.getFullName())
                .specialist(userData.getSpecialist())
                .email(userData.getEmail())
                .build();
    }
}
