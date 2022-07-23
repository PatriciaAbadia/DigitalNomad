package com.ironhack.citydetailservice.repository;

import com.ironhack.citydetailservice.model.CityInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityInfoRepository extends JpaRepository<CityInfo, String> {


}
