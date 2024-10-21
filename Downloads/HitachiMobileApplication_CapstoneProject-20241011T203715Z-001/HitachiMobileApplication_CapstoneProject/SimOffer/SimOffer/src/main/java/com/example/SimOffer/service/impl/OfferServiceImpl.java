package com.example.SimOffer.service.impl;

import com.example.SimOffer.dto.OfferDto;
import com.example.SimOffer.entity.Offer;
import com.example.SimOffer.exception.HitachiApiException;
import com.example.SimOffer.repository.OfferRepository;
import com.example.SimOffer.service.OfferService;
import com.example.SimOffer.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OfferServiceImpl implements OfferService {
    @Autowired
    OfferRepository offerRepository;

    public ResponseEntity<String> getOffer(Long simId){

        Optional<Offer> offer=offerRepository.findById(simId);
        if(!offer.isPresent()){
            return new ResponseEntity<>("No customer is present",HttpStatus.OK);
        }
        String responseBody=offer.get().getCallQuantity() + "calls + " +
                            offer.get().getDataQuantity() + "Gb for Rs. " +
                            offer.get().getCost()+ " , Validity : " +
                            offer.get().getDuration() + " days.";
          return new ResponseEntity<>(responseBody,HttpStatus.OK);
    }
}
