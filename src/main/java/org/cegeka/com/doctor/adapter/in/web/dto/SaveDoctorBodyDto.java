package org.cegeka.com.doctor.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SaveDoctorBodyDto {
    private int doctorId;
    private String fullName;
    private String specialist;
    private String email;
}
