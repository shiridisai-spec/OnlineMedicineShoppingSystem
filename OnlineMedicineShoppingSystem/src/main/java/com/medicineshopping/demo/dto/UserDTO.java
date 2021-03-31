package com.medicineshopping.demo.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author shirdisai
 *
 */
public class UserDTO {
	
	@NotNull(message="userid cannot be null")
	private int userId;
	private String userName;
	private String userAddress;
	@Pattern(regexp="[0-9]{10}")
	private long userPhno;
	
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

	public UserDTO()
    {
    	
    }
}
