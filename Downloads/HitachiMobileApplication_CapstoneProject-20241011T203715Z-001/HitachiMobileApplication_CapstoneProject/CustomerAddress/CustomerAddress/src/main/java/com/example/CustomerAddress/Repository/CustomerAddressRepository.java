package com.example.CustomerAddress.Repository;

import com.example.CustomerAddress.entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerAddressRepository extends JpaRepository<CustomerAddress,Long> {
}
