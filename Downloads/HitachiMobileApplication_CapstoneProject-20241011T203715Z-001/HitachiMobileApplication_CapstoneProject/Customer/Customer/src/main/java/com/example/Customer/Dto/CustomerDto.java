package com.example.Customer.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CustomerDto {

    private Long uniqueIdNumber;

    private LocalDate dateOfBirth;

    @NotNull(message = "Email should not be null")
    @NotBlank(message = "Email should not be blank")
    private String emailAddress;

    @NotNull(message = "firstName should not be null")
    @NotBlank(message = "firstName should not be blank")
    private String firstName;

    @NotNull(message = "lastname should not be null")
    @NotBlank(message = "lastname should not be blank")
    private String lastName;

    @NotNull(message = "idType should not be null")
    @NotBlank(message = "idType should not be blank")
    private String idType;

    @NotNull(message = "customerAddressAddressId not be null")
    @NotBlank(message = "customerAddressAddressId should not be blank")
    private Long customerAddressAddressId;

    @NotNull(message = "simId should not be null")
    @NotBlank(message = "simId should not be blank")
    private Long simId;

    @NotNull(message = "state should not be null")
    @NotBlank(message = "state should not be blank")
    private String state;
}
