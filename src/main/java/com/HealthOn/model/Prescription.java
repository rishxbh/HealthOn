package com.HealthOn.model;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prescription {
    private long prescriptionID;
    private Appointment appointment;
    private String prescriptions;
}
