package com.laPasta.foodie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laPasta.foodie.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
