package com.HealthOn.service.impl;

import com.HealthOn.dto.request.AppointmentDetailsDtoRequest;
import com.HealthOn.model.Appointment;
import com.HealthOn.model.CallStatus;
import com.HealthOn.repo.AppointmentRepository;
import com.HealthOn.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Appointment bookAppointment(AppointmentDetailsDtoRequest request) {
        Appointment appointment = Appointment.builder()
                .appointmentTime(request.getAppointmentTime())
                .doctor(request.getDoctor())
                .patient(request.getPatient())
                .callStatus(CallStatus.SCHEDULED)
                .build();
        return appointmentRepository.save(appointment);
    }
}
