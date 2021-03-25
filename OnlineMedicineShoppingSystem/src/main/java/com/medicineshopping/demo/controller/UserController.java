package com.medicineshopping.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicineshopping.demo.constant.MedicineConstant;
import com.medicineshopping.demo.constant.UserConstant;
import com.medicineshopping.demo.dto.SuccessMessageDTO;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.entity.User;
import com.medicineshopping.demo.exceptions.UserNotFoundException;
import com.medicineshopping.demo.exceptions.ValidateException;
import com.medicineshopping.demo.service.UserSer;

@RestController
public class UserController {
	
	@Autowired
	UserSer userser;
	@PostMapping("adduser")
	public SuccessMessageDTO addUser(@Valid @RequestBody User user,BindingResult br) throws ValidateException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		User id=userser.addUser(user);
		return new SuccessMessageDTO(UserConstant.USER_ADDED + id);
	}
	@GetMapping("getuserbyid/{uid}")
	public User  getUserById(@PathVariable(name="uid") int userId) throws UserNotFoundException
	{
		return userser.getUserById(userId);	
	}

}
