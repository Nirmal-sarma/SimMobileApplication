package com.example.CustomerIdentity.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Customer_Identity")
public class CustomerIdentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unique_id_number")
    private Long uniqueIdNumber;

    @Column(name = "date", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "email_Address", nullable = false)
    private String emailAddress;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "state")
    String state;
}
