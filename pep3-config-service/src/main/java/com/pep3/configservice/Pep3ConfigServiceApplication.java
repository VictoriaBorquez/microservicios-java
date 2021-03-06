package com.pep3.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Pep3ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Pep3ConfigServiceApplication.class, args);
	}

}
