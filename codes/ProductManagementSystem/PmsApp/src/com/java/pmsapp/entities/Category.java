package com.java.pmsapp.entities;

import java.util.StringJoiner;

public class Category {
	private int categoryId;
	private String categoryName;

	public Category() {
		super();
	}

	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (this == obj)
			return true;

		if (!(obj instanceof Category))
			return false;

		Category other = (Category) obj;
		if (this.categoryId != other.categoryId)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 23;
		return this.categoryId * prime;
	}

	@Override
	public String toString() {

		StringJoiner joiner = new StringJoiner(", ");
		joiner.add(Integer.toString(this.categoryId));		
		joiner.add(this.categoryName);

		return joiner.toString();

	}
}
