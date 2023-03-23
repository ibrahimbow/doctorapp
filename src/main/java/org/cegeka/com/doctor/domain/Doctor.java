package org.cegeka.com.doctor.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter(AccessLevel.PACKAGE)
public class Doctor {

    private int id;
    private String name;
    private String specialist;
    private String email;

    public Doctor(int id, String name, String specialist, String email) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


