package com.HealthOn.model;

import lombok.*;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long invoiceID;
    @ManyToOne
    @JoinColumn(name = "Patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "Doctor_id")
    private Doctor doctor;
}
