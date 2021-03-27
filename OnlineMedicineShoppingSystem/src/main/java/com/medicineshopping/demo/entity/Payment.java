package com.medicineshopping.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicine_payment")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int paymentId;
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "user_id")
	private User user;
	@ManyToOne
    @JoinColumn(name="cart_id",referencedColumnName = "cart_id")
	private Cart cart;
	private String cardType;
	private String cardNo;
	@Column(name="paymentamount",nullable=true)
	private double paymentamount;
	
	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
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

	public double getPaymentamount() {
		return paymentamount;
	}

	public void setPaymentamount(double paymentamount) {
		this.paymentamount = paymentamount;
	}

	public Payment()
	{
		
	}

}
