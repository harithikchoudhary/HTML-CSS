package com.iiht.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.jpa.entity.Product;
import com.iiht.jpa.exceptions.InvalidValueException;
import com.iiht.jpa.services.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping
	@RequestMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> createProduct(@RequestBody Product productReq) {

		Product newProduct = service.save(productReq);

		return new ResponseEntity<Product>(newProduct, HttpStatus.CREATED);
	}

	@GetMapping("/fetchAll")
	public ResponseEntity<List<Product>> fetchAll() {

		return ResponseEntity.status(HttpStatus.OK).body(service.fetchAll());

	}

	@GetMapping
	@RequestMapping(path = "/show/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {

		return ResponseEntity.ok(service.fetch(id));

		/*
		 * Optional<Product> product = Optional.ofNullable(service.fetch(id));
		 * 
		 * return product.map(ResponseEntity::ok)
		 * .orElse(ResponseEntity.notFound().build());
		 */

	}

	@DeleteMapping("/productdelete/{id}")
	public ResponseEntity<Product> deleteById(@PathVariable Long id) {

		return ResponseEntity.ok(service.deleteById(id));

	}

	@PutMapping("/update/{productId}")
	public ResponseEntity<Product> updateProduct(@PathVariable long productId, @RequestBody Product updatedProduct) {
		Product product = service.update(productId, updatedProduct);
		if (product != null) {
			return ResponseEntity.ok(product);
		} else {
			return null;
		}
	}
	
	
	@GetMapping("/test")
	public String message(String str){
		if(str == null) {
			throw new NullPointerException("value not provided");
		}
		else {
			return "hello..";
		}
	}

	
	@GetMapping("/tests")
	public String msg(String str) throws Exception{
		str = "abc";
		
		if(str == null) {
			throw new NullPointerException("Invalid Value");
		}
		boolean isNumeric = str.chars().anyMatch(x-> Character.isDigit(x));
		
		if(isNumeric)
			throw new InvalidValueException("Expected String founnd it");
		
		if(str.length()<8)
			throw new Exception("Length < 8 characters....");
		else
			return "Hello..";

	}
}
