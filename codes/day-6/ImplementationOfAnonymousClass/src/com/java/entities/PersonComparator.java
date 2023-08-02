package com.java.entities;

import java.util.Comparator;

//version-1
/*public class PersonComparator implements Comparator<Person> {
	public int compare(Person first, Person second) {
		if(first.getId()==second.getId()) {
			return first.getName().compareTo(second.getName());
		}else
			return Integer.compare(first.getId(), second.getId());
	}
}*/
public class PersonComparator {
	public int personCompare(Person first, Person second) {
		if(first.getId()==second.getId()) {
			return first.getName().compareTo(second.getName());
		}else
			return Integer.compare(first.getId(), second.getId());
	}
}

