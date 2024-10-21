package com.example.Customer.service;

import com.example.Customer.Dto.CustomerDto;
import com.example.Customer.Dto.CustomerIdProof;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public interface CustomerService {
   public ResponseEntity<String> getValidated(CustomerIdProof customerIdProof);
   public ResponseEntity<String> updateSimStatus(Long simId,boolean isAccepted);
   public ResponseEntity<String> getSimDetails(Long simId);
}
