package com.test.feign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	Integer productID;
	String name;
	String category;
	String brand;
	double price;

}
