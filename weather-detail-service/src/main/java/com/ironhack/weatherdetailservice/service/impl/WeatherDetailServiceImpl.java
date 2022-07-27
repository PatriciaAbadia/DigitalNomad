package com.ironhack.weatherdetailservice.service.impl;

import com.ironhack.weatherdetailservice.model.WeatherDetail;
import com.ironhack.weatherdetailservice.repository.WeatherDetailRepository;
import com.ironhack.weatherdetailservice.service.interfaces.WeatherDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class WeatherDetailServiceImpl implements WeatherDetailService {

    @Autowired
    private WeatherDetailRepository weatherDetailRepository;


    public WeatherDetail findByCitySeason(String citySeason) {
        WeatherDetail weatherDetail = weatherDetailRepository.findById(citySeason)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "City not found. Invalid city name"));
        return weatherDetail;
    }


}
