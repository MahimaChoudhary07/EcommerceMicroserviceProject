package com.ecommerce.cartservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	@GetMapping("/getCart/{cartId}")
	public Cart getCart(Integer id)
	{
		return this.cartService.getCartById(id);
	}

    @GetMapping("/getAllCart")
    public Iterable<Cart> getAllCart()
    {
    	return this.cartService.getAllCarts();
    }
    
    @PostMapping("/addCart")
    public Cart addCart(@RequestBody Cart cart)
    {
    	return this.cartService.createCart(cart);
    }
    
    @PutMapping("/updateCart/{id}")
    public Cart updateCart(@RequestBody Cart cart, @PathVariable("id") Integer id)
    {
    	return this.cartService.updateCart(id, cart);
    }
    
    @DeleteMapping("deleteCart")
    public void deleteCart(@PathVariable("id") Integer id)
    {
    	this.cartService.deleteCart(id);
    }
    
}	
