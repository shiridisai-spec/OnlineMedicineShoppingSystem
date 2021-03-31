package com.medicineshopping.demo.service;

import java.util.List;

import com.medicineshopping.demo.dto.CartItemDTO;
import com.medicineshopping.demo.entity.CartItem;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.CartItemException;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;

/**
 * @author shirdisai
 *
 */
public interface CartItemSer {
	
	public CartItem addCartItem(CartItemDTO cartitemdto) throws CartException,MedicineNotFoundException,UserNotFoundException; //Adds cartitems to the cart
	
	public CartItem editCartItem(int cartitemId,int quantity) throws CartItemException; //Updates the cart items 
	
	public boolean removeCartItem(int cartitemId) throws CartItemException; //Removes the cart items from cart
	
	public List<CartItem> getCartItem(String cartId)throws CartException; //Displays the cart items by cartid
	

	

	
	
	
	
	
	
	

}
