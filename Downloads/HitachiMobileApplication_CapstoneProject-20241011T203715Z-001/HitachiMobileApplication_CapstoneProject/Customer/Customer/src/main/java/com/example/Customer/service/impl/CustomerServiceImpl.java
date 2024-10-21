package com.example.Customer.service.impl;

import com.example.Customer.Dto.CustomerDto;
import com.example.Customer.Dto.CustomerIdProof;
import com.example.Customer.entity.Customer;
import com.example.Customer.exception.HitachiApiException;
import com.example.Customer.feign.SimDetailsFeignClient;
import com.example.Customer.feign.SimOfferFeignClient;
import com.example.Customer.repository.CustomerRepository;
import com.example.Customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    SimDetailsFeignClient simDetailsFeignClient;
    @Autowired
    SimOfferFeignClient simOfferFeignClient;

    public ResponseEntity<String> getValidated(CustomerIdProof customerIdProof){
        Optional<Customer> customer=customerRepository.findById(customerIdProof.getUniqueIdNumber());
        if(!customer.isPresent()){
//            throw new HitachiApiException(HttpStatus.BAD_REQUEST,"Customer doesn't exist with this UniqueIdNumber");
            return new ResponseEntity<>("Customer doesn't exist with this UniqueIdNumber", HttpStatus.BAD_REQUEST);
        }
        if(!customerIdProof.getIdType().equalsIgnoreCase(customer.get().getIdType())){
            return new ResponseEntity<>("Please enter the valid Id Type for Validation", HttpStatus.BAD_REQUEST);
        }
        if(!customerIdProof.getFirstName().equalsIgnoreCase(customer.get().getFirstName())){
            return new ResponseEntity<>("Please enter the valid first name", HttpStatus.BAD_REQUEST);
        }
        if(!customerIdProof.getLastName().equalsIgnoreCase(customer.get().getLastName())){
            return new ResponseEntity<>("Please enter the valid last name", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Customer has been Validated!!!",HttpStatus.OK);
    }

    public ResponseEntity<String> updateSimStatus(Long simId,boolean isAccepted){
        return simDetailsFeignClient.TermAndConditionCustomer(simId,isAccepted);
    }

    public ResponseEntity<String> getSimDetails(Long simId){
        ResponseEntity<String> simDetails= simDetailsFeignClient.getSimDetails(simId);
        if(simDetails.getBody().equalsIgnoreCase("No sim found with these simId")){
            return new ResponseEntity<>("No sim found with these simId",HttpStatus.BAD_REQUEST);
        }
        Optional<Customer> customer =customerRepository.findBySimId(simId);
        if(!customer.isPresent()){
            return new ResponseEntity<>("No user found with these simId",HttpStatus.BAD_REQUEST);
        }
        ResponseEntity<String> simOffer=simOfferFeignClient.addOffer(simId);
        return new ResponseEntity<>("SimDetail : " + simDetails.getBody() +
                "\n"  + "SimOffer : " + simOffer.getBody()
                +"\n"+"firstName : "+customer.get().getFirstName()
                +"\n" + "lastName : " + customer.get().getLastName()
                +"\n" + " Email : " + customer.get().getEmailAddress()
                +"\n" + "DateOfBirth : " +customer.get().getDateOfBirth(), HttpStatus.OK);


    }

}
