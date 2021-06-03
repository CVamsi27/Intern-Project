package com.cognizant.productcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.model.Cart;
import com.cognizant.services.ProductToBuyService;

@RestController
public class ProductToBuyController {
	
	@Autowired
	ProductToBuyService ps;
	
	@PostMapping("/addProductToCart")
	public Cart addProductToCart(@PathVariable String customerId, @PathVariable String productId,
			@PathVariable String zipcode, @PathVariable Date deliveryDate) {
		return ps.addProductToCart(customerId,productId,zipcode,deliveryDate);
	}
	
	@PostMapping("/addProductToWishlist")
	public boolean addProductToWishlist(@PathVariable String customerId, @PathVariable String productId){
		return ps.addProductToWishlist(customerId,productId);
	}
}
