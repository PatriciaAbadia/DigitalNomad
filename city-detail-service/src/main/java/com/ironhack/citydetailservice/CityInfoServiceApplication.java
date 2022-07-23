package com.ironhack.citydetailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CityInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityInfoServiceApplication.class, args);
	}

}
