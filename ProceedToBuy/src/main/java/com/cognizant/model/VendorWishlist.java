package com.cognizant.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class VendorWishlist {
	@Id
	@Column
	@GeneratedValue
	private String vendorWishlistId;
	@ManyToOne(targetEntity=Vendor.class)  
	@JoinColumn(name="vendorId", referencedColumnName = "id")
	private String vendorId;
	@Column
	private String productId;
	@Column
	private int quantity;
	@Column
	private Date dateAddedToWishlist;
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getDateAddedToWishlist() {
		return dateAddedToWishlist;
	}
	public void setDateAddedToWishlist(Date dateAddedToWishlist) {
		this.dateAddedToWishlist = dateAddedToWishlist;
	}
	
	@Override
	public String toString() {
		return "VendorWishlist [vendorId=" + vendorId + ", productId=" + productId + ", quantity=" + quantity
				+ ", dateAddedToWishlist=" + dateAddedToWishlist + "]";
	}
}
