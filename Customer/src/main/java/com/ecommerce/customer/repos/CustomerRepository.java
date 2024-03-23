package com.ecommerce.customer.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.customer.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	Customer save(Optional<Customer> existingCustomer);

}
