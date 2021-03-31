package com.medicineshopping.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

/**
 * @author shirdisai
 *
 */
@Entity //Entity is a group of states associated together in a single unit
@Table(name="medicine_cartitem") //Creates table with a table name
public class CartItem {
	
	@Id //Specifies primary key of entity
	@Column(name="cart_item_id") //Names the column
	@GeneratedValue(strategy=GenerationType.AUTO) //Autogeneration of values
	private int cartitemId;
	@ManyToOne //Manytoone relationship
	@JoinColumn(name="cart_id", referencedColumnName = "cart_id") //cart_id is the primary key of cart and foreign key of CartItem class
	private Cart cart;
	@ManyToOne //Manytoone relationship
	@JoinColumn(name="medicine_id",referencedColumnName = "medicine_id") //medicine_id is the primary key of Medicine class and foreign key of CartItem class
	private Medicine medicine;
	@Min(value=2)
	private int quantity;
	public int getCartitemId() {
		return cartitemId;
	}
	public void setCartitemId(int cartitemId) {
		this.cartitemId = cartitemId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Medicine getMedicine() {
		return medicine;
	}
	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CartItem()
	{
		
	}
	

}
