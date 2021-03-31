package com.medicineshopping.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.Medicine;

/**
 * @author shirdisai
 *
 */
@Repository //A Class level annotation thet does all the operations related to the database
public interface MedicineRepo extends JpaRepository<Medicine,Integer>{
	
	
	
	
	
	
	
	
	
	

}
