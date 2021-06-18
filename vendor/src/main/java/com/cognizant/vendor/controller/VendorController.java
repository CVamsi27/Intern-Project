package com.cognizant.vendor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.vendor.VendorApplication;
import com.cognizant.vendor.model.Vendor;
import com.cognizant.vendor.service.VendorServiceImplementation;

@RestController
public class VendorController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VendorApplication.class);
	
	@Autowired
	private VendorServiceImplementation vendorService;
	
	@GetMapping(value="/getVendorDetails/{productId}")
	 public List<Vendor> getDetail(@PathVariable("productId") String productId)
	 {
		LOGGER.info("Get Vendor Details");
		return vendorService.getDetail(productId);
	 }
}
