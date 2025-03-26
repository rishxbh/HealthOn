package com.HealthOn.model;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

import jakarta.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prescription {
    @Id
    private long prescriptionID;
    @OneToOne
    @JoinColumn(name = "Appointment_id")
    private Appointment appointment;
    private String prescriptions;
}
