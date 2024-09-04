package com.iiht.store.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Milk {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long milk_id;
	private String milk_brand;
	private int milk_price;
	
	@ElementCollection
	private Set<String> products = new HashSet<>();

}
