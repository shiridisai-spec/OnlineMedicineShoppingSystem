package com.medicineshopping.demo.service;

import java.util.Optional;

import com.medicineshopping.demo.entity.User;
import com.medicineshopping.demo.exceptions.UserNotFoundException;

public interface UserSer {
	
	User addUser(User user);
	
	User getUserById(int userId) throws UserNotFoundException;
	
	
	

}
