package com.medicineshopping.demo.service;

import java.util.List;

import com.medicineshopping.demo.dto.MedicineDTO;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;
import com.sun.el.stream.Optional;

@SuppressWarnings("unused")
public interface MedicineSer {
	
	//int addMedicine(MedicineDTO medicinedto);
	
	Medicine addMedicine(Medicine medicine);
	
	Medicine updateMedicine(Medicine medicine);
	
	void deleteMedicine(int medicineId);
	
	List<Medicine> getAllMedicine();
	
	Medicine getMedicineById(int medicineId) throws MedicineNotFoundException;
		
	List<Medicine> getAllMedicineByCategory(String medicineCategory);
	
	
	
	
	

}
