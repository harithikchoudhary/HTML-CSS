package com.ust.security.model;

import jakarta.persistence.Entity;

@Entity
public class Product {
	
	private String name;
	private Long id;
	private Double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", id=" + id + ", price=" + price + "]";
	}

	public Product(String name, Long id, Double price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
	
	
	

}
