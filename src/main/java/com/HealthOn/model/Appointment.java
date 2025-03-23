package com.HealthOn.model;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long appointmentId;
//    private Patient patient;
//    private Doctor doctor;
    private LocalDateTime appointmentTime;
    private CallStatus callStatus;
}
