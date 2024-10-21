package com.example.Customer.controller;

import com.example.Customer.Dto.CustomerDto;
import com.example.Customer.Dto.CustomerIdProof;
import com.example.Customer.feign.SimDetailsFeignClient;
import com.example.Customer.feign.SimOfferFeignClient;
import com.example.Customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/validation")
    public ResponseEntity<String> getValidation(@RequestBody CustomerIdProof customerIdProof){
        return customerService.getValidated(customerIdProof);
    }

    @GetMapping("/CustomerSimDetail/{simId}")
    public ResponseEntity<String> getSimDetails(@PathVariable Long simId){
          return customerService.getSimDetails(simId);
    }

    @PostMapping("/{simId}")
    public ResponseEntity<String> updateSimStatus(@PathVariable Long simId,@RequestBody Map<String, Boolean> body){
        boolean isAccepted=body.get("isAccepted");
        return customerService.updateSimStatus(simId,isAccepted);
    }


}
