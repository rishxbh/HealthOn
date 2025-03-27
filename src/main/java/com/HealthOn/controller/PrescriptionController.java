package com.HealthOn.controller;

import com.HealthOn.dto.request.PrescriptionDetailsDtoRequest;
import com.HealthOn.model.Prescription;
import com.HealthOn.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/prescription")
public class PrescriptionController {

    @Autowired
    private PrescriptionService prescriptionService;

    @PostMapping("/save")
    public ResponseEntity<Prescription> savePrescription(@RequestBody PrescriptionDetailsDtoRequest request) {
        Prescription prescription = prescriptionService.savePrescription(request);
        return new ResponseEntity<>(prescription, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<Prescription> editPrescription(@RequestBody Prescription request) {
        Prescription prescription = prescriptionService.editPrescription(request);
        return new ResponseEntity<>(prescription, HttpStatus.CREATED);
    }

}
