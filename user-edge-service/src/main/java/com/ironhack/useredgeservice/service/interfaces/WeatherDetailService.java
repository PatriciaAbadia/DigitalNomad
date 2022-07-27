package com.ironhack.useredgeservice.service.interfaces;

import com.ironhack.useredgeservice.controller.dto.WeatherDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface WeatherDetailService {


    List<WeatherDTO> findAll();


    WeatherDTO findByCitySeason(String citySeason);

    List<WeatherDTO> findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(String citySeason,
                          String feelWeather, String realWeather, String feelDamp, String isRainy);


}
