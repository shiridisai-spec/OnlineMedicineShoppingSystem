package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicineshopping.demo.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment,Integer>{

}
