package com.HealthOn.service.impl;

import com.HealthOn.dto.request.PatientDetailsDtoRequest;
import com.HealthOn.model.Patient;
import com.HealthOn.repo.PatientRepository;
import com.HealthOn.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient savePatient(PatientDetailsDtoRequest request) {
        Patient patient = Patient.builder().email(request.getEmail())
                .name(request.getName())
                .phoneNo(request.getPhoneNo())
                .address(request.getAddress()).build();
        return patientRepository.save(patient);
    }
}
