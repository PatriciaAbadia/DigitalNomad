package com.ironhack.useredgeservice.controller.impl;

import com.ironhack.useredgeservice.controller.dto.CityDTO;
import com.ironhack.useredgeservice.controller.interfaces.CityDetailController;

import com.ironhack.useredgeservice.service.interfaces.CityDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class CityDetailControllerImpl implements CityDetailController {

    @Autowired
    private CityDetailService cityDetailService;


    @GetMapping("/cities")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDTO> findAll() {
        return cityDetailService.findAll();
    }

    @GetMapping("/cities/{city}")
    @ResponseStatus(HttpStatus.OK)
    public CityDTO findByCity(@PathVariable String city) {
        return cityDetailService.findByCity(city);
    }

    @GetMapping("/cities/continent")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDTO> findByContinent(@RequestParam Optional<String> continent) {
        if (!continent.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "A correct Continent is required");
        }
        return cityDetailService.findByContinent(continent.get());
    }

    @GetMapping("/filtredCities")
    @ResponseStatus(HttpStatus.OK)
    public List<CityDTO> findByCostOfLifeLessThanAndSafetyIsAndInternetIs(@RequestParam Optional<BigDecimal> costOfLife,
                           @RequestParam Optional<String> safety, @RequestParam Optional<String> internet) {
        if (costOfLife.isPresent() && safety.isPresent() && internet.isPresent()) {
            return cityDetailService.findByCostOfLifeLessThanAndSafetyIsAndInternetIs(costOfLife.get(), safety.get(), internet.get());
        }
        return null;
    }
}
