package com.HealthOn.model;

import lombok.*;
import java.util.List;
import jakarta.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Doctor {
    @Id
    private String email;
    private String name;
    private String phoneNo;
    private String address;
    private String speciality;
    private String description;
    private int experience;
//    private List<Long> appointmentHistory;
    private String appointmentCost;
//    private Role role = Role.DOCTOR;
}
