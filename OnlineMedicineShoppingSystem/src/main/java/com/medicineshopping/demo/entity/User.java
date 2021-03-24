package com.medicineshopping.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String userAddress;
	private long userPhno;
	@SuppressWarnings("rawtypes")
	@ManyToMany(targetEntity=ProductManagement.class)
	private List med;
	@ManyToMany(targetEntity=CartManagement.class)
	private List cart;
	@ManyToMany(targetEntity=PaymentManagement.class)
	private List payment;
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
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public long getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(long userPhno) {
		this.userPhno = userPhno;
	}
	public List getMed() {
		return med;
	}
	public void setMed(List med) {
		this.med = med;
	}
	public List getCart() {
		return cart;
	}
	public void setCart(List cart) {
		this.cart = cart;
	}
	public List getPayment() {
		return payment;
	}
	public void setPayment(List payment) {
		this.payment = payment;
	}
	public User(int userId, String userName, String userAddress, long userPhno, List med, List cart, List payment) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPhno = userPhno;
		this.med = med;
		this.cart = cart;
		this.payment = payment;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAddress=" + userAddress + ", userPhno="
				+ userPhno + ", med=" + med + ", cart=" + cart + ", payment=" + payment + "]";
	}
	
	
	
}
