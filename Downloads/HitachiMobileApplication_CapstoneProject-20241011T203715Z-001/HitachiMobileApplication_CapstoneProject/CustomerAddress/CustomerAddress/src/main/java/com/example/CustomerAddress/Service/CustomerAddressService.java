package com.example.CustomerAddress.Service;

import com.example.CustomerAddress.Dto.CustomerAddressDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface CustomerAddressService {
    public CustomerAddressDto getAddress(Long addressId);
    public CustomerAddressDto updateAddress(CustomerAddressDto customerAddressDto);

}
