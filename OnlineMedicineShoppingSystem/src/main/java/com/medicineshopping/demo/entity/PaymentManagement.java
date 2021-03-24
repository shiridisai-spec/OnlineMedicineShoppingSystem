package com.medicineshopping.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class PaymentManagement {
	
	@Id
	@GeneratedValue
	private int userId;
	private int userName;
	private String CardType;
	private int cardNo;
	@ManyToMany(targetEntity=User.class)
	private List user;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserName() {
		return userName;
	}
	public void setUserName(int userName) {
		this.userName = userName;
	}
	public String getCardType() {
		return CardType;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public List getUser() {
		return user;
	}
	public void setUser(List user) {
		this.user = user;
	}
	public PaymentManagement(int userId, int userName, String cardType, int cardNo, List user) {
		super();
		this.userId = userId;
		this.userName = userName;
		CardType = cardType;
		this.cardNo = cardNo;
		this.user = user;
	}
	public PaymentManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PaymentManagement [userId=" + userId + ", userName=" + userName + ", CardType=" + CardType + ", cardNo="
				+ cardNo + ", user=" + user + "]";
	}
	
	

}
