package com.medicineshopping.demo.service;

import java.util.List;

import com.medicineshopping.demo.dto.PaymentDTO;
import com.medicineshopping.demo.entity.Payment;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.PaymentException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;

/**
 * @author shirdisai
 *
 */
public interface PaymentSer {
	
	public Payment addPayment(PaymentDTO paymentdto) throws CartException, UserNotFoundException; //Adds payment values
	
	List<Payment> getAllPayments() throws PaymentException;
	
	
	

}
