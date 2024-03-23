package com.ecommerce.orderservice.entity;

import java.io.Serializable;

import org.springframework.cache.annotation.Cacheable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem implements Serializable{

	   private static final long serialVersionUID = 1L;
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long orderItemId;

	    @ManyToOne
	    @JoinColumn(name = "order_id")
	    private Order order;
	    private Long product_id;
	    private Integer quantity;
	    private Double price;
	    
		public Long getOrderItemId() {
			return orderItemId;
		}
		public void setOrderItemId(Long orderItemId) {
			this.orderItemId = orderItemId;
		}
		public Order getOrder() {
			return order;
		}
		public void setOrder(Order order) {
			this.order = order;
		}
		public Long getProduct_id() {
			return product_id;
		}
		public void setProduct_id(Long product_id) {
			this.product_id = product_id;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "OrderItem [orderItemId=" + orderItemId + ", order=" + order + ", product_id=" + product_id
					+ ", quantity=" + quantity + ", price=" + price + "]";
		}
	       
}
