package com.educando.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educando.SpringBoot.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long > {

	
	
}
