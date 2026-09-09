package com.laPasta.foodie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.laPasta.foodie.entity.UserEntity;
import com.laPasta.foodie.service.UserService;

import org.springframework.transaction.annotation.Transactional;
@SpringBootTest
public class UserServiceT {
	
	@Autowired
	public UserService userservice;
	
	@Test
	@Transactional
	@Commit
	public void saveUserT() {
		
		try{
			UserEntity user1 = new UserEntity();
		
		
		user1.setName("Utkarsh");
		
		userservice.saveUser(user1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	@Transactional
	@Commit
	
	public void addrestaurantT() {
		
		userservice.addrestaurant();
	}
	
	

}
