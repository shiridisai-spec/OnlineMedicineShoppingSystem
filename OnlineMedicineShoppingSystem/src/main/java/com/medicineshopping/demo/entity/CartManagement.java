package com.medicineshopping.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartManagement {
	
	 @Id
	 @GeneratedValue
	 private int userId;
	 private String userName;
	 private String nameOfProducts;
	 private float price;
	 private float discount;
	 @ManyToMany(targetEntity=User.class)
	 private List user;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNameOfProducts() {
		return nameOfProducts;
	}
	public void setNameOfProducts(String nameOfProducts) {
		this.nameOfProducts = nameOfProducts;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public List getUser() {
		return user;
	}
	public void setUser(List user) {
		this.user = user;
	}
	public CartManagement(int userId, String userName, String nameOfProducts, float price, float discount, List user) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.nameOfProducts = nameOfProducts;
		this.price = price;
		this.discount = discount;
		this.user = user;
	}
	public CartManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CartManagement [userId=" + userId + ", userName=" + userName + ", nameOfProducts=" + nameOfProducts
				+ ", price=" + price + ", discount=" + discount + ", user=" + user + "]";
	}
	 
	 
     	 

}
