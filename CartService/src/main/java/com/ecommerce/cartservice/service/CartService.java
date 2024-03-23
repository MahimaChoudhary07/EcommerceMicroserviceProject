package com.ecommerce.cartservice.service;


import com.ecommerce.cartservice.entity.Cart;

public interface CartService {
	
    public Iterable<Cart> getAllCarts();
    public Cart getCartById(Integer id);
    public Cart createCart(Cart cart);
    public Cart updateCart(Integer id, Cart cart);
    public void deleteCart(Integer id);
}
