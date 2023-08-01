package com.java.comparisondemo.ui;

import java.util.*;
import com.java.entities.*;
import com.java.comparisondemo.entities.*;

public class App {

	public static void main(String[] args) {
		Person sunilPerson = new Person(2, "sunil");
		Person joydipPerson = new Person(1, "joydip");
		Person anilPerson = new Person(3, "anil");

		/*
		 * int compResult = sunilPerson.compareTo(joydipPerson); if (compResult > 0)
		 * System.out.println("sunil is greater than joydip"); else if(compResult<0)
		 * System.out.println("joydip is greater than sunil"); else
		 * System.out.println("both are same");
		 */

		List<Person> people = new ArrayList<Person>();
		people.add(sunilPerson);
		people.add(joydipPerson);
		people.add(anilPerson);

		/*
		 * for (int i = 0; i < people.size(); i++) { for (int j = i + 1; j <
		 * people.size(); j++) { Person p1 = people.get(i); Person p2 = people.get(j);
		 * if (p1.compareTo(p2) > 0) { Person temp = p1; people.set(i, p2);
		 * people.set(j, temp); } } }
		 */

		// list => List<T> where T implements Comparable<T>
		// Collections.sort(list);

		// sort method uses Reflection mechanism to find out whether T (Person)
		// implements
		// Comparable<T(Person)> or not
		Collections.sort(people);
		System.out.println("records sorted in default manner");
		for (Person p : people) {
			System.out.println(p.getId() + ", " + p.getName());
		}

		// list => List<T>
		// c is an instance of C where C implements Comparer<T>
		// Collections.sort(list, c);

		System.out.println("1-> sort by id");
		System.out.println("2-> sort by name");
		Scanner sc = new Scanner(System.in);
		System.out.print("enter choice[1/2]: ");
		int choice = sc.nextInt();
		/*
		 * PersonComparer pc = new PersonComparer(choice); Collections.sort(people, pc);
		 * for (Person p : people) { System.out.println(p.getId() + ", " + p.getName());
		 * }
		 */

		/*
		 * for (int i = 0; i < people.size(); i++) { for (int j = i + 1; j <
		 * people.size(); j++) { Person p1 = people.get(i); Person p2 = people.get(j);
		 * // if (p1.compareTo(p2) > 0) { if (pc.compare(p1, p2) > 0) { Person temp =
		 * p1; people.set(i, p2); people.set(j, temp); } } }
		 */

		Comparator<Person> compareLogic = null;
		switch (choice) {
		case 1:
			compareLogic = (p1, p2) -> Integer.compare(p1.getId(), p2.getId());
			break;

		case 2:
			compareLogic = (p1, p2) -> p1.getName().compareTo(p2.getName());
			break;

		default:
			break;
		}
		if (compareLogic != null) {
			Collections.sort(people, compareLogic);
		}

		people.forEach((p) -> System.out.println(p.getId() + ", " + p.getName()));
	}

}
