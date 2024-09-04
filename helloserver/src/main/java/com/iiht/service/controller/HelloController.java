package com.iiht.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloController {
	
	@GetMapping
	public String confirm() {
		return "connected......responding";
	}
	
	@GetMapping("/square/{x}")
	public double square(@PathVariable double x) {
		return  x * x;
	}


	/*
	 * @GetMapping("/factorial") public long factorial(@PathVariable int n) { if (n
	 * == 0 || n == 1) { return 1; } long result = 1; for (int i = 2; i <= n; i++) {
	 * result *= i; } return result; }
	 */

}
