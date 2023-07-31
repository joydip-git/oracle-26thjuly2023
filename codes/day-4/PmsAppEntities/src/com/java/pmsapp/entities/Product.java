package com.java.pmsapp.entities;

public class Product {
	private int id;
	private String name;
	private double price;
	private String description;

	public Product() {
		super();
	}

	public Product(int id, String name, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object arg0) {
		if(this == arg0) {
			return true;
		}
		if(!(arg0 instanceof Product)) {
			return false;
		}
		Product other = (Product)arg0;
		if(!(this.getId()== other.getId()))
			return false;
		
		if(!(this.getName().equals(other.getName())))
			return false;
		
		if(!(this.getPrice()== other.getPrice()))
			return false;
		
		if(!(this.getDescription().equals(other.getDescription())))
				return false;
		
		return true;
		
	}

	@Override
	public String toString() {
		return name + ", " + price;
	}

}
