package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.bridgelabz","com.bridgelabz.controller","com.bridgelabz.service"})
public class GreetingApp {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApp.class, args);
	}

}
