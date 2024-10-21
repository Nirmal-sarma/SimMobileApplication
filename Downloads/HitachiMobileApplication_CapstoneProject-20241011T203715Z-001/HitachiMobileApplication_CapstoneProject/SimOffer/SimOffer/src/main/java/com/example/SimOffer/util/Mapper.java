package com.example.SimOffer.util;


import com.example.SimOffer.SimOfferApplication;
import com.example.SimOffer.dto.OfferDto;
import com.example.SimOffer.entity.Offer;

/*
    This class is used to map the entity to dto and vice versa
    for the user and product entity
 */
public class Mapper {

    public static OfferDto mapToOfferDto(Offer offer) {
        return SimOfferApplication.modelMapper().map(offer, OfferDto.class);
    }


    public static Offer mapToOfferEntity(OfferDto offerDto) {
        return SimOfferApplication.modelMapper().map(offerDto, Offer.class);
    }

}
