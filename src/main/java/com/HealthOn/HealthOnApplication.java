package com.HealthOn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.HealthOn.model")
@SpringBootApplication
public class HealthOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthOnApplication.class, args);
	}

}
