package com.iiht.security.service;

import java.util.List;

import com.iiht.security.model.Product;

public interface ProductService {
	
	List<Product> findAll();
	List<Product> findByCategory(String category);
	Product findById(int id);

}
