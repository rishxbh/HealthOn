package com.HealthOn.dto.response;

import com.HealthOn.model.Role;
import lombok.Data;

@Data
public class SignUpDtoResponse {
    private String email;
    private Role role;
}
