package com.example.HitachiMobileApplication.HitachiMobile.dto;
import lombok.Getter;

import java.util.Date;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
/*
    * This class is used to create a custom error response
      when an exception is thrown.
 */
@Getter
@Setter
public class ErrorResponse{
    private Date timestamp;
    private String message;
    private String details;

    public ErrorResponse(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }
}


