package com.ironhack.useredgeservice.client;

import com.ironhack.useredgeservice.controller.dto.WeatherDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@FeignClient("weather-detail-service")
public interface WeatherDetailsServiceClient {

    @GetMapping("/weathers")
    List<WeatherDTO> findAll();

    @GetMapping("/weathers/{citySeason}")
    WeatherDTO findByCitySeason(@PathVariable String citySeason);

    @GetMapping("/filtredWeathers")
    List<WeatherDTO> findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(@RequestParam String citySeason,
                                                                                       @RequestParam String feelWeather, @RequestParam String realWeather, @RequestParam String feelDamp, @RequestParam String isRainy);
    @GetMapping("/weathers/cities/{city}")
    List<WeatherDTO> findWeathersByCity(@PathVariable String city);

  }








