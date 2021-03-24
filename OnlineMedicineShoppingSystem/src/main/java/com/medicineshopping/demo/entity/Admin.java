package com.medicineshopping.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	@GeneratedValue
	private int adminId;
	private String adminName;
	@SuppressWarnings("rawtypes")
	@OneToMany(targetEntity=ProductManagement.class)
	private List med;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public List getMed() {
		return med;
	}
	public void setMed(List med) {
		this.med = med;
	}
	public Admin(int adminId, String adminName, List med) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.med = med;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", med=" + med + "]";
	}
	
	
	

}
