package com.ecommerce.compositeservice.io;

import java.time.LocalDate;


public class Order {
	
	private Integer orderID;
    private Integer customer_id;
    private LocalDate orderDate;
    private String orderStatus;
    private String shippingAddress;
    private String billingAddress;
    private Double totalAmount;
    private String paymentMethod;
	public Integer getOrderID() {
		return orderID;
	}
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
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
	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", customer_id=" + customer_id + ", orderDate=" + orderDate
				+ ", orderStatus=" + orderStatus + ", shippingAddress=" + shippingAddress + ", billingAddress="
				+ billingAddress + ", totalAmount=" + totalAmount + ", paymentMethod=" + paymentMethod + "]";
	}
    
    
}
