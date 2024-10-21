package com.example.Customer.repository;

import com.example.Customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
public Optional<Customer> findBySimId(Long simId);
}
