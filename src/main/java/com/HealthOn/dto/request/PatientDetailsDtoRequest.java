package com.HealthOn.dto.request;

import lombok.Data;

@Data
public class PatientDetailsDtoRequest {
    private String email;
    private String name;
    private String phoneNo;
    private String address;
}
