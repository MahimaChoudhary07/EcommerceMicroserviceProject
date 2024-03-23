package com.ecommerce.orderservice.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.service.OrderService;

@RestController
public class OrderController {

	private Logger logger =LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/getOrder/{orderId}")
	public Optional<Order> getOrder(@PathVariable("orderId") int orderId)
	{
		return this.orderService.getOrder(orderId);
	}
	
	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order order)
	{
		return this.orderService.addOrder(order);
	}
	
	@GetMapping("/getAllOrders")
	public Iterable<Order> getAllOrders()
	{
		return this.orderService.getAllOrder();
	}
	
	
	@GetMapping("/getOrdeByCustId")
	@Cacheable("order")
	public Order getOrdeByCustId(@RequestBody Integer custId)
	{
		logger.info("getOrderByCustId controller entry");
		return this.orderService.getOrderByCustId(custId);
	}
	
}
