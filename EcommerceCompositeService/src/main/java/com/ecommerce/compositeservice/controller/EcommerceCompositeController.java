package com.ecommerce.compositeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.compositeservice.io.Order;
import com.ecommerce.compositeservice.service.EcommerceCompositeService;

@RestController
public class EcommerceCompositeController {

	@Autowired
	private EcommerceCompositeService ecommerceCompositeService;
	
	@GetMapping("/getOrderDetails")
	public ResponseEntity<Order> getOrderDetails(@RequestBody Integer customerId)
	{
//		List<String> services = this.discoveryClient.getServices();
//		System.out.print(services);
	   return this.ecommerceCompositeService.getOrderDetails(customerId);
	}
	
}
