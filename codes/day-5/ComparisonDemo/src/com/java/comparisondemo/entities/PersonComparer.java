package com.java.comparisondemo.entities;

import java.util.Comparator;
import java.util.Optional;
import com.java.entities.*;

public class PersonComparer implements Comparator<Person> {

	private int choice;

	public PersonComparer() {
	}

	public PersonComparer(int _choice) {
		choice = _choice;
	}

	public void setChoioce(int _choice) {
		choice = _choice;
	}

	@Override
	public int compare(Person p1, Person p2) {

		Optional<Integer> comparisonResult = null;
		switch (choice) {
		case 1:
			comparisonResult = Optional.of(Integer.compare(p1.getId(), p2.getId()));
			break;
		case 2:
			comparisonResult = Optional.of(p1.getName().compareTo(p2.getName()));
			break;

		default:

			break;
		}
		return comparisonResult.get();
	}
}
