package com.medicineshopping.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem,Integer> {
	@Query("From CartItem ci where ci.cart.cartId=:cartid")
	public List<CartItem> getCartItems(@Param("cartid") String cartId);
	
	
	
	
	
	
	
}
