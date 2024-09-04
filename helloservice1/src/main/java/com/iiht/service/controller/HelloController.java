package com.iiht.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rest")
public class HelloController {
	
	@GetMapping
	public String confirm() {
		return "connected......responding";
	}
	
	

}
