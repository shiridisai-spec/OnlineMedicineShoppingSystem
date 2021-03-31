package com.medicineshopping.demo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author shirdisai
 *
 */
@Entity //Entity is a group of states associated together in a single unit
@Table(name="medicine_cart") //Creates table with a table name
public class Cart {
	
	 @Id //Specifies primary key of entity
	 @Column(name="cart_id") //Names the column 
	 @NotNull(message="cartid cannot be null")
	 private String cartId;
	 private LocalDate dateOfOrder;
	 private String cartStatus;
	 @ManyToOne //Manytoone relationship
	 @JoinColumn(name="user_id",referencedColumnName = "user_id") //user_id is the primary key of User class and the foreign key of Cart class
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

	public String getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(String cartStatus) {
		this.cartStatus = cartStatus;
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
