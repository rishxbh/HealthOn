package com.HealthOn.service;

import com.HealthOn.dto.request.DoctorDetailsDtoRequest;
import com.HealthOn.dto.response.DoctorDtoResponse;
import com.HealthOn.model.Doctor;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface DoctorService {
    Doctor getDoctorUsingToken(String token);
    Doctor getDoctorUsingEmail(String email);
    List<Doctor> getDoctorBySpeciality(String speciality);
    List<Doctor> getAllDoctors();
    List<Doctor> getByName(String name);
    Doctor saveDoctor(DoctorDetailsDtoRequest doctorDetailsDtoRequest);
    DoctorDtoResponse getDoctorByEmailDto(String email);
}
