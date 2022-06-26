package com.pep3.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class CalcularNuevosPreciosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcularNuevosPreciosServiceApplication.class, args);
	}

}
