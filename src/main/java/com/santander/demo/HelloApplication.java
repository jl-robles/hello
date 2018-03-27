package com.santander.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {
	
	private static final Logger log = LoggerFactory.getLogger(HelloApplication.class);


	public static void main(String[] args) {
		log.info("***  Hello World App 003***");
		
		boolean var = true;
		log.info("Var value: "+var);		
		
		SpringApplication.run(HelloApplication.class, args);
	}
}
