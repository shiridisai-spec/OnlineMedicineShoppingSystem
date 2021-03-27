package com.medicineshopping.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;
import com.medicineshopping.demo.service.CartSer;
@RestController
public class CartController {
	
	@Autowired
	CartSer cartser;
	
	//confirmcart
	@GetMapping("confirmcart/{uid}")
	public String confirmCart(@PathVariable("uid") int userId) throws UserNotFoundException, CartException
	{
		return cartser.confirmOrder(userId);
		
	}
	
	//vieworderbyuserid
	@SuppressWarnings("rawtypes")
	@GetMapping("vieworder/{uid}")
	public List viewOrders(@PathVariable("uid") int userId) throws UserNotFoundException, CartException
	{
		return cartser.getOrders(userId);	
	}
	
	//viewcartitemsbycartid
	
	
	
	
}
