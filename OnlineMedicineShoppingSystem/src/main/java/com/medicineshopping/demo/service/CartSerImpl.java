package com.medicineshopping.demo.service;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicineshopping.demo.dao.CartRepo;
import com.medicineshopping.demo.entity.Cart;

public class CartSerImpl implements CartSer {
	
	//@Autowired
	//CartRepo cartrepo;

	//@Override
	//public Cart addCart(Cart cart) {
		// TODO Auto-generated method stub
	//	return cartrepo.save(cart);
	//}

	//@Override
	//public Cart getCartById(int cartId) {
		// TODO Auto-generated method stub
	//	return cartrepo.findUserByCartId(cartId);
	//}

	
	
	//@Override
	//public Cart updateCart(Cart cart) {
		// TODO Auto-generated method stub
	//	return cartrepo.save(cart);
	//}

//	@Override
//	public Cart validateUser(int cartId) throws IOException {
//		// TODO Auto-generated method stub
//		Cart cart=getCartById(cartId);
//		if(cart==null || cart.getCartItems().size()==0)
//		{
//			throw new IOException(cartId +" ");
//		}
//		updateCart(cart);
//		return getCartById(cartId);
	

}
