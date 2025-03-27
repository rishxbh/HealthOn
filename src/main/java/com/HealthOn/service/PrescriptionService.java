package com.HealthOn.service;

import com.HealthOn.dto.request.PrescriptionDetailsDtoRequest;
import com.HealthOn.model.Prescription;

public interface PrescriptionService {
    Prescription savePrescription(PrescriptionDetailsDtoRequest request);
    Prescription editPrescription(Prescription request);
}
