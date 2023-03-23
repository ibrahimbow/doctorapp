package org.cegeka.com.doctor.adapter.out.databse.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "doctors")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class DoctorData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    private String specialist;

    private String email;
}
