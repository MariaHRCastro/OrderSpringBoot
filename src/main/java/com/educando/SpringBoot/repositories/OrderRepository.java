package com.educando.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educando.SpringBoot.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long > {

		
}
