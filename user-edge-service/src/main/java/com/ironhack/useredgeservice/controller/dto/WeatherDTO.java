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

    public WeatherDTO() {
    }

    public WeatherDTO(String citySeason, String city, String season, String feelWeather, int feelTemperature, String realWeather, int realTemperature, String feelDamp, int humidity, String isRainy, int rain) {
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
}


