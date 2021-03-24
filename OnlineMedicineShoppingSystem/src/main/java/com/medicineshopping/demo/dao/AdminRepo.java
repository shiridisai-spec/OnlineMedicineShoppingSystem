package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicineshopping.demo.entity.ProductManagement;

public interface AdminRepo extends JpaRepository<ProductManagement,Integer>{

}
