package com.iiht.store.entity;

import java.util.LinkedList;
import java.util.Queue;

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
public class Bread {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bread_id;
	private int bread_price;
	private int bread_qty;
	
	
	@ElementCollection
	private Queue<String> products = new LinkedList<>();
	

}
