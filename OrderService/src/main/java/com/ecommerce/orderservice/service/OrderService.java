package com.ecommerce.orderservice.service;

import java.util.Optional;

import com.ecommerce.orderservice.entity.Order;

public interface OrderService {

	Optional<Order> getOrder(int orderId);
	Order addOrder(Order order);
	Iterable<Order> getAllOrder();
	Order updateOrder(Integer id, Order order);
	void deleteOrder(Integer id);
	Order getOrderByCustId(Integer custId);
}
