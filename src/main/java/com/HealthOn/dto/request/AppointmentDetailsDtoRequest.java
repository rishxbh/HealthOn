package com.HealthOn.dto.request;

import com.HealthOn.model.CallStatus;
import com.HealthOn.model.Doctor;
import com.HealthOn.model.Patient;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AppointmentDetailsDtoRequest {
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime appointmentTime;
    private CallStatus callStatus;
}
