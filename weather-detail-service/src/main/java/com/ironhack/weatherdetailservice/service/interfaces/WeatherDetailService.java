package com.ironhack.weatherdetailservice.service.interfaces;

import com.ironhack.weatherdetailservice.model.WeatherDetail;

import java.util.List;

public interface WeatherDetailService {

    WeatherDetail findByCitySeason(String citySeason);

    List<WeatherDetail> findWeathersByCity(String city);
}
