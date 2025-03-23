package com.HealthOn.dto.request;

import lombok.Data;

@Data
public class DoctorDetailsDtoRequest {
    private String email;
    private String name;
    private String phoneNo;
    private String address;
    private String speciality;
    private String description;
    private int experience;
    private String appointmentCost;
}
