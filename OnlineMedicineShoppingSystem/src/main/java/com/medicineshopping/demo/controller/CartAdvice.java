package com.medicineshopping.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.medicineshopping.demo.dto.ErrorMessageDTO;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.CartItemException;

/**
 * @author shirdisai
 *
 */
@RestControllerAdvice //Handles excpeions with restful API
public class CartAdvice {
	
	@ExceptionHandler(CartItemException.class) //Handles the CartItemException class
	@ResponseStatus(HttpStatus.NOT_FOUND) //Sets the status code of HTTP response
	public ErrorMessageDTO handleNotItemException(CartItemException exception)
	{
		return new ErrorMessageDTO(exception.getMessage(),HttpStatus.NOT_FOUND.toString());
	}
	
	@ExceptionHandler(CartException.class) //Handles the CartException class
	@ResponseStatus(HttpStatus.NOT_FOUND) //Sets the status code of HTTP response
	public ErrorMessageDTO handleCartException(CartException exception)
	{
		return new ErrorMessageDTO(exception.getMessage(),HttpStatus.NOT_FOUND.toString());
	}
	
	

}
