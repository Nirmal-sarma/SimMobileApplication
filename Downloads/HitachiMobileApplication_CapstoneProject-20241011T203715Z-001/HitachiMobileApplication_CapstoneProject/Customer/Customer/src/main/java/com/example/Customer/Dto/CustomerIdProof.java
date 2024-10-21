package com.example.Customer.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class CustomerIdProof {
    @NotNull(message = "idType should not be null")
    @NotBlank(message = "idType should not be blank")
    private String idType;

    @NotNull(message = "idType should not be null")
    @NotBlank(message = "idType should not be blank")
    private Long uniqueIdNumber;

    @NotNull(message = "Email should not be null")
    @NotBlank(message = "Email should not be blank")
    private String state;

    @NotNull(message = "firstName should not be null")
    @NotBlank(message = "firstName should not be blank")
    private String firstName;

    @NotNull(message = "lastname should not be null")
    @NotBlank(message = "lastname should not be blank")
    private String lastName;
}
