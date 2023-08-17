package com.java.spingdemo.SpringApp;

public class Person {
	private int id;
	private String name;
	private double salary;
	private Address address;
	
	public Person() {
		super();
	}
	public Person(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.setAddress(address);
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}	
}
