package com.ironhack.citydetailservice.service.impl;

import com.ironhack.citydetailservice.model.CityInfo;
import com.ironhack.citydetailservice.repository.CityInfoRepository;
import com.ironhack.citydetailservice.service.interfaces.CityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CityInfoServiceImpl implements CityInfoService {

    @Autowired
    private CityInfoRepository cityInfoRepository;

    public CityInfo findByCity(String city) {
        CityInfo cityInfo = cityInfoRepository.findById(city)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "City not found. Invalid city name"));
        return cityInfo;
    }


}
