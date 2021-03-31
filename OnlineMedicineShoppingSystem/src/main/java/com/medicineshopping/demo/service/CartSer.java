package com.medicineshopping.demo.service;

import java.util.List;
import com.medicineshopping.demo.entity.Cart;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;

/**
 * @author shirdisai
 *
 */
public interface CartSer  {
	
	String confirmOrder(int userId) throws UserNotFoundException,CartException; 
	
	List<Cart> getOrders(int userId) throws UserNotFoundException,CartException; 
	
	
	
	
	

}
