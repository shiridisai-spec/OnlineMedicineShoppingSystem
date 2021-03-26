package com.medicineshopping.demo.dto;

import java.time.LocalDate;

public class MedicineDTO {
	
	private String medicineName;
	private String medicineBrand;
	private double medicineprice;
	private String medicineCategory;
	private LocalDate expiryDate;
	private String medicineDescription;
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getMedicineBrand() {
		return medicineBrand;
	}
	public void setMedicineBrand(String medicineBrand) {
		this.medicineBrand = medicineBrand;
	}
	public double getMedicineprice() {
		return medicineprice;
	}
	public void setMedicineprice(double medicineprice) {
		this.medicineprice = medicineprice;
	}
	public String getMedicineCategory() {
		return medicineCategory;
	}
	public void setMedicineCategory(String medicineCategory) {
		this.medicineCategory = medicineCategory;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getMedicineDescription() {
		return medicineDescription;
	}
	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}
	public MedicineDTO()
	{
		
	}

}
