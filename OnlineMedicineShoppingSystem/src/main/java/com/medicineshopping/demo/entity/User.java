package com.medicineshopping.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


/**
 * @author shirdisai
 *
 */
@Entity //Entity is a group of states associated together in a single unit
@Table(name="medicine_user") //Creates table with a table name
public class User {
	
	@Id //Specifies primary key of entity
	@Column(name="user_id") //Names the column 
	@NotNull(message="userid cannot be null") //Specifies that the value cannot be null
	private int userId;
	private String userName;
	private String userAddress;
	@Pattern(regexp="[0-9]{10}")
	private long userPhno;
	private String userPassword;
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
	public String getUserName1() {
		return userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public User(int userId, String userName, String userAddress, long userPhno, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userPhno = userPhno;
		this.userPassword = userPassword;
	}
	public User()
	{
		
	}
	
}
