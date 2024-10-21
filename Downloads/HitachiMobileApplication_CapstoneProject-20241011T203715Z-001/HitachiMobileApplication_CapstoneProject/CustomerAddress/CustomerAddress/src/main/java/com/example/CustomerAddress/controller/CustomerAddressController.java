package com.example.CustomerAddress.controller;

import com.example.CustomerAddress.Dto.CustomerAddressDto;
import com.example.CustomerAddress.Service.CustomerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/update")
public class CustomerAddressController {
    @Autowired
    CustomerAddressService customerAddressService;

    @GetMapping("/address/{addressId}")
    public CustomerAddressDto getAddress(@PathVariable Long addressId){
        CustomerAddressDto customerAddressDto=customerAddressService.getAddress(addressId);
        return customerAddressDto;
    }
    @PostMapping("/address")
    public ResponseEntity<String> updateAddress(@RequestBody CustomerAddressDto customerAddressDto){
      CustomerAddressDto customerAddressDto1=customerAddressService.updateAddress(customerAddressDto);
      return new ResponseEntity<>("Updated Address is "
              +customerAddressDto1.getCity()+ ","+customerAddressDto1.getAddress(), HttpStatus.OK);
    }
}
