package com.santander.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication {

	public static void main(String[] args) {
		System.out.println("***  Hello World App 002***");
		
		boolean var = true;
		System.out.println("Var value: "+var);		
		
		SpringApplication.run(HelloApplication.class, args);
	}
}
