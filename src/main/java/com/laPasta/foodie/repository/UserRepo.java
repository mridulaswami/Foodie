package com.laPasta.foodie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laPasta.foodie.entity.User;

public interface UserRepo  extends JpaRepository<User, Long>{

}
