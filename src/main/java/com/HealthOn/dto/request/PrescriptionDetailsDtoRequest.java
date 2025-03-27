package com.HealthOn.dto.request;

import com.HealthOn.model.Appointment;
import lombok.Data;

@Data
public class PrescriptionDetailsDtoRequest {
    private Appointment appointment;
    private String prescriptions;
}
