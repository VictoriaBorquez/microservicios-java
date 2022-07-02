package com.pep3.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication//(scanBasePackages = {"controller","service","model", "repository"})
@EnableEurekaClient
//@EntityScan("com.pep3.producto.repository") //Esto mata todo
//@EnableJpaRepositories("com.pep3.producto.repository")
@ComponentScan(basePackages = "com.pep3.producto")
public class ProductoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductoServiceApplication.class, args);
	}

}
