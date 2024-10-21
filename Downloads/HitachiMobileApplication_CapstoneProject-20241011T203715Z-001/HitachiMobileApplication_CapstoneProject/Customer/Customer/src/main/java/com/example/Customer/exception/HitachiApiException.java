package com.example.Customer.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class HitachiApiException extends RuntimeException{
    private HttpStatus httpStatus;
    private String message;

    public HitachiApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }
}