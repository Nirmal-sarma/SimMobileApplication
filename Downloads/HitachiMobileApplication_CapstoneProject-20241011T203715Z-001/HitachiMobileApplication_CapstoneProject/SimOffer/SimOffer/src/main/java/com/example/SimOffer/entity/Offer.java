package com.example.SimOffer.entity;




import jakarta.persistence.*;
        import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
@Table(name="sim_offers")
public class Offer{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offer_id")
    private Long offerId;

    @Column(name = "call_qty")
    private Long callQuantity;

    @Column(name = "cost")
    private Long cost;

    @Column(name = "data_qty")
    private Long dataQuantity;

    @Column(name = "duration")
    private Long duration;

    @Column(name = "offer_name")
    private String offerName;

    @Column(name = "sim_id")
    private Long simId;
}
