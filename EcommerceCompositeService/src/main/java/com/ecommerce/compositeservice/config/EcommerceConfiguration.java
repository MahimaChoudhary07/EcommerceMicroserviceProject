package com.ecommerce.compositeservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EcommerceConfiguration {
  
	@Value("${ecommerce-service.order-service.name}")
	private String orderService;

	public String getOrderService() {
		return orderService;
	}

	public void setOrderService(String orderService) {
		this.orderService = orderService;
	}

	@Override
	public String toString() {
		return "EcommerceConfiguration [orderService=" + orderService + "]";
	}	
	
}
