package com.ironhack.useredgeservice.controller.dto;

import java.math.BigDecimal;

public class WeatherDTO {
    private String citySeason;
    private String city;
    private String season;
    private String feelWeather;
    private int feelTemperature;
    private String realWeather;
    private int realTemperature;
    private String feelDamp;
    private int humidity;
    private String isRainy;
    private int rain;
    private String country;
    private String continent;
    private BigDecimal totalScore;
    private BigDecimal costOfLife;
    private int remoteWorkers;
    private String internet;
    private String fun;
    private String nightlife;
    private String safety;
    private String lackOfCrime;
    private String walkability;
    private String racism;
    private String foreignersFriendly;
    private String freedomOfSpeech;
    private String femaleFriendly;
    private String LGBTQFriendly;
    private String englishSpeaking;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String nearBeach;
    private String photo;

    public WeatherDTO() {
    }

    public WeatherDTO(String citySeason, String city, String season, String feelWeather, int feelTemperature, String realWeather, int realTemperature, String feelDamp, int humidity, String isRainy, int rain, String country, String continent, BigDecimal totalScore, BigDecimal costOfLife, int remoteWorkers, String internet, String fun, String nightlife, String safety, String lackOfCrime, String walkability, String racism, String foreignersFriendly, String freedomOfSpeech, String femaleFriendly, String LGBTQFriendly, String englishSpeaking, BigDecimal latitude, BigDecimal longitude, String nearBeach, String photo) {
        this.citySeason = citySeason;
        this.city = city;
        this.season = season;
        this.feelWeather = feelWeather;
        this.feelTemperature = feelTemperature;
        this.realWeather = realWeather;
        this.realTemperature = realTemperature;
        this.feelDamp = feelDamp;
        this.humidity = humidity;
        this.isRainy = isRainy;
        this.rain = rain;
        this.country = country;
        this.continent = continent;
        this.totalScore = totalScore;
        this.costOfLife = costOfLife;
        this.remoteWorkers = remoteWorkers;
        this.internet = internet;
        this.fun = fun;
        this.nightlife = nightlife;
        this.safety = safety;
        this.lackOfCrime = lackOfCrime;
        this.walkability = walkability;
        this.racism = racism;
        this.foreignersFriendly = foreignersFriendly;
        this.freedomOfSpeech = freedomOfSpeech;
        this.femaleFriendly = femaleFriendly;
        this.LGBTQFriendly = LGBTQFriendly;
        this.englishSpeaking = englishSpeaking;
        this.latitude = latitude;
        this.longitude = longitude;
        this.nearBeach = nearBeach;
        this.photo = photo;
    }

    public String getCitySeason() {
        return citySeason;
    }

    public void setCitySeason(String citySeason) {
        this.citySeason = citySeason;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getFeelWeather() {
        return feelWeather;
    }

    public void setFeelWeather(String feelWeather) {
        this.feelWeather = feelWeather;
    }

    public int getFeelTemperature() {
        return feelTemperature;
    }

    public void setFeelTemperature(int feelTemperature) {
        this.feelTemperature = feelTemperature;
    }

    public String getRealWeather() {
        return realWeather;
    }

    public void setRealWeather(String realWeather) {
        this.realWeather = realWeather;
    }

    public int getRealTemperature() {
        return realTemperature;
    }

    public void setRealTemperature(int realTemperature) {
        this.realTemperature = realTemperature;
    }

    public String getFeelDamp() {
        return feelDamp;
    }

    public void setFeelDamp(String feelDamp) {
        this.feelDamp = feelDamp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getIsRainy() {
        return isRainy;
    }

    public void setIsRainy(String isRainy) {
        this.isRainy = isRainy;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public BigDecimal getCostOfLife() {
        return costOfLife;
    }

    public void setCostOfLife(BigDecimal costOfLife) {
        this.costOfLife = costOfLife;
    }

    public int getRemoteWorkers() {
        return remoteWorkers;
    }

    public void setRemoteWorkers(int remoteWorkers) {
        this.remoteWorkers = remoteWorkers;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
    }

    public String getNightlife() {
        return nightlife;
    }

    public void setNightlife(String nightlife) {
        this.nightlife = nightlife;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }

    public String getLackOfCrime() {
        return lackOfCrime;
    }

    public void setLackOfCrime(String lackOfCrime) {
        this.lackOfCrime = lackOfCrime;
    }

    public String getWalkability() {
        return walkability;
    }

    public void setWalkability(String walkability) {
        this.walkability = walkability;
    }

    public String getRacism() {
        return racism;
    }

    public void setRacism(String racism) {
        this.racism = racism;
    }

    public String getForeignersFriendly() {
        return foreignersFriendly;
    }

    public void setForeignersFriendly(String foreignersFriendly) {
        this.foreignersFriendly = foreignersFriendly;
    }

    public String getFreedomOfSpeech() {
        return freedomOfSpeech;
    }

    public void setFreedomOfSpeech(String freedomOfSpeech) {
        this.freedomOfSpeech = freedomOfSpeech;
    }

    public String getFemaleFriendly() {
        return femaleFriendly;
    }

    public void setFemaleFriendly(String femaleFriendly) {
        this.femaleFriendly = femaleFriendly;
    }

    public String getLGBTQFriendly() {
        return LGBTQFriendly;
    }

    public void setLGBTQFriendly(String LGBTQFriendly) {
        this.LGBTQFriendly = LGBTQFriendly;
    }

    public String getEnglishSpeaking() {
        return englishSpeaking;
    }

    public void setEnglishSpeaking(String englishSpeaking) {
        this.englishSpeaking = englishSpeaking;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public String getNearBeach() {
        return nearBeach;
    }

    public void setNearBeach(String nearBeach) {
        this.nearBeach = nearBeach;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}


