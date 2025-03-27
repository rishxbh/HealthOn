package com.HealthOn.service.impl;

import com.HealthOn.dto.request.PrescriptionDetailsDtoRequest;
import com.HealthOn.model.Prescription;
import com.HealthOn.repo.PrescriptionRepository;
import com.HealthOn.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Override
    public Prescription savePrescription(PrescriptionDetailsDtoRequest request) {
        Prescription prescription = Prescription.builder().prescriptions(request.getPrescriptions())
                .appointment(request.getAppointment()).build();
        return prescriptionRepository.save(prescription);
    }

    @Override
    public Prescription editPrescription(Prescription request) {
        Prescription prescription = prescriptionRepository.findById(request.getPrescriptionID()).orElse(null);
        if(prescription != null) {
            prescription.setPrescriptions(request.getPrescriptions());
            prescriptionRepository.save(prescription);
        }
        return null;
    }

}
