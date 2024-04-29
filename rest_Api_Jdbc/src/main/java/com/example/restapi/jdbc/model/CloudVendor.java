package com.example.restapi.jdbc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
    
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAdress;
	private String vendorPhone;
	
	public CloudVendor() {
		super();
	}

	public CloudVendor(String vendorId, String vendorName, String vendorAdress, String vendorPhone) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAdress = vendorAdress;
		this.vendorPhone = vendorPhone;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAdress() {
		return vendorAdress;
	}

	public void setVendorAdress(String vendorAdress) {
		this.vendorAdress = vendorAdress;
	}

	public String getVendorPhone() {
		return vendorPhone;
	}

	public void setVendorPhone(String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}

   
   
}
