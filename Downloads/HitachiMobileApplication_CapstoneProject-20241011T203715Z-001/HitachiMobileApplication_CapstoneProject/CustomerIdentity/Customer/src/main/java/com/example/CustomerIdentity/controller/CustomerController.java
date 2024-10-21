package com.example.CustomerIdentity.controller;

import com.example.CustomerIdentity.Dto.CustomerDto;
import com.example.CustomerIdentity.Dto.CustomerValidateDto;
import com.example.CustomerIdentity.Dto.CustomerVerifiedDto;
import com.example.CustomerIdentity.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customerIdentity")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/address/call")
    public ResponseEntity<String> getVerified(@RequestBody CustomerVerifiedDto customerVerifiedDto){
        ResponseEntity<String> getVerification=customerService.getVeried(customerVerifiedDto);
        return getVerification;
    }

    @PostMapping("/address/validation")
    public ResponseEntity<String> getValidation(@RequestBody CustomerValidateDto customerValidateDto){
        ResponseEntity<String> Validation=customerService.getValidated(customerValidateDto);
        return Validation;
    }
}
