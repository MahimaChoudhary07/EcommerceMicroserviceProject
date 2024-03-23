package com.ecommerce.productservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.repos.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		return this.productRepository.save(product);
	}

	@Override
	public Optional<Product> getProduct(int productId) {
		return this.productRepository.findById(productId);
	}

	@Override
	public Iterable<Product> getAllProducts() {
		return this.productRepository.findAll();
	}

	@Override
	public Product updateProduct(Integer id, Product product) {
		  Optional<Product> existingProduct = getProduct(id);
	        if (existingProduct == null) {
	            return null;
	        }
	        existingProduct.get().setName(product.getName());
	        existingProduct.get().setPrice(product.getPrice());
	        existingProduct.get().setCategory(product.getCategory());
	        existingProduct.get().setQuantity(product.getQuantity());
	        return productRepository.save(existingProduct);
	}

	@Override
	public void deleteProduct(Integer id) {
		this.productRepository.deleteById(id);
	}

}
