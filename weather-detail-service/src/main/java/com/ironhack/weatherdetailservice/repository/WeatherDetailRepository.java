package com.ironhack.weatherdetailservice.repository;

import com.ironhack.weatherdetailservice.model.WeatherDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherDetailRepository extends JpaRepository<WeatherDetail, String> {


}
