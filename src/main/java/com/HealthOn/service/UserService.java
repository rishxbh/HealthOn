package com.HealthOn.service;

import com.HealthOn.dto.request.SignUpDtoRequest;
import com.HealthOn.dto.response.SignUpDtoResponse;
import com.HealthOn.model.User;

public interface UserService {
    SignUpDtoResponse saveUser(SignUpDtoRequest signUpDtoRequest);
}
