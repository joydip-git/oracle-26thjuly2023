package com.java.entities;

public class Person implements Comparable<Person> {

	private int id;
	private String name;

	public Person() {
		super();
	}

	public Person(int id, String name) {		
		this.id = id;
		this.name = name;
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

	@Override
	public int compareTo(Person o) {
		// p1.CompareTo(p2);
		// this => current object (p1)
		// o => other object (p2)		
		if (this.id == o.id)
			return this.name.compareTo(o.name);
		else
			return Integer.compare(this.id, o.id);
	}
}