package com.medicineshopping.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author shirdisai
 *
 */
public class PaymentDTO {
		
	private String cartId;
	
	private int userId;
	@NotNull(message="cardType cannot be null")
	private String cardType;
	@Pattern(regexp="[A-Za-z0-9]{16}")
	private String cardNo;
	private double paymentamount;


	public String getCartId() {
		return cartId;
	}



	public void setCartId(String cartId) {
		this.cartId = cartId;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getCardType() {
		return cardType;
	}



	public void setCardType(String cardType) {
		this.cardType = cardType;
	}



	public String getCardNo() {
		return cardNo;
	}



	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}



	public double getPaymentamount() {
		return paymentamount;
	}



	public void setPaymentamount(double paymentamount) {
		this.paymentamount = paymentamount;
	}



	public PaymentDTO() {
		// TODO Auto-generated constructor stub
	}

}
