package com.ironhack.citydetailservice.service.interfaces;

import com.ironhack.citydetailservice.model.CityInfo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

public interface CityInfoService {

    CityInfo findByCity(String city);




}
