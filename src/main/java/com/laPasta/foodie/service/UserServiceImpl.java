package com.laPasta.foodie.service;

import com.laPasta.foodie.dto.UserRequestdto;
import com.laPasta.foodie.dto.UserResponsedto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;


@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final PasswordEncoder passwordEncoder;


	@Override
	public UserResponsedto createUser(UserRequestdto request) {

	//	String password = passwordEncoder.

//        User userentity = User.builder().
//				name(request.getName()).id().email(request.getEmail()).password().phoneNumber(request.getPhoneNumber()).address(request.getAddress()).roleId().build()


		return null;
	}


}
