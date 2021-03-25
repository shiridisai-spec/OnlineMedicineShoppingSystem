package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicineshopping.demo.entity.Cart;

public interface CartRepo extends JpaRepository<Cart,Integer> {

}
