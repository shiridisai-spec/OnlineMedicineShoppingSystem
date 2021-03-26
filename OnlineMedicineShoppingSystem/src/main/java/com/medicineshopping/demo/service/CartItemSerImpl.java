package com.medicineshopping.demo.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medicineshopping.demo.constant.CartConstant;
import com.medicineshopping.demo.constant.MedicineConstant;
import com.medicineshopping.demo.dao.CartItemRepo;
import com.medicineshopping.demo.dao.CartRepo;
import com.medicineshopping.demo.dao.MedicineRepo;
import com.medicineshopping.demo.dto.CartItemDTO;
import com.medicineshopping.demo.entity.Cart;
import com.medicineshopping.demo.entity.CartItem;
import com.medicineshopping.demo.entity.Medicine;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.CartItemException;
import com.medicineshopping.demo.exceptions.MedicineNotFoundException;

@Service("cartitemservice")
@Transactional
public class CartItemSerImpl implements CartItemSer {

	@Autowired
	private CartItemRepo  cartitemrepo;
	@Autowired
	private CartRepo cartrepo;
	@Autowired
	private MedicineRepo medicinerepo;
	@Override
	public CartItem addCartItem(CartItemDTO cartitemdto) throws CartException, MedicineNotFoundException {
		// TODO Auto-generated method stub
		Optional<Cart> optcart=cartrepo.findById(cartitemdto.getCart_id());
		if(optcart.isEmpty()) throw new CartException(CartConstant.CART_NOT_FOUND);
		Cart cart=optcart.get();
		Optional<Medicine> optmedicine=medicinerepo.findById(cartitemdto.getMedicine_id());
		if(optmedicine.isEmpty()) throw new MedicineNotFoundException(MedicineConstant.MEDICINE_NOT_FOUND);
		CartItem cartitem=new CartItem();
		cartitem.setCart(cart);
		cartitem.setMedicine(optmedicine.get());
		cartitem.setQuantity(cartitemdto.getQuantity());
		CartItem addedItem=cartitemrepo.save(cartitem);
		return addedItem;
		
	}

	@Override
	public CartItem editCartItem(int cartitemId,int quantity) throws CartItemException{
		// TODO Auto-generated method stub
		Optional<CartItem> optcartitem=cartitemrepo.findById(cartitemId);
		if(optcartitem.isEmpty()) throw new CartItemException(CartConstant.CART_ITEM_NOT_FOUND);
		CartItem item=optcartitem.get();
		item.setQuantity(quantity);
		CartItem editedItem=cartitemrepo.save(item);
		return editedItem;
	}

	@Override
	public boolean removeCartItem(int cartitemId) throws CartItemException {
		// TODO Auto-generated method stub
		Optional<CartItem> optcartitem=cartitemrepo.findById(cartitemId);
		if(optcartitem.isEmpty()) throw new CartItemException(CartConstant.CART_ITEM_NOT_FOUND);
		CartItem item=optcartitem.get();
		cartitemrepo.delete(item);
		return true;
		
	}
	
}
