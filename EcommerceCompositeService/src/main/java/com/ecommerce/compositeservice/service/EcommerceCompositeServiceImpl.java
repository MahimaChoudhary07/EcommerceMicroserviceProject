package com.ecommerce.compositeservice.service;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.compositeservice.handler.OrderHandler;
import com.ecommerce.compositeservice.io.Order;

@Service
public class EcommerceCompositeServiceImpl implements EcommerceCompositeService{

	@Autowired
	private OrderHandler orderHandler;
	@Override
	public ResponseEntity<Order> getOrderDetails(Integer customerId) {
		
		try {
			try {
				return this.orderHandler.orderDetails(customerId);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return null;
	}

}
