package com.medicineshopping.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart,String> {
	
	@Query("From Cart t where t.user.userId=:userid and t.cartStatus=:cstatus")
	public Cart getCart(@Param("userid")int userId, @Param("cstatus") String cartStatus);
	@Query("From Cart t where t.user.userId=:userid and t.cartStatus=:cstatus")
	public List<Cart> getOrder(@Param("userid")int userId,@Param("cstatus")String cartStatus);
	
	
	
	
	

}
