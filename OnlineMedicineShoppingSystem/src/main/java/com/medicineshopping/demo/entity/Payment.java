package com.medicineshopping.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicine_payment")
public class Payment {
	
	@Id
	private String paymentId;
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "user_id")
	private User user;
	@ManyToOne
    @JoinColumn(name="cart_id",referencedColumnName = "cart_id")
	private Cart cart;
	private String cardType;
	private String cardNo;
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
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
	public Payment()
	{
		
	}

}
