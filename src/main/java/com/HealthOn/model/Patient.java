package com.HealthOn.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long patientId;
    private String name;
    private String email;
    private String phoneNo;
    private String address;
    private List<Appointment> appointmentList;
    private List<Prescription> prescriptionList;
    private Role role = Role.PATIENT;
}
