package com.laPasta.foodie.entity;

import java.util.ArrayList;
import java.util.List;

import com.laPasta.foodie.enums.Roles;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String address;
	
	private String phoneNumber;
	
	private Roles role;
	
	private boolean isAvailable; //for delivery boy only 
	
	@OneToMany(mappedBy ="user" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	private List<Restaurant> restaurant = new ArrayList<>();
	

}
