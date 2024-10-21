package com.example.SimOffer.controller;

import com.example.SimOffer.dto.OfferDto;
import com.example.SimOffer.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sim")
public class OfferController {
    @Autowired
    OfferService offerService;

    //userStory 2
    @GetMapping("/offer/{simId}")
    public ResponseEntity<String> addOffer(@PathVariable Long simId){

          ResponseEntity<String> getResponse=offerService.getOffer(simId);
          return getResponse;
    }
}
