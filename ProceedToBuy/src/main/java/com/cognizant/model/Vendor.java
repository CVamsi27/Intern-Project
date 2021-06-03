package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Vendor {
	@Id
	@Column
	@GeneratedValue
	private String id;
	@Column
	private String name;
	@Column
	private float delivaryCharges;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDelivaryCharges() {
		return delivaryCharges;
	}
	public void setDelivaryCharges(float delivaryCharges) {
		this.delivaryCharges = delivaryCharges;
	}
	
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", delivaryCharges=" + delivaryCharges + "]";
	}
}
