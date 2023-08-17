package com.java.spingbootdemo.springbootrest.entities;

public class Product {
	private int productId;
	private String productName;
	private String description;
	private double price;
	private int categoryId;
	
	public Product() {
		super();
	}

	public Product(int productId, String productName, String description, double price, int categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.categoryId = categoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null)
			return false;

		if (this == arg0)
			return true;

		if (!(arg0 instanceof Product))
			return false;

		Product other = (Product) arg0;
		if (this.productId != other.productId)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 23;
		return this.productId * prime;
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append(this.productName)
				.append(", ")
				.append(price)
				.append(", ")
				.append(description)
				.toString();
	}
}
