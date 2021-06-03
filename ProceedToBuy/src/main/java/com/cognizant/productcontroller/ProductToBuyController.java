package com.cognizant.productcontroller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.model.Cart;
import com.cognizant.services.ProductToBuyService;

@RestController
public class ProductToBuyController {

	private static final Logger log = LoggerFactory.getLogger(ProductToBuyController.class);

	@Autowired
	ProductToBuyService ps;

	@PostMapping("/addProductToCart")
	public Cart addProductToCart(@RequestBody Map<String,Object> body) throws ParseException {
		log.info("addProductToCart method ProductToBuyController class");
		return ps.addProductToCart(body.get("customerId").toString(), body.get("productId").toString(), body.get("zipcode").toString(), body.get("deliveryDate").toString());
	}

	@PostMapping("/addProductToWishlist")
	public boolean addProductToWishlist(@RequestBody Map<String,Object> body) {
		log.info("addProductToWishlist method ProductToBuyController class");
		return ps.addProductToWishlist(body.get("customerId").toString(), body.get("productId").toString());
	}
}
