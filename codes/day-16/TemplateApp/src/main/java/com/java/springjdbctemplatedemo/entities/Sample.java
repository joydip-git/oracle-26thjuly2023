package com.java.springjdbctemplatedemo.entities;

public class Sample {
	private int productId;
	private String producName;
	private String productImage;

	public Sample() {
		// TODO Auto-generated constructor stub
	}

	public Sample(int productId, String producName, String productImage) {
		super();
		this.productId = productId;
		this.producName = producName;
		this.productImage = productImage;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProducName() {
		return producName;
	}

	public void setProducName(String producName) {
		this.producName = producName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
}
