package com.medicineshopping.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="medicine_cart")
public class Cart {
	
	 @Id
	 @Column(name="cart_id")
	 private String cartId;
	 private LocalDate dateOfOrder;
	 @ManyToOne
	 @JoinColumn(name="user_id",referencedColumnName = "user_id")
	 private User user;
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public LocalDate getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(LocalDate dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Cart()
	{
		
	}
	 
}
