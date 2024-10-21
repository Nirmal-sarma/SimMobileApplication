package com.example.CustomerAddress.exception;

import org.springframework.http.HttpStatus;

public class HitachiApiException extends RuntimeException{
    private HttpStatus httpStatus;
    private String message;

    public HitachiApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}
