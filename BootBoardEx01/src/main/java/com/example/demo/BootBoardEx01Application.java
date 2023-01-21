package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan( basePackages = { "com.example.demo", "com.example.controller", "com.example.model1" })
public class BootBoardEx01Application {

	public static void main(String[] args) {
		SpringApplication.run(BootBoardEx01Application.class, args);
	}

}
