package com.example.CustomerIdentity.repository;

import com.example.CustomerIdentity.entity.CustomerIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<CustomerIdentity,Long> {
    public Optional<CustomerIdentity> findByEmailAddressAndDateOfBirth(String emailAddress, LocalDate dateOfBirth);
    public Optional<CustomerIdentity> findByEmailAddress(String EmailAddress);
}
