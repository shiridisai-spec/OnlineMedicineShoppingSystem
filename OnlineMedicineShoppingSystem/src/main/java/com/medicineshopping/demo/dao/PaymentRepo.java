package com.medicineshopping.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.Payment;

/**
 * @author shirdisai
 *
 */
@Repository //A class level annotaion that does all the database operations
public interface PaymentRepo extends JpaRepository<Payment,Integer>{

}
