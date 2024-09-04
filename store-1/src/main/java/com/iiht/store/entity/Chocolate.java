package com.iiht.store.entity;

import java.util.LinkedList;
import java.util.List;

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
public class Chocolate {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long choc_id;
	private int choc_price;
	private String choc_name;
	
	
	@ElementCollection
	private List<String> products = new LinkedList<>();
}
