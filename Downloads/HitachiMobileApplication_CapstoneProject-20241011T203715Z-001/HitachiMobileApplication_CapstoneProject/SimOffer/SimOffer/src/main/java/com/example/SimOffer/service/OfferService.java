package com.example.SimOffer.service;

import com.example.SimOffer.dto.OfferDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface OfferService {
    public ResponseEntity<String> getOffer(Long simId);
}
