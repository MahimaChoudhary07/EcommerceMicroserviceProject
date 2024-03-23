package com.ecommerce.customer.service;

import java.util.Optional;

import com.ecommerce.customer.entity.Customer;

public interface CustomerService {

	Optional<Customer> getCustomer(Integer custId);
	Iterable<Customer> getAllCutomers();
	Customer addCustomer(Customer customer);
	void deleteCusomter(Integer custId);
	Customer updateCustomer(Integer custId, Customer customer);
}
