package com.ironhack.weatherdetailservice.service.interfaces;

import com.ironhack.weatherdetailservice.model.WeatherDetail;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface WeatherDetailService {

    WeatherDetail findByCitySeason(String citySeason);

}
