package com.ecommerce.orderservice.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order implements Serializable{

	   private static final long serialVersionUID = 1L;
	   
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer orderID;
	    private Integer customerId;
	    private LocalDate orderDate;
	    private String orderStatus;
	    private String shippingAddress;
	    private String billingAddress;
	    private Double totalAmount;
	    private String paymentMethod;
	    @OneToMany(mappedBy = "order",fetch = FetchType.EAGER)
	    private List<OrderItem> items;
	    
		public Integer getOrderID() {
			return orderID;
		}
		public void setOrderID(Integer orderID) {
			this.orderID = orderID;
		}
		public Integer getCustomer_id() {
			return customerId;
		}
		public void setCustomer_id(Integer customerId) {
			this.customerId = customerId;
		}
		public LocalDate getOrderDate() {
			return orderDate;
		}
		public void setOrderDate(LocalDate orderDate) {
			this.orderDate = orderDate;
		}
		public String getOrderStatus() {
			return orderStatus;
		}
		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}
		public String getShippingAddress() {
			return shippingAddress;
		}
		public void setShippingAddress(String shippingAddress) {
			this.shippingAddress = shippingAddress;
		}
		public String getBillingAddress() {
			return billingAddress;
		}
		public void setBillingAddress(String billingAddress) {
			this.billingAddress = billingAddress;
		}
		public Double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(Double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getPaymentMethod() {
			return paymentMethod;
		}
		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		public List<OrderItem> getItems() {
			return items;
		}
		public void setItems(List<OrderItem> items) {
			this.items = items;
		}
		@Override
		public String toString() {
			return "Order [orderID=" + orderID + ", customer_id=" + customerId+ ", orderDate=" + orderDate
					+ ", orderStatus=" + orderStatus + ", shippingAddress=" + shippingAddress + ", billingAddress="
					+ billingAddress + ", totalAmount=" + totalAmount + ", paymentMethod=" + paymentMethod + ", items="
					+ items + "]";
		}
	       
}
