package com.laPasta.foodie.service;

import com.laPasta.foodie.dto.UserRequestdto;
import com.laPasta.foodie.dto.UserResponsedto;

public interface UserService {

//	 void saveUser(User user);
//
//	 void addrestaurant();

     UserResponsedto createUser(UserRequestdto request);
	
}
