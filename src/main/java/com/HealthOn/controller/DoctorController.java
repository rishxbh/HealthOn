package com.HealthOn.controller;

import com.HealthOn.dto.response.DoctorDtoResponse;
import com.HealthOn.model.Doctor;
import com.HealthOn.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctors")
    public ResponseEntity<List<Doctor>> getAllDoctors() {
        List<Doctor> result = doctorService.getAllDoctors();
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public ResponseEntity<List<Doctor>> searchDoctor(@PathVariable String name) {
        List<Doctor> result = doctorService.getByName(name);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }

    @GetMapping("/{email}")
    public ResponseEntity<DoctorDtoResponse> getDoctor(@PathVariable String email) {
        DoctorDtoResponse response = doctorService.getDoctorByEmailDto(email);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
