package com.cognizant.repository;

import org.springframework.data.repository.CrudRepository;

import com.cognizant.model.Cart;

public interface CartRepository extends CrudRepository<Cart, String>{
}
