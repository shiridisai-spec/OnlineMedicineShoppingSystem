package com.medicineshopping.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medicineshopping.demo.constant.CartConstant;
import com.medicineshopping.demo.constant.UserConstant;
import com.medicineshopping.demo.dao.CartRepo;
import com.medicineshopping.demo.dao.UserRepo;
import com.medicineshopping.demo.entity.Cart;
import com.medicineshopping.demo.entity.User;
import com.medicineshopping.demo.exceptions.CartException;
import com.medicineshopping.demo.exceptions.UserNotFoundException;

@Service("cartservice")
@Transactional
public class CartSerImpl implements CartSer {
	
	@Autowired
	private CartRepo cartrepo;
	@Autowired
	private UserRepo userrepo;
    
	@Override
	public String confirmOrder(int userId) throws UserNotFoundException, CartException {
		// TODO Auto-generated method stub
		 Optional<User> optuser=userrepo.findById(userId);
		    if(optuser.isEmpty())
		    {
		    	throw new UserNotFoundException(UserConstant.USER_NOT_FOUND);
		    }
		    Cart cart=cartrepo.getCart(userId, CartConstant.CART);
		    if(cart==null)
		    {
		    	throw new CartException(CartConstant.CART_EMPTY);
		    }
		    cart.setCartStatus(CartConstant.CART_ORDER_STATUS);
		    cartrepo.save(cart);
		    return cart.getCartId();
	}

	@Override
	public List<Cart> getOrders(int userId) throws UserNotFoundException, CartException {
		// TODO Auto-generated method stub
		Optional<User> optuser=userrepo.findById(userId);
	    if(optuser.isEmpty())
	    {
	    	throw new UserNotFoundException(UserConstant.USER_NOT_FOUND);
	    }
	    List<Cart> carts=cartrepo.getOrder(userId, CartConstant.CART_ORDER_STATUS);
	    if(carts.isEmpty())
	    {
	    	throw new CartException(CartConstant.ORDER_EMPTY);
	    }
		return carts;
	}

	
	
}
