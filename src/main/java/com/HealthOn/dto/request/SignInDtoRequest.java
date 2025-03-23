package com.HealthOn.dto.request;

import lombok.Data;

@Data
public class SignInDtoRequest {
    private String email;
    private String password;
}
