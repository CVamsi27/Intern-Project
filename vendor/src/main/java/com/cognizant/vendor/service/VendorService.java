package com.cognizant.vendor.service;

import java.util.List;

import com.cognizant.vendor.model.Vendor;
import com.cognizant.vendor.model.VendorStock;

public interface VendorService {
	
	List<Vendor> getAllVendor();
	List<VendorStock> getAllVendorStock();
	List<Vendor> getDetail(String productId);

}
