package com.ecommerce.productservice.service;

import java.util.Optional;

import com.ecommerce.productservice.entity.Product;

public interface ProductService {

	Product addProduct(Product product);
	Optional<Product> getProduct(int productId);
    Iterable<Product> getAllProducts();	
    public Product updateProduct(Integer id, Product cart);
    public void deleteProduct(Integer id);
	
}
