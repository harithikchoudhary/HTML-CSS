package com.test.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readprops")
public class UseConfigController {
	
	@Value("${server.port.key}")
	String serverPort;
	
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping
	public String showProps() {
		return "port = "+serverPort + " App Name "+appName; 
	}
	
	
	
	

}
