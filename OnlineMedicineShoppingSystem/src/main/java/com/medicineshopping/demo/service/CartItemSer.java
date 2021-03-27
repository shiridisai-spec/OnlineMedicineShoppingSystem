package com.medicineshopping.demo.service;

import com.medicineshopping.demo.dto.CartItemDTO;
import com.medicineshopping.demo.entity.CartItem;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.CartItemException;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;

public interface CartItemSer {
	
	public CartItem addCartItem(CartItemDTO cartitemdto) throws CartException,MedicineNotFoundException;
	
	public CartItem editCartItem(int cartitemId,int quantity) throws CartItemException;
	
	public boolean removeCartItem(int cartitemId) throws CartItemException;
	
	
	
	

	
	
	
	
	
	
	

}
