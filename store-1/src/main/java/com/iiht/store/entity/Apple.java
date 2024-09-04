package com.iiht.store.entity;

import java.util.Set;
import java.util.TreeSet;

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
public class Apple {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long app_id;
	private int app_price;
	private int app_qty;
	
	@ElementCollection
	private Set<String> products = new TreeSet<>();

}
