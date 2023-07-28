package com.java.outstandingpersonapp.entities;

public abstract class Person {
	String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		Person other = (Person) obj;
		if (!this.getName().equals(other.getName())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public abstract boolean isOutstanding();
}
