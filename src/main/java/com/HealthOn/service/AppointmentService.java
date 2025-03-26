package com.HealthOn.service;

import com.HealthOn.dto.request.AppointmentDetailsDtoRequest;
import com.HealthOn.model.Appointment;

public interface AppointmentService {
    Appointment bookAppointment(AppointmentDetailsDtoRequest request);
}
