package com.ecommerce.orderservice.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.orderservice.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>{

	Order save(Optional<Order> existingOrder);
	
	Order findOrderByCustomerId(Integer custId);

}
