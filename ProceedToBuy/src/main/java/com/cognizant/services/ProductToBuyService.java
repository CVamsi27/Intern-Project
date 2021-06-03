package com.cognizant.services;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.model.Cart;
import com.cognizant.model.Vendor;
import com.cognizant.model.VendorWishlist;
import com.cognizant.repository.CartRepository;
import com.cognizant.repository.VendorWishlistRepository;

@Service
public class ProductToBuyService {
	
	@Autowired
	Cart cart;
	
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	VendorWishlist vendorWishList;
	
	@Autowired
	VendorWishlistRepository vendorWishlistRepository;
	
	@Autowired
	Vendor vendor;

	public Cart addProductToCart(String customerId, String productId, String zipcode, Date deliveryDate) {
		cart.setProductId(productId);
		cart.setZipcode(zipcode);
		cart.setDeliveryDate(deliveryDate);
		cartRepository.save(cart);
		return cart;
	}

	public boolean addProductToWishlist(String customerId, String productId) {
		try{
			vendorWishList.setProductId(productId);
			vendorWishList.setQuantity(1);
			vendorWishList.setDateAddedToWishlist(new Date());
			vendorWishlistRepository.save(vendorWishList);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
}
