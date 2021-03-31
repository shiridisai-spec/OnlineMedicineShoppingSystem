package com.medicineshopping.demo.controller;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.medicineshopping.demo.constant.UserConstant;
import com.medicineshopping.demo.dto.ErrorMessageDTO;
import com.medicineshopping.demo.exceptions.UserNotFoundException;

/**
 * @author shirdisai
 *
 */
@RestControllerAdvice //Handles excpeions with restful API
public class UserAdvice {
	
	@ExceptionHandler(UserNotFoundException.class) //Handles the UserNotFoundException class
	@ResponseStatus(HttpStatus.NOT_FOUND) //Sets the status code of HTTP response
	public ErrorMessageDTO handleNotFoundException(UserNotFoundException exception)
	{
		return new ErrorMessageDTO(UserConstant.USER_NOT_FOUND,HttpStatus.NOT_FOUND.toString());
	}
	
	

}
