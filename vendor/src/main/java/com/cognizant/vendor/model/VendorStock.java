package com.cognizant.vendor.model;

import java.sql.Date;

public class VendorStock {
	private String productId;
	private String vendorId;
	private boolean stockInHand;
	private Date expectedDate;
	
	public VendorStock(String productId, String vendorId, boolean stockInHand, Date expectedDate) {
		super();
		this.productId = productId;
		this.vendorId = vendorId;
		this.stockInHand = stockInHand;
		this.expectedDate = expectedDate;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public boolean isStockInHand() {
		return stockInHand;
	}
	public void setStockInHand(boolean stockInHand) {
		this.stockInHand = stockInHand;
	}
	public Date getExpectedDate() {
		return expectedDate;
	}
	public void setExpectedDate(Date expectedDate) {
		this.expectedDate = expectedDate;
	}

	@Override
	public String toString() {
		return "VendorStock [productId=" + productId + ", vendorId=" + vendorId + ", stockInHand=" + stockInHand
				+ ", expectedDate=" + expectedDate + "]";
	}
}
