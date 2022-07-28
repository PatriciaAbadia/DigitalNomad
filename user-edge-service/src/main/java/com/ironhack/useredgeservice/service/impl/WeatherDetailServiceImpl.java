package com.ironhack.useredgeservice.service.impl;

import com.ironhack.useredgeservice.client.CityDetailServiceClient;
import com.ironhack.useredgeservice.client.WeatherDetailsServiceClient;
import com.ironhack.useredgeservice.controller.dto.WeatherDTO;
import com.ironhack.useredgeservice.service.interfaces.WeatherDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;

@Service
public class WeatherDetailServiceImpl implements WeatherDetailService {
    @Autowired
    private CityDetailServiceClient cityDetailServiceClient;

    @Autowired
    private WeatherDetailsServiceClient weatherDetailsServiceClient;

    public List<WeatherDTO> findAll() {
        return weatherDetailsServiceClient.findAll();
    }

    public WeatherDTO findByCitySeason(String citySeason) {
        return weatherDetailsServiceClient.findByCitySeason(citySeason);
    }

    public List<WeatherDTO> findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(String citySeason,
                                      String feelWeather, String realWeather, String feelDamp, String isRainy) {
        return weatherDetailsServiceClient.findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(citySeason,
                feelWeather, realWeather, feelDamp, isRainy);
    }
    public List<WeatherDTO> findWeathersByCity(String city) {
        return weatherDetailsServiceClient.findWeathersByCity(city);
    }
}
