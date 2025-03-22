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
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctorId;
    private String name;
    private String email;
    private String phoneNo;
    private String address;
    private String speciality;
    private List<Long> appointmentHistory;
    private String appointmentCost;
    private Role role = Role.DOCTOR;
}
