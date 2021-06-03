package com.cognizant.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.model.Cart;
import com.cognizant.model.Vendor;
import com.cognizant.model.VendorWishlist;
import com.cognizant.repository.CartRepository;
import com.cognizant.repository.VendorWishlistRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ProductToBuyService {
	
	private static final Logger log = LoggerFactory.getLogger(ProductToBuyService.class);
	
	//@Autowired
	Cart cart;
	
	@Autowired
	CartRepository cartRepository;
	
	//@Autowired
	VendorWishlist vendorWishList;
	
	@Autowired
	VendorWishlistRepository vendorWishlistRepository;
	 
	@Autowired
	Vendor vendor;

	public Cart addProductToCart(String customerId, String productId, String zipcode, String deliveryDate) throws ParseException {
		log.info("addProductToCart method ProductToBuyService class");
		log.info("customerId="+customerId);
		log.info("productId="+productId);
		log.info("zipcode="+zipcode);
		log.info("deliveryDate="+deliveryDate);
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(deliveryDate);  
		cart = new Cart();
		cart.setProductId(productId);
		cart.setZipcode(zipcode);
		cart.setDeliveryDate(date1);
		cartRepository.save(cart);
		return cart;
	}

	public boolean addProductToWishlist(String customerId, String productId) {
		log.info("addProductToWishlist method ProductToBuyService class");
		try{
			vendorWishList = new VendorWishlist();
			vendorWishList.setProductId(productId);
			vendorWishList.setQuantity(1);
			vendorWishList.setDateAddedToWishlist(new Date());
			vendorWishlistRepository.save(vendorWishList);
		}catch(Exception e) {
			log.error(e+"");
			return false;
		}
		return true;
	}
	
}
