package com.java.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.entities.Person;
//import com.java.entities.PersonComparator;

public class App {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("anil", 3));
		people.add(new Person("joy", 1));
		people.add(new Person("sunil", 2));

		// version-1: PersonComparator implemented Comparator<Person> and compare()
		// Collections.sort(people, new PersonComparator());

		// version-2: PersonComparator did not implement Comparator<Person>
		// but created its own method personCompare() matching to the signature
		// of compare() method of Comparator<T>
		// using method reference technique

		// Comparator<Person> personComparator = new PersonComparator()::personCompare;
		// Collections.sort(people, personComparator);

		// version-3: using Lambda Function/expression technique since
		// no class was created implementing Comparator<T> interface
		// or no class was created having method matching to the compare() method
		// of Comparator<T> interface

		/*
		 * Comparator<Person> personComparator = (first, second) -> { if (first.getId()
		 * == second.getId()) { return first.getName().compareTo(second.getName()); }
		 * else return Integer.compare(first.getId(), second.getId()); };
		 */
		// Collections.sort(people, personComparator);

		// version-4: anonymous class (not inside the Person class)
		/*
		 * Comparator<Person> personComparator = new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person first, Person second) { if (first.getId()
		 * == second.getId()) { return first.getName().compareTo(second.getName()); }
		 * else return Integer.compare(first.getId(), second.getId()); } };
		 * Collections.sort(people, personComparator);
		 */

		// version-5: multiple anonymous classes (inside the Person class)
		/*
		 * int choice = 2; switch (choice) { case 1: Collections.sort(people,
		 * Person.IdComparator); break; case 2: Collections.sort(people,
		 * Person.NameComparator); break; default: break; } people.forEach((p) ->
		 * System.out.println(p.getId() + ", " + p.getName()));
		 */

		// version-6.1:

		/*
		 * people.stream().sorted(new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person first, Person second) { if (first.getId()
		 * == second.getId()) { return first.getName().compareTo(second.getName()); }
		 * else return Integer.compare(first.getId(), second.getId()); }
		 * 
		 * });
		 */
		// version-6.2:
		people.stream().sorted((first, second) -> {
			return 0;
		});	
		
		
	}

}
