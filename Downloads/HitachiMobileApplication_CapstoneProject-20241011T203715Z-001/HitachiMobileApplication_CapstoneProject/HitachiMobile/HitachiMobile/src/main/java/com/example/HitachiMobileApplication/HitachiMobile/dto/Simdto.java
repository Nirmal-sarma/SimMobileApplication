package com.example.HitachiMobileApplication.HitachiMobile.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Simdto {

    private Long simId;

    @NotNull(message = "Service Number cannot be null")
    private Long serviceNumber;

    @NotNull(message = "Sim Number cannot be null")
    private Long simNumber;

    private String simStatus;
}
