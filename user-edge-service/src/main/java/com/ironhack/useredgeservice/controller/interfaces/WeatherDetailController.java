package com.ironhack.useredgeservice.controller.interfaces;

import com.ironhack.useredgeservice.controller.dto.WeatherDTO;

import java.util.List;

public interface WeatherDetailController {

    List<WeatherDTO> findAll();
}
