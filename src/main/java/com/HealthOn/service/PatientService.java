package com.HealthOn.service;

import com.HealthOn.dto.request.PatientDetailsDtoRequest;
import com.HealthOn.model.Patient;

public interface PatientService {
    Patient savePatient(PatientDetailsDtoRequest request);
}
