package org.cegeka.com.doctor.adapter.in.web;

import org.cegeka.com.doctor.adapter.in.web.dto.DoctorDto;
import org.cegeka.com.doctor.adapter.in.web.dto.SaveDoctorBodyDto;

import org.cegeka.com.doctor.common.Adapter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Adapter
@RestController
public class DoctorController {

    private final CreateDoctorPersistenceEndPointAdapter createDoctor;

    public DoctorController(CreateDoctorPersistenceEndPointAdapter createDoctor) {
        this.createDoctor = createDoctor;
    }

    @PostMapping("/v1/saveDoctor")
    @ResponseStatus(HttpStatus.CREATED)
    private DoctorDto createEmployee(@RequestBody SaveDoctorBodyDto saveDoctorBodyDto) {
//        DoctorDto doctorDto;
//        if (saveDoctorBodyDto == null) {
//            return new ResponseEntity(HttpStatus.BAD_REQUEST);
//        }
//        try {
//          doctorDto =  createDoctor.saveDoctor(saveDoctorBodyDto);
//        } catch (Exception exception) {
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//        return new ResponseEntity("New Doctor is created " + doctorDto.getName() +"", HttpStatus.CREATED);
        return createDoctor.saveDoctor(saveDoctorBodyDto);
    }

    @GetMapping("/getAllDoctors")
    public List<DoctorDto> getAllDoctors() {
//        return .findAll();
        return null;
    }
}
