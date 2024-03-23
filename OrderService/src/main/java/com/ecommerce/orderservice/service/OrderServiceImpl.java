package com.ecommerce.orderservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.orderservice.controller.OrderController;
import com.ecommerce.orderservice.entity.Order;
import com.ecommerce.orderservice.repos.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	private Logger logger =LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Optional<Order> getOrder(int orderId) {
		return this.orderRepository.findById(orderId);
	}

	@Override
	public Order addOrder(Order order) {
		return this.orderRepository.save(order);
	}

	@Override
	public Iterable<Order> getAllOrder() {
		return this.orderRepository.findAll();
	}

	@Override
	public Order updateOrder(Integer id, Order order) {
		  Optional<Order> existingOrder = getOrder(id);
	        if (existingOrder == null) {
	            return null;
	        }
	        //existingOrder.get().setOrderDate(order.getOrderDate());
	       // existingOrder.get().setOrderStatus(order.getOrderStatus());
	        //existingOrder.get().setItems(order.getItems());
	        return orderRepository.save(existingOrder);
	}

	@Override
	public void deleteOrder(Integer id) {
		this.orderRepository.deleteById(id);
	}

	@Override
	public Order getOrderByCustId(Integer custId) {
		logger.info("getOrderByCustId method service exit");
		return this.orderRepository.findOrderByCustomerId(custId);
	}

}
