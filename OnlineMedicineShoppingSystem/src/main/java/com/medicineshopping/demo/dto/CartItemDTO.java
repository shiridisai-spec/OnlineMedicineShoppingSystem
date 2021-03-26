package com.medicineshopping.demo.dto;

public class CartItemDTO {
	
	private String cart_id;
	private int medicine_id;
	private int quantity;
	
	public String getCart_id() {
		return cart_id;
	}

	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}

	public int getMedicine_id() {
		return medicine_id;
	}

	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CartItemDTO() {
		// TODO Auto-generated constructor stub
	}

}
