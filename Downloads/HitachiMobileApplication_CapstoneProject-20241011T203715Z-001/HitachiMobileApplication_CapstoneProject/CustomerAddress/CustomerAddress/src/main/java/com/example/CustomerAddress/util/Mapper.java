package com.example.CustomerAddress.util;

import com.example.CustomerAddress.CustomerAddressApplication;
import com.example.CustomerAddress.Dto.CustomerAddressDto;
import com.example.CustomerAddress.entity.CustomerAddress;

public class Mapper {
    public static CustomerAddressDto mapToCustomerAddressDto(CustomerAddress customerAddress) {
        return CustomerAddressApplication.modelMapper().map(customerAddress, CustomerAddressDto.class);

    }


    public static CustomerAddress mapToCustomerAddressEntity(CustomerAddressDto customerAddressDto) {
        return CustomerAddressApplication.modelMapper().map(customerAddressDto, CustomerAddress.class);
    }
}
