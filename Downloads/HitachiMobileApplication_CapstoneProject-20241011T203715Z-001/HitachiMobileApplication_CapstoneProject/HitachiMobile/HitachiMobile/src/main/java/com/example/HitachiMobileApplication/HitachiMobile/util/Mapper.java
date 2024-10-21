package com.example.HitachiMobileApplication.HitachiMobile.util;

import com.example.HitachiMobileApplication.HitachiMobile.HitachiMobileApplication;
import com.example.HitachiMobileApplication.HitachiMobile.dto.Simdto;
import com.example.HitachiMobileApplication.HitachiMobile.entity.simDetail;
import com.example.HitachiMobileApplication.HitachiMobile.exception.HitachiApiException;
import com.example.HitachiMobileApplication.HitachiMobile.service.SimService;




/*
    This class is used to map the entity to dto and vice versa
    for the user and product entity
 */
public class Mapper {

    public static Simdto mapToSimDto(simDetail sim) {
        return HitachiMobileApplication.modelMapper().map(sim, Simdto.class);

    }


    public static simDetail mapToSimEntity(Simdto sim) {
        return HitachiMobileApplication.modelMapper().map(sim, simDetail.class);
    }

}
