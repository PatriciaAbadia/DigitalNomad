package com.ironhack.weatherdetailservice.repository;

import com.ironhack.weatherdetailservice.model.WeatherDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface WeatherDetailRepository extends JpaRepository<WeatherDetail, String> {

     List<WeatherDetail> findAll();

    List<WeatherDetail> findBySeasonAndFeelWeatherAndRealWeatherAndFeelDampAndIsRainy(String season,
                                  String feelWeather, String realWeather, String feelDamp, String isRainy);


    List<WeatherDetail> findByCity(String city);
}
