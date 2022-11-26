package com.educando.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educando.SpringBoot.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long > {

	
	
}
