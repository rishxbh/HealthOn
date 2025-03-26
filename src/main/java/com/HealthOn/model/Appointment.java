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
    @ManyToOne
    @JoinColumn(name = "Patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "Doctor_id")
    private Doctor doctor;
    private LocalDateTime appointmentTime;
    private CallStatus callStatus;
}
