package com.HealthOn.service.impl;

import com.HealthOn.dto.request.DoctorDetailsDtoRequest;
import com.HealthOn.model.Doctor;
import com.HealthOn.repo.DoctorRepository;
import com.HealthOn.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor getDoctorUsingToken(String token) {
        return null;
    }

    @Override
    public Doctor getDoctorUsingEmail(String email) {
        Optional<Doctor> result = doctorRepository.findById(email);
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

    @Override
    public List<Doctor> getByName(String name) {
        List<Doctor> result = doctorRepository.findAllByName(name);
        return result;
    }

    @Override
    public Doctor saveDoctor(DoctorDetailsDtoRequest request) {
        Doctor doctor = Doctor.builder().email(request.getEmail())
                .name(request.getName())
                .phoneNo(request.getPhoneNo())
                .address(request.getAddress())
                .description(request.getDescription())
                .experience(request.getExperience())
                .speciality(request.getSpeciality())
                .appointmentCost(request.getAppointmentCost()).build();
        return doctorRepository.save(doctor);
    }


}
