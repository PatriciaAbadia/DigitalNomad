package com.ironhack.useredgeservice.service.interfaces;

import com.ironhack.useredgeservice.controller.dto.CityDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface CityDetailService {
    List<CityDTO> findAll();

    List<CityDTO> findByCostOfLifeLessThanAndSafetyIsAndInternetIs(BigDecimal costOfLife, String safety, String internet);

    CityDTO findByCity(String city);

    List<CityDTO> findByContinent(String continent);


}