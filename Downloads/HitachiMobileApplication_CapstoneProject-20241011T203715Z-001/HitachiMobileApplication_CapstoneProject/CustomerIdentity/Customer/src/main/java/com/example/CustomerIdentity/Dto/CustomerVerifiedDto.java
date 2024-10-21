package com.example.CustomerIdentity.Dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CustomerVerifiedDto {
    @NotNull(message = "Date of birth should not be null")
    @NotBlank(message = "Date of birth should not be blank")
    private LocalDate dateOfBirth;

    @NotNull(message = "Email should not be null")
    @NotBlank(message = "Email should not be blank")
    private String emailAddress;
}
