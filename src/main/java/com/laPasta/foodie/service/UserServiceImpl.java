package com.laPasta.foodie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laPasta.foodie.entity.Restaurant;
import com.laPasta.foodie.entity.User;
import com.laPasta.foodie.repository.UserRepo;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserRepo userepo;


	@Override
	public void saveUser(User user) {
		
		userepo.save(user);
		
		
	}
	
	@Override
	public void addrestaurant() {
		
		User user = new User();
		
		user.setName("Mridula");
		
        User user1 = new User();
		
		user1.setName("Vivek");
		
        User user2 = new User();
		
		user2.setName("Rishita");
		
		Restaurant res = new Restaurant();
		
		res.setName("Bakington");
		
	    Restaurant res1 = new Restaurant();
		
		res1.setName("Cartel");
		
	    Restaurant res2 = new Restaurant();
		
		res2.setName("BCC");
		
		res2.setUser(user);
		res1.setUser(user);
		res.setUser(user1);
		
		
		user.getRestaurant().add(res2);
		user.getRestaurant().add(res1);	
		user1.getRestaurant().add(res);
		
		
		userepo.save(user);
		userepo.save(user1);
		
		
		
		
	}

}
