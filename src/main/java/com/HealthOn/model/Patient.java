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
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH})
    private List<Appointment> appointmentList;
    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH})
    private List<Prescription> prescriptionList;
    private Role role = Role.PATIENT;
}
