package com.medicineshopping.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.User;

/**
 * @author shirdisai
 *
 */
@Repository //Does all the database operations
public interface UserRepo extends JpaRepository<User,Integer>{
	
	List<User> findAllusersByuserId(int userId); //Finds users by userid
	
	
}
