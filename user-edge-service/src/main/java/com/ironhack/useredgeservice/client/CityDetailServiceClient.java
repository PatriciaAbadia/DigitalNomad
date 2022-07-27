package com.ironhack.useredgeservice.client;

import com.ironhack.useredgeservice.controller.dto.CityDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@FeignClient("city-detail-service")
public interface CityDetailServiceClient {

    @GetMapping("/cities")
    List<CityDTO> findAll();

    @GetMapping("/cities/{city}")
    CityDTO findByCity(@PathVariable String city);


    @GetMapping("/cities/{Continent}")
    List<CityDTO> findByContinent(@RequestParam String continent);

    @GetMapping("/filtredCities")
    List<CityDTO> findByCostOfLifeLessThanAndSafetyIsAndInternetIs(@RequestParam BigDecimal costOfLife,
                   @RequestParam String safety, @RequestParam String internet);
}






