package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem,Integer> {
	
	
	
	
	
	
}
