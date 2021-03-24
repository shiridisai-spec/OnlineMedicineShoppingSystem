package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicineshopping.demo.entity.PaymentManagement;

public interface PaymentRepo extends JpaRepository<PaymentManagement,Integer>{

}
