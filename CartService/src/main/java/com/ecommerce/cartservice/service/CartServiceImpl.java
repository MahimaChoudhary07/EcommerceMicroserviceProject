package com.ecommerce.cartservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.cartservice.entity.Cart;
import com.ecommerce.cartservice.repo.CartRepository;

@Service
public class CartServiceImpl implements CartService{

	@Autowired
	private CartRepository cartRepository;

    public Iterable<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Cart getCartById(Integer id) {
        return cartRepository.findById(id).orElse(null);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(Integer id, Cart cart) {
        Cart existingCart = getCartById(id);
        if (existingCart == null) {
            return null;
        }
        existingCart.setItems(cart.getItems());
        existingCart.setUpdatedAt(cart.getUpdatedAt());
        existingCart.setCreatedAt(cart.getCreatedAt());
        existingCart.setStatus(cart.getStatus());
        existingCart.setTotalPrice(cart.getTotalPrice());
        return cartRepository.save(existingCart);
    }

    public void deleteCart(Integer id) {
        cartRepository.deleteById(id);
    }
}
