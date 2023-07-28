package com.java.outstandingpersonapp.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java.outstandingpersonapp.entities.*;

public class App {

	public static void main(String[] args) {

		/*
		 * Professor p1 = new Professor("anil", 6); Professor p2 = new Professor("anil",
		 * 6); //p1==p2 if (p1.equals(p2)) { System.out.println("same"); } else
		 * System.out.println("not same");
		 */

		/*
		 * Person[] people = new Person[2]; Scanner sc = new Scanner(System.in);
		 * 
		 * for (int i = 0; i < people.length; i++) { Professor p = new Professor();
		 * 
		 * System.out.print("enter name: "); p.setName(sc.next());
		 * 
		 * System.out.print("enter books published: ");
		 * p.setNoOfBooksPublished(sc.nextInt());
		 * 
		 * boolean isPresent = false; /* if (i > 0) { for (Person person : people) { if
		 * (person != null) { if (person.getName().equals(p.getName())) { if (person
		 * instanceof Professor) { Professor prof = (Professor) person; if
		 * (prof.getNoOfBooksPublished() == p.getNoOfBooksPublished()) { isPresent =
		 * true; break; } } } } } }
		 * 
		 * if (i > 0) { for (Person person : people) { if (person != null) { if
		 * (person.equals(p)) { isPresent = true; break; } } } } if (!isPresent) {
		 * people[i] = p; } } sc.close(); int index = 0; for (Person person : people) {
		 * if (person != null) { if (person.isOutstanding()) {
		 * System.out.println(person); } index++; } } System.out.println(index);
		 */
		List<Person> people = new ArrayList<Person>();
		people.add(new Professor("anil", 6));
		people.add(new Professor("sunil", 5));
		people.add(new Student("suresh", 67));
		people.add(new Student("mahesh", 98));

	}

	static <T> void printOustandingPeople(List<? extends Object> people) {

	}
	
	static void printSalary(List<? super Person> people) {

	}
}
