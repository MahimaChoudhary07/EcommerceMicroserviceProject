package com.ecommerce.productservice.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.productservice.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	Product save(Optional<Product> existingProduct);

}
