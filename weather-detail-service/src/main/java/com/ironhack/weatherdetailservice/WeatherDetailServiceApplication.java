package com.ironhack.weatherdetailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeatherDetailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDetailServiceApplication.class, args);
	}

}
