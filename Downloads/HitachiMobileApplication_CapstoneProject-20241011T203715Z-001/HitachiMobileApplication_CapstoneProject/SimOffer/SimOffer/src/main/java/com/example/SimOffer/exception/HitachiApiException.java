package com.example.SimOffer.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class HitachiApiException extends RuntimeException{
    private HttpStatus httpStatus;
    private String message;

    public HitachiApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}