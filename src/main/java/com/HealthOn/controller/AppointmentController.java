package com.HealthOn.controller;

import com.HealthOn.dto.request.AppointmentDetailsDtoRequest;
import com.HealthOn.model.Appointment;
import com.HealthOn.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/book")
    public ResponseEntity<Appointment> bookAppointment(@RequestBody AppointmentDetailsDtoRequest request)  {
        Appointment result = appointmentService.bookAppointment(request);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PutMapping("/cancel")
    public ResponseEntity<Appointment> cancelAppointment(@RequestBody Appointment appointment) {
        Appointment result = appointmentService.cancelAppointment(appointment);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

}
