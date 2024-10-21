package com.example.Customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="SimOffer")
public interface SimOfferFeignClient {
    @GetMapping("/api/sim/offer/{simId}")
    public ResponseEntity<String> addOffer(@PathVariable Long simId);
}
