package com.medicineshopping.demo.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

/**
 * @author shirdisai
 *
 */
public class CartDTO {
	
	@NotNull(message="cartid cannot be null")
	private String cartId;
	private LocalDate dateOfOrder;
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
	public CartDTO() {
		// TODO Auto-generated constructor stub
	}

}
