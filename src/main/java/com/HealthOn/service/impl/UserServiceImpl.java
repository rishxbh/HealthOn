package com.HealthOn.service.impl;

import com.HealthOn.dto.request.SignUpDtoRequest;
import com.HealthOn.dto.response.SignUpDtoResponse;
import com.HealthOn.exceptions.EmailAlreadyExistException;
import com.HealthOn.model.User;
import com.HealthOn.repo.UserRepository;
import com.HealthOn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    @Override
    public SignUpDtoResponse saveUser(SignUpDtoRequest signUpDtoRequest) throws EmailAlreadyExistException {
        if(findByEmail(signUpDtoRequest.getEmail())) {
            throw new EmailAlreadyExistException("This email address is already taken");
        }
        User user = User.builder().email(signUpDtoRequest.getEmail()).password(passwordEncoder.encode(signUpDtoRequest.getPassword())).role(signUpDtoRequest.getRole()).build();
        User result = userRepository.save(user);
        SignUpDtoResponse signUpDtoResponse = new SignUpDtoResponse();
        signUpDtoResponse.setEmail(result.getEmail());
        signUpDtoResponse.setRole(result.getRole());
        return signUpDtoResponse;
    }
    private boolean findByEmail(String email) {
        return userRepository.findById(email).isPresent();
    }
}
