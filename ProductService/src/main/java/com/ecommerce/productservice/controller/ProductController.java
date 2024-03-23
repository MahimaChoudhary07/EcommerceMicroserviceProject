package com.ecommerce.productservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.productservice.entity.Product;
import com.ecommerce.productservice.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getProduct/{productId}")
	public Optional<Product> getProduct(@PathVariable("productId") int productId)
	{
		return this.productService.getProduct(productId);
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return this.productService.addProduct(product);
	}
	
	@GetMapping("/getAllProducts")
	public Iterable<Product> getAllProducts()
	{
		return this.productService.getAllProducts();
	}
	
}
