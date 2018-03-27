package com.santander.demo;

import org.apache.logging.log4j.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloApplication.class);


	public static void main(String[] args) {
		logger.info("***  Hello World App 003***");
		
		boolean var = true;
		logger.info("Var value: "+var);	
		
		SpringApplication.run(HelloApplication.class, args);
	}
}
