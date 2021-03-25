package com.medicineshopping.demo.service;

import java.util.List;

import com.medicineshopping.demo.dto.MedicineDTO;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;
import com.sun.el.stream.Optional;

@SuppressWarnings("unused")
public interface MedicineSer {
	
	int addMedicine(MedicineDTO medicinedto);
	
	//Medicine updateMedicine(Medicine medicine);
	
	//void deleteMedicine(int medicineId);
	
	//List<Medicine> getAllMedicines();
	
	Medicine getMedicineById(int medicineId) throws MedicineNotFoundException;
	
	//java.util.Optional<Medicine> getMedicineByName(String medicineName);
	
	//List<Medicine> getAllMedicineByCategory(String medicineCategory);
	
	//List<Medicine> getAllMedicineByBrand(String medicineBrand);
	
	
	
	

}
