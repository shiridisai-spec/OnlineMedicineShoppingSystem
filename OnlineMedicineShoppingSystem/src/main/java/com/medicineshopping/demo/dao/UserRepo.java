package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicineshopping.demo.entity.User;

public interface UserRepo extends JpaRepository<User,Integer>{

}
