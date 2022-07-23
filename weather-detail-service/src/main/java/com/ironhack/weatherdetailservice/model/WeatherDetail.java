package com.ironhack.weatherdetailservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WeatherDetail {
    @Id
    private String citySeason;

    private String city;
    private String season;
    private int feelTemperature;
    private int realTemperature;
    private int humidity;
    private int rain;

    public WeatherDetail() {
    }

    public WeatherDetail(String citySeason, String city, String season, int feelTemperature, int realTemperature, int humidity, int rain) {
        this.citySeason = citySeason;
        this.city = city;
        this.season = season;
        this.feelTemperature = feelTemperature;
        this.realTemperature = realTemperature;
        this.humidity = humidity;
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

    public int getFeelTemperature() {
        return feelTemperature;
    }

    public void setFeelTemperature(int feelTemperature) {
        this.feelTemperature = feelTemperature;
    }

    public int getRealTemperature() {
        return realTemperature;
    }

    public void setRealTemperature(int realTemperature) {
        this.realTemperature = realTemperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }
}
