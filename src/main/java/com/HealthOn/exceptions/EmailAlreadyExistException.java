package com.HealthOn.exceptions;

public class EmailAlreadyExistException extends IllegalArgumentException {
    public EmailAlreadyExistException(String message) {
        super(message);
    }
}
