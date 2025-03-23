package com.HealthOn.dto.request;

import com.HealthOn.model.Role;
import lombok.Data;

@Data
public class SignUpDtoRequest {
    private String email;
    private String password;
    private Role role;
}
