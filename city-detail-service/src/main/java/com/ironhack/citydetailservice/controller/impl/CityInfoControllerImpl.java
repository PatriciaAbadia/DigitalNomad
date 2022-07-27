package com.ironhack.citydetailservice.controller.impl;

import com.ironhack.citydetailservice.controller.interfaces.CityInfoController;
import com.ironhack.citydetailservice.model.CityInfo;
import com.ironhack.citydetailservice.repository.CityInfoRepository;
import com.ironhack.citydetailservice.service.interfaces.CityInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class CityInfoControllerImpl implements CityInfoController {

    @Autowired
    private CityInfoRepository cityInfoRepository;

    @Autowired
    private CityInfoService cityInfoService;

    @GetMapping("/cities")
    @ResponseStatus(HttpStatus.OK)
    public List<CityInfo> findAll() {
        return cityInfoRepository.findAll();
    }

    @GetMapping("/cities/{city}")
    @ResponseStatus(HttpStatus.OK)
    public CityInfo findByCity(@PathVariable String city) {
        return cityInfoService.findByCity(city);
    }

    @GetMapping("/cities/continent")
    @ResponseStatus(HttpStatus.OK)
    public List<CityInfo> findByContinent(@RequestParam Optional<String> continent) {
        if (!continent.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "A correct Continent is required");
        }
        return cityInfoRepository.findByContinent(continent.get());
    }

    //filter by internet, costOfLiving, fun, safety, femaleSafety, walkability and totalScore
    @GetMapping("/filtredCities")
    @ResponseStatus(HttpStatus.OK)
    public List<CityInfo> findByCostOfLifeLessThanAndSafetyIsAndInternetIs(@RequestParam Optional<BigDecimal> costOfLife,
                        @RequestParam Optional<String> safety, @RequestParam Optional<String> internet) {
        if (costOfLife.isPresent() && safety.isPresent() && internet.isPresent()) {
            return cityInfoRepository.findByCostOfLifeLessThanAndSafetyIsAndInternetIs(costOfLife.get(), safety.get(), internet.get());
        }
        return null;
    }
}
        /*
        if(!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findAll();
        }
        if( !costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByTotalScore(totalScore.get());
        }
        if( !costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByWalkability(walkability.get());
        }
        if( !costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByFemaleFriendly(femaleFriendly.get());
        }
        if( !costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByInternet(internet.get());
        }
        if( !costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByFun(fun.get());
        }
        if( !costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findBySafety(safety.get());
        }
        if( costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLife(costOfLife.get());
        }
        if( !costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByWalkabilityAndTotalScore(walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && !walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByFemaleFriendAndTotalScore(femaleFriendly.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByInternetAndTotalScore(internet.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByFunAndTotalScore(fun.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyAndTotalScore(safety.get(), totalScore.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeAndTotalScore(costOfLife.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByFemaleAndWalkability(femaleFriendly.get(), walkability.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByInternetAndWalkability(internet.get(), walkability.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByFunAndWalkability(fun.get(), walkability.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyAndWalkability(safety.get(), walkability.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeAndWalkability(costOfLife.get(), walkability.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByInternetAndFemaleFriendly(internet.get(), femaleFriendly.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByFunAndFemaleFriend(fun.get(), femaleFriendly.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyAndFemaleFriend(safety.get(), femaleFriendly.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeAndFemaleFriend(costOfLife.get(), femaleFriendly.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByFunAndInternet(fun.get(), internet.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyAndInternet(safety.get(), internet.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && !femaleFriendly.isPresent() && !walkability.isPresent() && !totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeAndInternet(costOfLife.get(), internet.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByFemaleFriendWalkabilityAndTotalScore(femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByInternetWalkabilityAndTotalScore(internet.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByFunWalkabilityAndTotalScore(fun.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyWalkabilityAndTotalScore(safety.get(), walkability.get(), totalScore.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && !femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeWalkabilityAndTotalScore(costOfLife.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByInternetFemaleFriendWalkabilityAndTotalScore(internet.get(),
                    femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByFunFemaleFriendlyWalkabilityAndTotalScore(fun.get(),
                    femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyFemaleFriendlyWalkabilityAndTotalScore(safety.get(),
                    femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && !internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeFemaleFriendlyWalkabilityAndTotalScore(costOfLife.get(),
                    femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByFunInternetFemaleFriendlyWalkabilityAndTotalScore(fun.get(),
                    internet.get(), femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyInternetFemaleFriendlyWalkabilityAndTotalScore(safety.get(),
                    internet.get(), femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && !fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeInternetFemaleFriendlyWalkabilityAndTotalScore(costOfLife.get(),
                    internet.get(), femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (!costOfLife.isPresent() && safety.isPresent() && fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findBySafetyFunInternetFemaleFriendlyWalkabilityAndTotalScore(safety.get(),
                    fun.get(), internet.get(), femaleFriendly.get(), walkability.get(), totalScore.get());
        }
        if (costOfLife.isPresent() && !safety.isPresent() && fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeFunInternetFemaleFriendlyWalkabilityAndTotalScore(costOfLife.get(),
                    fun.get(), internet.get(), femaleFriendly.get(), walkability.get(), totalScore.get());
        }

        if (costOfLife.isPresent() && safety.isPresent() && fun.isPresent() && internet.isPresent()
                && femaleFriendly.isPresent() && walkability.isPresent() && totalScore.isPresent()) {
            return cityInfoRepository.findByCostOfLifeLessThanSafetyFunInternetFemaleFriendlyWalkabilityAndTotalScoreGreaterThanEqual(findByCostOfLifeLessThanEqual(costOfLife.get()),
                    safety.get(), fun.get(), internet.get(), femaleFriendly.get(), walkability.get(), findByTotalScoreGreaterThanEqual(totalScore.get()));
        } */
        /*


        }
    }
*/


