package com.HealthOn.dto.response;

import lombok.Data;

@Data
public class DoctorDtoResponse {
    private String email;
    private String name;
    private String phoneNo;
    private String address;
    private String speciality;
    private String description;
    private int experience;
}
