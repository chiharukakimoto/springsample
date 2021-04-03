package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSampleApplication {
	
    String home() {
        return "Hello World!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}

}
