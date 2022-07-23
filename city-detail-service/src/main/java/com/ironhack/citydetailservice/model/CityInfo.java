package com.ironhack.citydetailservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CityInfo {
    @Id
    private String city;
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
    @Column(name = "LGBTQ_friendly")
    private String LGBTQFriendly;

    private String englishSpeaking;
    private BigDecimal latitude;
    private BigDecimal longitude;

    private String nearBeach;
    private String photo;


    public CityInfo() {
    }

    public CityInfo(String city, String country, String continent, BigDecimal totalScore, BigDecimal costOfLife, int remoteWorkers, String internet, String fun, String nightlife, String safety, String lackOfCrime, String walkability, String racism, String foreignersFriendly, String freedomOfSpeech, String femaleFriendly, String LGBTQFriendly, String englishSpeaking, BigDecimal latitude, BigDecimal longitude, String nearBeach, String photo) {
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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