package com.medicineshopping.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.medicineshopping.demo.entity.Cart;

/**
 * @author shirdisai
 *
 */
@Repository //Does all the database operations
public interface CartRepo extends JpaRepository<Cart,String> {
	
	@Query("From Cart t where t.user.userId=:userid and t.cartStatus=:cstatus") //Declares finder queries directly on repository methods
	public Cart getCart(@Param("userid")int userId, @Param("cstatus") String cartStatus); //@Param Extracts the query parameters
	@Query("From Cart t where t.user.userId=:userid and t.cartStatus=:cstatus") //Declares finder queries directly on repository methods
	public List<Cart> getOrder(@Param("userid")int userId,@Param("cstatus")String cartStatus); //@Param Extracts the query parameters
	
	
	
	
	

}
