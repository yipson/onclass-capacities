package com.pragma.onclass.capacities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories
@SpringBootApplication
public class OnclassCapacitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnclassCapacitiesApplication.class, args);
	}

}
