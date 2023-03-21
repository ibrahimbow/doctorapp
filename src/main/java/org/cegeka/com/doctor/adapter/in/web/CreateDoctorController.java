package org.cegeka.com.doctor.adapter.in.web;

import org.cegeka.com.doctor.application.port.in.CreateDoctorUseCase;
import org.cegeka.com.doctor.domain.Doctor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CreateDoctorController {

//
//
//
//    private final CreateDoctorUseCase createDoctorUseCase;
//
//    public CreateDoctorController(CreateDoctorUseCase createDoctorUseCase) {
//        this.createDoctorUseCase = createDoctorUseCase;
//    }
//
//    @PostMapping("/saveDoctor")
//    private ResponseEntity createEmployee(@RequestBody Doctor doctor) {
//        try {
//            createDoctorUseCase.createDoctor(doctor);
//        } catch (Exception exception) {
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return new ResponseEntity("New Doctor created with id: " + doctor.getDoctorId(), HttpStatus.CREATED);
//    }
}
