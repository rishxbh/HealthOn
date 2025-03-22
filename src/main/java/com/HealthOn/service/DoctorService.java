package com.HealthOn.service;

import com.HealthOn.model.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor getDoctorUsingToken(String token);
    Doctor getDoctorUsingId(Long id);
    List<Doctor> getDoctorBySpeciality(String speciality);
    List<Doctor> getAllDoctors();
}
