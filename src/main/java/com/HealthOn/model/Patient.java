package com.HealthOn.model;

import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Patient {
    @Id
    private String email;
    private String name;
    private String phoneNo;
    private String address;
//    private List<Appointment> appointmentList;
//    private List<Prescription> prescriptionList;
//    private Role role = Role.PATIENT;
}
