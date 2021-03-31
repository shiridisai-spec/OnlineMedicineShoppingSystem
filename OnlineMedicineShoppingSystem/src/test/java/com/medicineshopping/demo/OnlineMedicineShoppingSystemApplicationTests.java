package com.medicineshopping.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.medicineshopping.demo.dao.MedicineRepo;
import com.medicineshopping.demo.dao.UserRepo;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.entity.User;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;
import com.medicineshopping.demo.service.MedicineSerImpl;
import com.medicineshopping.demo.service.UserSerImpl;
@SpringBootTest
public class OnlineMedicineShoppingSystemApplicationTests {
    
	public static Optional<Medicine> optmedicine;
	@MockBean
	private MedicineRepo medicinerepo;
	@Autowired
	private MedicineSerImpl medicineser;
	@BeforeEach public void beforeeach()
	{
		optmedicine =Optional.of(new Medicine());
		Mockito.when(medicinerepo.findById(3)).thenReturn(optmedicine);
		Mockito.when(medicinerepo.findById(100)).thenThrow(MedicineNotFoundException.class); 
	}
	@Test
    public void testMedicineById_01() throws MedicineNotFoundException
    {
		assertNotNull(medicineser.getMedicineById(3));
    }
	@Test
	public void testMedicineById_02()
	{
		assertThrows(MedicineNotFoundException.class, ()->medicineser.getMedicineById(100));
	}
	
	
	public static Optional<User> optuser;
	@MockBean
	private UserRepo userrepo;
	@Autowired
    private UserSerImpl userser;
	@BeforeEach public void beforeeach2()
	{
		optuser=Optional.of(new User());
		Mockito.when(userrepo.findById(2)).thenReturn(optuser);
		Mockito.when(userrepo.findById(100)).thenThrow(UserNotFoundException.class);
	}
	@Test
	public void testUserById_03() throws UserNotFoundException
	{
		assertNotNull(userser.getUserById(2));
	}
	@Test
	public void testUserById_04()
	{
		assertThrows(UserNotFoundException.class, ()->userser.getUserById(100));
	}
	
}
