package com.medicineshopping.demo.controller;

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

import com.medicineshopping.demo.constant.CartConstant;
import com.medicineshopping.demo.dto.CartItemDTO;
import com.medicineshopping.demo.dto.SuccessMessageDTO;
import com.medicineshopping.demo.entity.CartItem;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.CartItemException;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;
import com.medicineshopping.demo.exceptions.ValidateException;
import com.medicineshopping.demo.service.CartItemSer;

/**
 * @author shirdisai
 *
 */
@RestController //Handles web Requests
public class CartItemController {
	
	@Autowired //Injects the object dependencies
	CartItemSer cartitemser;
	
	@PostMapping("addcartitem") // Maps the HTTP POST requests on the specific handler method
	public SuccessMessageDTO addcartitem(@Valid @RequestBody CartItemDTO cartitemdto, BindingResult br) throws ValidateException, CartException, MedicineNotFoundException, UserNotFoundException
	{
		if(br.hasErrors()) 
			throw new ValidateException(br.getFieldErrors());
		CartItem item=cartitemser.addCartItem(cartitemdto);
		return new SuccessMessageDTO(CartConstant.CART_ITEM_ADDED + item.getCartitemId());
	}
	
	@PutMapping("editcartitem/{cid}/{qty}") // Maps the HTTP PUT requests on the specific handler method
	public SuccessMessageDTO editcartitem(@PathVariable("cid")int cid,@PathVariable("qty") int qty) throws ValidateException, CartException, MedicineNotFoundException, CartItemException
	{
		
		@SuppressWarnings("unused") //Disables the compiler warning
		CartItem item=cartitemser.editCartItem(cid, qty);
		return new SuccessMessageDTO(CartConstant.CART_ITEM_EDITED + cid);
	}
	
	@DeleteMapping("deletecartitem/{cid}") // Maps the HTTP DELETE requests on the specific handler method
	public SuccessMessageDTO deletecartitem(@PathVariable("cid")int cid) throws ValidateException, CartException, MedicineNotFoundException, CartItemException
	{
		
		cartitemser.removeCartItem(cid);
		return new SuccessMessageDTO(CartConstant.CART_ITEM_DELETE + cid);
	}
	
	@GetMapping("getcartitem/{cid}")
	public SuccessMessageDTO getcartitem(@PathVariable("cid") String cid ) throws CartException
	{
		cartitemser.getCartItem(cid);
		return new SuccessMessageDTO(CartConstant.CARTITEM_GET + cid);		
	}
	
	
	

}
