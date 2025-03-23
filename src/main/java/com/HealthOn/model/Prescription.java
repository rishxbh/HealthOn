package com.HealthOn.model;

import jakarta.persistence.Id;
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
//    private Appointment appointment;
    private String prescriptions;
}
