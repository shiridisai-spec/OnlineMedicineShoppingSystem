package com.medicineshopping.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medicineshopping.demo.constant.MedicineConstant;
import com.medicineshopping.demo.dto.MedicineDTO;
import com.medicineshopping.demo.dto.SuccessMessageDTO;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;
import com.medicineshopping.demo.exceptions.ValidateException;
import com.medicineshopping.demo.service.MedicineSer;


@RestController
public class MedicineController {
	
	@Autowired
	private MedicineSer medicineser;
	@PostMapping("addmedicine")
	public SuccessMessageDTO addMedicine(@Valid @RequestBody MedicineDTO medicinedto, BindingResult br) throws ValidateException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		int id=medicineser.addMedicine(medicinedto);
		return new SuccessMessageDTO(MedicineConstant.MEDICINE_ADDED + id);
	}
	@GetMapping("getmedicinebyid/{mid}")
	public Medicine getMedicine(@PathVariable (name="mid") int medicineId) throws MedicineNotFoundException
	{
		return medicineser.getMedicineById(medicineId);
	}
	

}
