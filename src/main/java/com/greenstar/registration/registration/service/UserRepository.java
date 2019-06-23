package com.greenstar.registration.registration.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenstar.registration.registration.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	List<User> findByEmail(String email);
	//User findByEmail(String email);

}
