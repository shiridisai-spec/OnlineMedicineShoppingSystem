package com.medicineshopping.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicineshopping.demo.constant.MedicineConstant;
import com.medicineshopping.demo.dao.MedicineRepo;
import com.medicineshopping.demo.dto.MedicineDTO;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;

@Service("medicineservice")
@Transactional
public class MedicineSerImpl implements MedicineSer{
	
	@Autowired
	MedicineRepo medicinerepo;

	@Override
	public int addMedicine(MedicineDTO medicinedto) {
		Medicine medicine=new Medicine();
		medicine.setMedicineBrand(medicinedto.getMedicineBrand());
		medicine.setMedicineCategory(medicinedto.getMedicineCategory());
		medicine.setMedicineName(medicinedto.getMedicineName());
		medicine.setMedicineDescription(medicinedto.getMedicineDescription());
		medicine.setMedicineStatus(MedicineConstant.AVAILABLE);
		medicine.setMedicineprice(medicinedto.getMedicineprice());
		//String strexpdate=medicinedto.getExpiryDate();
		//LocalDate ldt=LocalDate.parse(strexpdate,DateTimeFormatter.ofPattern("yyyy-M-d"));
		medicine.setExpiryDate(medicinedto.getExpiryDate());
		Medicine newmedicine=medicinerepo.save(medicine);
		// TODO Auto-generated method stub
		return newmedicine.getMedicineId();
	}

	@Override
	
	public Medicine getMedicineById(int medicineId) throws MedicineNotFoundException {
		// TODO Auto-generated method stub
		Optional <Medicine> optmedicine=medicinerepo.findById(medicineId);
		if(optmedicine.isPresent())
		{
			return optmedicine.get();
		}
		throw new MedicineNotFoundException(MedicineConstant.MEDICINE_NOT_FOUND);
	}

	
	

}
