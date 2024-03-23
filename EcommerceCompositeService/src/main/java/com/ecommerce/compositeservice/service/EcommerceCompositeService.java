package com.ecommerce.compositeservice.service;

import org.springframework.http.ResponseEntity;

import com.ecommerce.compositeservice.io.Order;


public interface EcommerceCompositeService {

	ResponseEntity<Order> getOrderDetails(Integer customerId);
}
