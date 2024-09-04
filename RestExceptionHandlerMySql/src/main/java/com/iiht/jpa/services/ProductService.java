package com.iiht.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.jpa.entity.Product;
import com.iiht.jpa.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	//Get all products
	
	public List<Product> fetchAll(){
		
		return repository.findAll();
		
	}
	
	
	
	//Get Product By Id
	public Product fetch(long productId) {
		
		Optional<Product> optional = repository.findById(productId);
		if(optional.isPresent()) {
			return optional.get();
			}
		else
			return null;
		}
	
	
	
	//Create a product
	public Product save(Product product) {
		
		
	return repository.save(product);// methods are given by spring so we dont need to create data access objects layer(dao)
	}

	/*
	 * public Optional<Product> getProductById(Long id) { // TODO Auto-generated
	 * method stub return ; }
	 */
	
	
	//DeleteById
	public Product deleteById(long productId){
		
		
		Optional<Product> optional = repository.findById(productId);
		
		if(optional.isPresent()) {
			repository.deleteById(productId);
			return optional.get();
		}
		else {
			return null;
		}
	}	
	
	
	//Update 

	    public Product update(long productId, Product update) {
	        Optional<Product> optional = repository.findById(productId);
	        if (optional.isPresent()) {
	            Product existing = optional.get();
	            
	            existing.setDescription(update.getDescription());
	            existing.setPrice(update.getPrice());
	         
	            return repository.save(existing);
	        } else {

	            return null;
	        }
	    }
	
	
	
	
	
}
