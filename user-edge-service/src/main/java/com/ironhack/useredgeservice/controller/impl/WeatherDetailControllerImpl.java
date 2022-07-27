package com.ironhack.useredgeservice.controller.impl;

import com.ironhack.useredgeservice.controller.dto.WeatherDTO;
import com.ironhack.useredgeservice.service.interfaces.WeatherDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class WeatherDetailControllerImpl {

    @Autowired
    private WeatherDetailService weatherDetailService;

    @GetMapping("/weathers")
    @ResponseStatus(HttpStatus.OK)
    public List<WeatherDTO> findAll() {
        return weatherDetailService.findAll();
    }
    @GetMapping("/weathers/{citySeason}")
    @ResponseStatus(HttpStatus.OK)
    public WeatherDTO findByCitySeason(@PathVariable String citySeason) {
        return weatherDetailService.findByCitySeason(citySeason);
    }
    @GetMapping("/filtredWeathers")
    @ResponseStatus(HttpStatus.OK)
    public List<WeatherDTO> findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(@RequestParam Optional<String> citySeason,
                                                                                                 @RequestParam Optional<String> feelWeather, @RequestParam Optional<String> realWeather,
                                                                                                 @RequestParam Optional<String> feelDamp, @RequestParam Optional<String> isRainy) {
        if (citySeason.isPresent() && feelWeather.isPresent() && realWeather.isPresent() && feelDamp.isPresent() && isRainy.isPresent()) {
            return weatherDetailService.findByCitySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(citySeason.get(),
                    feelWeather.get(), realWeather.get(), feelDamp.get(), isRainy.get());
        }
        return null;
    }


}
