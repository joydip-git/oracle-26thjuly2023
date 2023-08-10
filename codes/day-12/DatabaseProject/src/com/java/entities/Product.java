package com.java.entities;

public class Product {
	private int productId;
	private String productName;
	private String description;
	private double price;
	private Integer categoryId;

	// association (navigation) attribute
	private Category categoryInfo;

	public Product() {
		super();
	}

	public Product(int productId, String productName, String description, double price, Category category,
			Integer categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.categoryId = categoryId;
		this.categoryInfo = category;
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

	public Category getCategoryInfo() {
		return categoryInfo;
	}

	public void setCategoryInfo(Category categoryInfo) {
		this.categoryInfo = categoryInfo;
	}

	public Integer getCategoryId() {
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
				.append(this.categoryInfo != null ? this.categoryInfo.getCategoryName() : "NA")
				.toString();
	}
}

