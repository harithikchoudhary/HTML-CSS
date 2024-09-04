package com.iiht.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloserviceRes4jClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceRes4jClientApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate newTemplate() {
		return new RestTemplate();
	}

}
