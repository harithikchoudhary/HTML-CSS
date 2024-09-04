package com.iiht.store.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.store.entity.Apple;

@Repository
public interface AppleRepository extends JpaRepository<Apple, Long> {
	

}
