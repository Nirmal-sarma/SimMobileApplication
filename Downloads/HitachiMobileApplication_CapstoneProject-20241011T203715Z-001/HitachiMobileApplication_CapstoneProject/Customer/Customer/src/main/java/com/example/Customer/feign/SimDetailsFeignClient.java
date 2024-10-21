package com.example.Customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="HitachiMobile")
public interface SimDetailsFeignClient {
    @GetMapping("/api/hitachi/{simId}")
    public ResponseEntity<String> getSimDetails(@PathVariable Long simId);

    @PostMapping("/api/hitachi/getCustomer/{simId}")
    public ResponseEntity<String> TermAndConditionCustomer(@PathVariable Long simId, @RequestBody boolean isAccepted);
}
