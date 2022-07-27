package com.ironhack.useredgeservice.controller.interfaces;


import com.ironhack.useredgeservice.controller.dto.CityDTO;

import java.util.List;

public interface CityDetailController {
    List<CityDTO> findAll();
}
