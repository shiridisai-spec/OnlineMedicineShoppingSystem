package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicineshopping.demo.entity.CartManagement;

public interface CartRepo extends JpaRepository<CartManagement,Integer> {

}
