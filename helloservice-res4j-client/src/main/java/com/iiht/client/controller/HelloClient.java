package com.iiht.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/client")
public class HelloClient {
	
	
	
	@Autowired
	RestTemplate template;
	public final static String CLIENT_SERVICE ="clientservice";
	
	
	@GetMapping
	@CircuitBreaker(name=CLIENT_SERVICE, fallbackMethod ="callOnFail")
	public String callServer() {
		String url="http://localhost:8093/service";
		
		String output = template.getForObject(url, String.class);
		return output;
		//ResponseEntity<String> response= template.getForEntity(url,  String.class);
	
		//return ResponseEntity.ok(response.toString());
		
	}
	
	
	public String callOnFail(Exception e) {
		return "message from callOnFail()....";
	}
	
	
	/*
	 * @GetMapping("/square/{x}") public ResponseEntity<ResponseEntity<Double>>
	 * connect2(@PathVariable double x) { String
	 * url="http://localhost:8073/rest/service/square/"+x; ResponseEntity<Double>
	 * response= template.getForEntity(url, Double.class);
	 * 
	 * return ResponseEntity.ok(response);
	 * 
	 * }
	 */
	
	


}

