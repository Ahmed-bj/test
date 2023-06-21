package com.project.GestionPersonne.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonneNotFoundException extends RuntimeException {
    public PersonneNotFoundException(String message) {
        super(message);
    }
}