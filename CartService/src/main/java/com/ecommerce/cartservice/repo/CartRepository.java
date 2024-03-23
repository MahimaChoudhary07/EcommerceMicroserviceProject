package com.ecommerce.cartservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.cartservice.entity.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart,Integer>{

}
