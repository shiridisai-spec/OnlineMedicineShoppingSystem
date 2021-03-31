package com.medicineshopping.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.CartItem;

/**
 * @author shirdisai
 *
 */
@Repository //Does all the database operations
public interface CartItemRepo extends JpaRepository<CartItem,Integer> {
	@Query("From CartItem ci where ci.cart.cartId=:cartid") //Declares finder queries directly on repository methods
	public List<CartItem> getCartItems(@Param("cartid") String cartId); //@Param Extracts the query parameters
	
	
	
	
	
	
	
}
