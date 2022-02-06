package com.bilgeadam.odevarabaapp.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ArabaNotFoundException extends RuntimeException{
    public ArabaNotFoundException(String message) {
        super(message);
    }
}
