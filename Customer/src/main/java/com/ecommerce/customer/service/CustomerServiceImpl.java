package com.ecommerce.customer.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.customer.entity.Customer;
import com.ecommerce.customer.repos.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepositry;
	
	@Override
	public Optional<Customer> getCustomer(Integer custId) {
		return this.customerRepositry.findById(custId);
	}

	@Override
	public Iterable<Customer> getAllCutomers() {
		return this.customerRepositry.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		return this.customerRepositry.save(customer);
	}

	@Override
	public void deleteCusomter(Integer custId) {
		this.customerRepositry.deleteById(custId);
	}

	@Override
	public Customer updateCustomer(Integer custId, Customer customer) {
		Optional<Customer> existingCustomer = getCustomer(custId);
	        if (existingCustomer == null) {
	            return null;
	        }
	        existingCustomer.get().setMobNo(customer.getMobNo());
	        existingCustomer.get().setName(customer.getName());
	        return customerRepositry.save(existingCustomer);
	}

}
