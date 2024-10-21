package com.example.HitachiMobileApplication.HitachiMobile.service;

import com.example.HitachiMobileApplication.HitachiMobile.dto.SimTermsDto;
import com.example.HitachiMobileApplication.HitachiMobile.dto.Simdto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public interface SimService {
    public ResponseEntity<String> register(Simdto simdto);
    public ResponseEntity<String> getSimDetails(Long simId);
    public ResponseEntity<String> TermAndCondition(Long simId, boolean isAccepted);
}
