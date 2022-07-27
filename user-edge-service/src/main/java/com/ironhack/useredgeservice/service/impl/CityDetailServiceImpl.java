package com.ironhack.useredgeservice.service.impl;


import com.ironhack.useredgeservice.client.CityDetailServiceClient;
import com.ironhack.useredgeservice.client.WeatherDetailsServiceClient;
import com.ironhack.useredgeservice.controller.dto.CityDTO;
import com.ironhack.useredgeservice.controller.dto.WeatherDTO;
import com.ironhack.useredgeservice.service.interfaces.CityDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CityDetailServiceImpl implements CityDetailService {

    @Autowired
    private CityDetailServiceClient cityDetailServiceClient;

    @Autowired
    private WeatherDetailsServiceClient weatherDetailsServiceClient;

    /*
    public List<CityDTO> findAll() {
        List<CityDTO> cities = cityDetailServiceClient.findAll();
        List<WeatherDTO> weatherDetails = weatherDetailsServiceClient.findAll();
        for (CityDTO city : cities) {
            for (WeatherDTO weatherDetail : weatherDetails) {
                if (city.getCity().equals(weatherDetail.getCity())) {
                    city.getWeatherDetails().add(weatherDetail);
                }
                // Break the cicle if the 2 weathers are already added
                if(city.getWeatherDetails().size() >=2) break;
            }
        }
        return cities;
    } */
    public List<CityDTO> findAll() {
        return cityDetailServiceClient.findAll();
    }

    public List<CityDTO> findByCostOfLifeLessThanAndSafetyIsAndInternetIs(BigDecimal costOfLife, String safety, String internet) {
        return cityDetailServiceClient.findByCostOfLifeLessThanAndSafetyIsAndInternetIs(costOfLife, safety, internet);
    }
    public CityDTO findByCity(String city) {
        return cityDetailServiceClient.findByCity(city);
    }
    public List<CityDTO> findByContinent(String continent) {
        return cityDetailServiceClient.findByContinent(continent);
    }
}
