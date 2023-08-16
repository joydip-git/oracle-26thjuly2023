package com.java.pmsapp.entities;

public class Sample {
	private Integer productId;
	private String productName;
	private String productImage;
	public Sample() {
		
	}
	public Sample(Integer productId, String productName, String productImage) {
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}	
}
