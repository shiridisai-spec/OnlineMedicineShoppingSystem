package com.medicineshopping.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicineshopping.demo.constant.CartConstant;
import com.medicineshopping.demo.constant.PaymentConstant;
import com.medicineshopping.demo.dto.PaymentDTO;
import com.medicineshopping.demo.dto.SuccessMessageDTO;
import com.medicineshopping.demo.entity.Payment;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;
import com.medicineshopping.demo.exceptions.ValidateException;
import com.medicineshopping.demo.service.PaymentSer;

@RestController
public class PaymentController {
	
	@Autowired
	PaymentSer paymentser;
	
	@PostMapping("addpayment")
	public SuccessMessageDTO addpayment(@Valid @RequestBody PaymentDTO paymentdto, BindingResult br) throws ValidateException, CartException, UserNotFoundException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		Payment item=paymentser.addPayment(paymentdto);
		return new SuccessMessageDTO(PaymentConstant.PAYMENT_DONE + item.getPaymentId());
	}
	
	

}
