package com.educando.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educando.SpringBoot.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long > {

	
	
}
