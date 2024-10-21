package com.example.CustomerIdentity.service;

import com.example.CustomerIdentity.Dto.CustomerValidateDto;
import com.example.CustomerIdentity.Dto.CustomerVerifiedDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
   public ResponseEntity<String> getVeried(CustomerVerifiedDto customerVerifiedDto);
   public ResponseEntity<String> getValidated(CustomerValidateDto customerValidateDto);
}
