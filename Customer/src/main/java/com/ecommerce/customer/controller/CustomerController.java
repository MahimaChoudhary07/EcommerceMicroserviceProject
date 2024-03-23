package com.ecommerce.customer.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.customer.entity.Customer;
import com.ecommerce.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getCustomer/{custId}")
	public Optional<Customer> getCustomer(@PathVariable("custId") Integer custId)
	{
		return this.customerService.getCustomer(custId);
	}
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return this.customerService.addCustomer(customer);
	}
	
	@GetMapping("/getAllCustomers")
	public Iterable<Customer> getallCustomer()
	{
		return this.customerService.getAllCutomers();
	}
	
	@DeleteMapping("/deleteCustomer/{custId}")
	public void deleteMapping(@PathVariable("custId") Integer custId)
	{
		this.customerService.deleteCusomter(custId);
	}
	
	@PutMapping
	public Customer updateCustomer(Integer custId,@RequestBody Customer customer)
	{
		return this.customerService.updateCustomer(custId, customer);
	}
	
}
