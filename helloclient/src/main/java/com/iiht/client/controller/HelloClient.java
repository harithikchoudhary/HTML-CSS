package com.iiht.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class HelloClient {
	
	
	
	@Autowired
	RestTemplate template;
	
	
	@GetMapping
	public ResponseEntity<String> connect() {
		String url="http://localhost:8073/rest/service";
		ResponseEntity<String> response= template.getForEntity(url,  String.class);
	
		return ResponseEntity.ok(response.toString());
		
	}
	
	
	@GetMapping("/square/{x}")
	public ResponseEntity<ResponseEntity<Double>> connect2(@PathVariable double x) {
		String url="http://localhost:8073/rest/service/square/"+x;
		ResponseEntity<Double> response= template.getForEntity(url,  Double.class);
	
		return ResponseEntity.ok(response);
		
	}
	
	


}






//url="https://bored-api.appbrewery.com/random";

//String res = template.getForObject(url, String.class);