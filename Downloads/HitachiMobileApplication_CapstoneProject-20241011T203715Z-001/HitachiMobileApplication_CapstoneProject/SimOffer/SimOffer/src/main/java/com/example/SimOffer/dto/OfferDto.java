package com.example.SimOffer.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OfferDto {

    private Long offerId;

    @NotNull(message = "Call quantity should not be null")
    @NotBlank(message = "Call quantity shouls not be blank")
    private Long callQuantity;

    @NotNull(message = "Cost should not be null")
    @NotBlank(message = "Cost should not be blank")
    private Long cost;

    @NotNull(message = "Data quantity should not be null")
    @NotBlank(message = "Data quantity should not be blank")
    private Long dataQuantity;

    @NotNull(message = "Duration should not be null")
    @NotBlank(message = "Duration should not be blank")
    private Long duration;

    @NotNull(message = "Offer Name should not be null")
    @NotBlank(message = "Offer Name should not be blank")
    private String offerName;

    @NotNull(message = "call quantity should not be null")
    @NotBlank(message = "call quantity should not be blank")
    private Long simId;
}
