package com.java.entities;
import java.util.Comparator;

public class Person {
	private String name;
	private int id;
	public Person() {
		super();
	}
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static Comparator<Person> IdComparator = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return Integer.compare(o1.getId(), o2.getId());
		}		
	};
	public static Comparator<Person> NameComparator = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	};
}
