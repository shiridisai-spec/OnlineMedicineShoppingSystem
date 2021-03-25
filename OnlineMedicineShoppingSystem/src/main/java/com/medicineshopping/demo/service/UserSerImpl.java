package com.medicineshopping.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicineshopping.demo.dao.UserRepo;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.entity.User;
import com.medicineshopping.demo.exceptions.UserNotFoundException;

@Service("userservice")
@Transactional
public class UserSerImpl implements UserSer {
	
	@Autowired
	UserRepo userrepo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userrepo.save(user);
	}

	@Override
	public User getUserById(int userId) throws UserNotFoundException {
		// TODO Auto-generated method stub
		Optional <User> optuser=userrepo.findById(userId);
        if(optuser.isPresent())
        {
        	return optuser.get();
        }
		throw new UserNotFoundException();
	}

}
