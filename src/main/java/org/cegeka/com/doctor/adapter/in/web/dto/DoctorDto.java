package org.cegeka.com.doctor.adapter.in.web.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DoctorDto {
    private int doctorId;
    private String fullName;
    private String specialist;
    private String email;
}
