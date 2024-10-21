package com.example.HitachiMobileApplication.HitachiMobile.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sim_detail")
public class simDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sim_id")
    private Long simId;

    @Column(name = "service_number", nullable = false)
    private Long serviceNumber;

    @Column(name = "sim_number", nullable = false)
    private Long simNumber;

    @Column(name = "sim_status")
    private String simStatus;
}
