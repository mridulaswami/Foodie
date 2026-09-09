package com.laPasta.foodie.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(length= 20)
	private String phoneNumber;

	private String address;

	@ManyToOne
	@JoinColumn(name = "role_id")
	private Roles role;

	private Boolean enabled = true;

	@CreationTimestamp
	@Column(nullable = false , updatable = false)
	private LocalDateTime createdAt;




}
