package com.medicineshopping.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicineshopping.demo.constant.MedicineConstant;
import com.medicineshopping.demo.dto.SuccessMessageDTO;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;
import com.medicineshopping.demo.exceptions.ValidateException;
import com.medicineshopping.demo.service.MedicineSer;


@RestController
public class MedicineController {
	
	@Autowired
	MedicineSer medicineser;
	@PostMapping("addmedicine")
	public SuccessMessageDTO addMedicine(@Valid @RequestBody Medicine medicine, BindingResult br) throws ValidateException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		Medicine id=medicineser.addMedicine(medicine);
		return new SuccessMessageDTO(MedicineConstant.MEDICINE_ADDED + id);
	}
	
	@PutMapping("updatemedicine")
	public Medicine updateMedicine(@RequestBody Medicine medicine)
	{
		return medicineser.updateMedicine(medicine);
	}
	
	@DeleteMapping("deletemedicinebyid/{mid}")
	public void deleteMedicine(@PathVariable(name="mid") int medicineId)
	{
		medicineser.deleteMedicine(medicineId);
	}
	
	@GetMapping("getmedicinebyid/{mid}")
	public Medicine getMedicine(@PathVariable (name="mid") int medicineId) throws MedicineNotFoundException
	{
		return medicineser.getMedicineById(medicineId);
	}
	@GetMapping("getmedicinebycategory/{mcname}")
	public List getMedicinebyCategory(@PathVariable (name="mcname") String medicineCategory) throws MedicineNotFoundException
	{
		return medicineser.getAllMedicineByCategory(medicineCategory);
	}
	@GetMapping("getallmedicines")
	public List getAllMedicines(@RequestBody Medicine medicine)
	{
		return medicineser.getAllMedicine();
		
	}


}
