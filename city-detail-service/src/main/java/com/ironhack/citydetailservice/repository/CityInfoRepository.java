package com.ironhack.citydetailservice.repository;

import com.ironhack.citydetailservice.model.CityInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
@Repository
public interface CityInfoRepository extends JpaRepository<CityInfo, String> {


    List<CityInfo> findByContinent(String continent);

    List<CityInfo> findByCostOfLifeLessThanAndSafetyIsAndInternetIs(BigDecimal costOfLife, String safety, String internet);

    List<CityInfo> findAll();
}
