package com.medicineshopping.demo.dto;

public class PaymentDTO {
		
	private String cartId;
	
	private int userId;
	
	private String cardType;
	
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
