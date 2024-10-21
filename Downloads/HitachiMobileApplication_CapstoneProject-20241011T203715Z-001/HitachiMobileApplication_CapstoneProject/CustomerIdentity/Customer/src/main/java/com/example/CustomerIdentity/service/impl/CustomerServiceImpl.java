package com.example.CustomerIdentity.service.impl;

import com.example.CustomerIdentity.Dto.CustomerDto;
import com.example.CustomerIdentity.Dto.CustomerValidateDto;
import com.example.CustomerIdentity.Dto.CustomerVerifiedDto;
import com.example.CustomerIdentity.entity.CustomerIdentity;
import com.example.CustomerIdentity.repository.CustomerRepository;
import com.example.CustomerIdentity.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public static boolean isValidEmail(String email) {

        String emailRegex = "^[^@\\s]+@[^@\\s]+\\.[a-zA-Z]{2,3}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public ResponseEntity<String> getVeried(CustomerVerifiedDto customerVerifiedDto){
         Boolean isOkEmail=isValidEmail(customerVerifiedDto.getEmailAddress());
         if(isOkEmail == false){
             return new ResponseEntity<>("Email must contain one '@' followed by a domain with 2 or 3 characters",HttpStatus.BAD_REQUEST);
         }
         Optional<CustomerIdentity> customer=customerRepository.findByEmailAddressAndDateOfBirth(customerVerifiedDto.getEmailAddress(),customerVerifiedDto.getDateOfBirth());

         if(!customer.isPresent()){
             return new ResponseEntity<>("No request placed for you", HttpStatus.BAD_REQUEST);
         }
         return new ResponseEntity<>("Success!!! customer veried",HttpStatus.OK);
    }

     public ResponseEntity<String> getValidated(CustomerValidateDto customerValidateDto){
         String firstName=customerValidateDto.getFirstName();
         String lastName=customerValidateDto.getLastName();
         if(firstName.length()>15){
             return new ResponseEntity<>("firstName should not be greater than 15 character", HttpStatus.OK);
         }

         if(lastName.length()>15){
             return new ResponseEntity<>("lastname should not be greater than 15 character", HttpStatus.OK);
         }
         Optional<CustomerIdentity> customerIdentity=customerRepository.findByEmailAddress(customerValidateDto.getEmailAddress());
         if(!customerIdentity.isPresent()){
             return new ResponseEntity<>("No customer is present with these credentials",HttpStatus.OK);
         }
         if(customerIdentity.isPresent() &&
                 !customerIdentity.get().getFirstName().equalsIgnoreCase(firstName)
           && !customerIdentity.get().getLastName().equalsIgnoreCase(lastName)){
             return new ResponseEntity<>("InValid Details!!!",HttpStatus.OK);
         }
         return new ResponseEntity<>("Customer Details has been verified",HttpStatus.OK);
     }
}
