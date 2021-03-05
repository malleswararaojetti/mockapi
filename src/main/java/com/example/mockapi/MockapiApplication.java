package com.example.mockapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MockapiApplication extends SpringBootServletInitializer {
		public static void main(String[] args) {
		SpringApplication.run(MockapiApplication.class, args);
	}

}
