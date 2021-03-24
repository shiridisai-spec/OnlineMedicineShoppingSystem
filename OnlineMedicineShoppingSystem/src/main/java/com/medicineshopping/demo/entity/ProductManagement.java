package com.medicineshopping.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicine")
public class ProductManagement {
	@Id
	@GeneratedValue
	
	private int medicineId;
	private String medicineName;
	private String medicineType;
	private Date manufacturingDate;
	private Date expiryDate;
	private String medicineDescription;
	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getMedicineType() {
		return medicineType;
	}
	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getMedicineDescription() {
		return medicineDescription;
	}
	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}
	public ProductManagement(int medicineId, String medicineName, String medicineType, Date manufacturingDate,
			Date expiryDate, String medicineDescription) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineType = medicineType;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.medicineDescription = medicineDescription;
	}
	public ProductManagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductManagement [medicineId=" + medicineId + ", medicineName=" + medicineName + ", medicineType="
				+ medicineType + ", manufacturingDate=" + manufacturingDate + ", expiryDate=" + expiryDate
				+ ", medicineDescription=" + medicineDescription + "]";
	}
	
	
	
	
	
	

}