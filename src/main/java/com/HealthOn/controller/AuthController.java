package com.HealthOn.controller;

import com.HealthOn.dto.request.DoctorDetailsDtoRequest;
import com.HealthOn.dto.request.PatientDetailsDtoRequest;
import com.HealthOn.dto.request.SignUpDtoRequest;
import com.HealthOn.dto.response.SignUpDtoResponse;
import com.HealthOn.exceptions.EmailAlreadyExistException;
import com.HealthOn.model.Doctor;
import com.HealthOn.model.Patient;
import com.HealthOn.model.User;
import com.HealthOn.service.DoctorService;
import com.HealthOn.service.PatientService;
import com.HealthOn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/signUpDefault")
public class AuthController {

    @Autowired
    private UserService userService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    @PostMapping("/signUp")
    public ResponseEntity<SignUpDtoResponse> saveUser(@RequestBody SignUpDtoRequest request)  throws EmailAlreadyExistException {
        SignUpDtoResponse result = userService.saveUser(request);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PostMapping("/signUp/doctor")
    public ResponseEntity<Doctor> saveDoctor(@RequestBody DoctorDetailsDtoRequest request) {
        Doctor doctor = doctorService.saveDoctor(request);
        return new ResponseEntity<>(doctor, HttpStatus.CREATED);
    }

    @PostMapping("/signUp/patient")
    public ResponseEntity<Patient> savePatient(@RequestBody PatientDetailsDtoRequest request) {
        Patient patient = patientService.savePatient(request);
        return new ResponseEntity<>(patient, HttpStatus.CREATED);
    }

}
