package com.laPasta.foodie.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "restaurant")
@Getter
@Setter
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(nullable = false)
	private String address;

	private LocalTime openTime;

	private LocalTime closeTime;

	private Boolean isOpen = true;

	@ManyToOne
	@JoinColumn(name = "created_by")
	private UserEntity admin;

	@CreationTimestamp
	private LocalDateTime createdAt;

	@OneToMany(
			mappedBy = "restaurant",
			cascade = CascadeType.ALL,
			orphanRemoval = true
	)
	private List<FoodItem> foodItems = new ArrayList<>();

	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;

}
