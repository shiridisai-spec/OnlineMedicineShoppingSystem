package com.medicineshopping.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;
import com.medicineshopping.demo.service.CartSer;

/**
 * @author shirdisai
 *
 */
@RestController //Maps the web requests
public class CartController {
	
	@Autowired //Injects the object dependencies
	CartSer cartser;
	
	//confirmcart
	@GetMapping("confirmcart/{uid}") //Maps the HTTP GET requests on the specific handler method
	public String confirmCart(@PathVariable("uid") int userId) throws UserNotFoundException, CartException
	{
		return cartser.confirmOrder(userId);
		
	}
	
	//vieworderbyuserid
	@SuppressWarnings("rawtypes") //Disbales compiler warnings
	@GetMapping("vieworder/{uid}") //Maps the HTTP GET requests on the specific handler method
	public List viewOrders(@PathVariable("uid") int userId) throws UserNotFoundException, CartException
	{
		return cartser.getOrders(userId);	
	}
	
	//viewcartitemsbycartid
	
	
	
	
}
