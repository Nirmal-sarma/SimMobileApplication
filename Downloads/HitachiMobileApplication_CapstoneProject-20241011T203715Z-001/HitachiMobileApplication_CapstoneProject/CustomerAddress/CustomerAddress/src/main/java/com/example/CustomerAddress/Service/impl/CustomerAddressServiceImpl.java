package com.example.CustomerAddress.Service.impl;

import com.example.CustomerAddress.Dto.CustomerAddressDto;
import com.example.CustomerAddress.Repository.CustomerAddressRepository;
import com.example.CustomerAddress.Service.CustomerAddressService;
import com.example.CustomerAddress.entity.CustomerAddress;
import com.example.CustomerAddress.exception.HitachiApiException;
import com.example.CustomerAddress.util.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CustomerAddressServiceImpl implements CustomerAddressService {
    @Autowired
    CustomerAddressRepository customerAddressRepository;
    public static boolean isValidCity(String city) {

        String cityRegex = "^[a-zA-Z\\s]+$";
        Pattern pattern = Pattern.compile(cityRegex);
        Matcher matcher = pattern.matcher(city);

        return matcher.matches();
    }

    public CustomerAddressDto getAddress(Long addressId){
        CustomerAddress customerAddress=customerAddressRepository
                .findById(addressId).orElseThrow(()-> new RuntimeException("Address is not updated for the Customer"));

        return Mapper.mapToCustomerAddressDto(customerAddress);

    }

    public CustomerAddressDto updateAddress(CustomerAddressDto customerAddressDto){
       Long pinCode=customerAddressDto.getPincode();
       if(pinCode>=1000000 && pinCode<=9999999){
           throw new HitachiApiException(HttpStatus.OK,"PinCode should be 6 digits");
       }
       String Address=customerAddressDto.getAddress();
       if(Address.length()>25){
           throw new HitachiApiException(HttpStatus.OK,"Address should be maximum 25 character");
       }
       if(!isValidCity(customerAddressDto.getCity())){
            throw new HitachiApiException(HttpStatus.OK,"City should not contain special character");
       }
       CustomerAddress customerAddress=Mapper.mapToCustomerAddressEntity(customerAddressDto);

       CustomerAddress UpdatedCustomer =customerAddressRepository.save(customerAddress);
       return Mapper.mapToCustomerAddressDto(UpdatedCustomer);


    }
}
