package com.iiht.store.entity;


import java.util.ArrayList;
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
public class Egg {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long eg_id;
	private int eg_price;
	private int eg_qty;
	
	
	@ElementCollection
	private List<String> products = new ArrayList<>();

}
