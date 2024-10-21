package com.example.CustomerAddress.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddressDto {

    private Long addressId;

    @NotNull(message = "Address should not be null")
    @NotBlank(message = "Address should not be blank")
    private String address;

    @NotNull(message = "Address should not be null")
    @NotBlank(message = "Address should not be blank")
    private String city;

    @NotNull(message = "Address should not be null")
    @NotBlank(message = "Address should not be blank")
    private Long pincode;

    @NotNull(message = "Address should not be null")
    @NotBlank(message = "Address should not be blank")
    private String state;
}
