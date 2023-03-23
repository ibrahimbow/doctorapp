package org.cegeka.com.doctor.adapter.out.databse;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DoctorPersistenceDto {
    private int doctorId;
    private String name;
    private String specialist;
    private String email;

}
