package com.HealthOn.service.impl;

import com.HealthOn.model.Doctor;
import com.HealthOn.repo.DoctorRepository;
import com.HealthOn.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor getDoctorUsingToken(String token) {
        return null;
    }

    @Override
    public Doctor getDoctorUsingId(Long id) {
        Optional<Doctor> result = doctorRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Doctor> getDoctorBySpeciality(String speciality) {
        return doctorRepository.findAllBySpeciality(speciality);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
}
