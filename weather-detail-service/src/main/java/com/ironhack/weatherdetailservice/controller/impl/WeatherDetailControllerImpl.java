package com.ironhack.weatherdetailservice.controller.impl;

import com.ironhack.weatherdetailservice.model.WeatherDetail;
import com.ironhack.weatherdetailservice.repository.WeatherDetailRepository;
import com.ironhack.weatherdetailservice.service.interfaces.WeatherDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WeatherDetailControllerImpl {

    @Autowired
    private WeatherDetailRepository weatherDetailRepository;

    @Autowired
    private WeatherDetailService weatherDetailService;

    @GetMapping("/weathers")
    @ResponseStatus(HttpStatus.OK)
    public List<WeatherDetail> findAll() {
        return weatherDetailRepository.findAll();
    }
    @GetMapping("/weathers/{citySeason}")
    @ResponseStatus(HttpStatus.OK)
    public WeatherDetail findByCitySeason(@PathVariable String citySeason) {
        return weatherDetailService.findByCitySeason(citySeason);
    }
    @GetMapping("/filtredWeathers")
    @ResponseStatus(HttpStatus.OK)
    public List<WeatherDetail> findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(@RequestParam Optional<String> citySeason,
                         @RequestParam Optional<String> feelWeather, @RequestParam Optional<String> realWeather,
                         @RequestParam Optional<String> feelDamp, @RequestParam Optional<String> isRainy) {
        if (citySeason.isPresent() && feelWeather.isPresent() && realWeather.isPresent() && feelDamp.isPresent() && isRainy.isPresent()) {
            return weatherDetailRepository.findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(citySeason.get(),
                    feelWeather.get(), realWeather.get(), feelDamp.get(), isRainy.get());
        }
        return null;
    }
}
