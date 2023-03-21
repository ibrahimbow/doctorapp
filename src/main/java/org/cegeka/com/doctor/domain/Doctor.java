package org.cegeka.com.doctor.domain;

public class Doctor {

    private int doctorId;
    private String name;
    private String specialist;
    private String email;

    public Doctor(int doctorId, String name, String specialist, String email) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialist = specialist;
        this.email = email;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
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


