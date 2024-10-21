package com.example.CustomerIdentity.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class CustomerValidateDto {
    @NotNull(message = "firstName should not be null")
    @NotBlank(message = "firstName should not be blank")
    @Size(max=15,message = "firstName should be maximum 15 character")
    private String firstName;

    @NotNull(message = "lastName should not be null")
    @NotBlank(message = "lastName should not be blank")
    @Size(max=15,message = "lastName should be maximum 15 character")
    private String lastName;

    @NotNull(message = "Email should not be null")
    @NotBlank(message = "Email should not be blank")
    private String emailAddress;
}
