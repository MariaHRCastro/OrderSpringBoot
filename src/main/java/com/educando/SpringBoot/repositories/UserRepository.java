package com.educando.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educando.SpringBoot.entities.User;

public interface UserRepository extends JpaRepository<User,Long > {

	
	
}
