package com.java.outstandingpersonapp.entities;

public final class Student extends Person {

	private double marks;

	public Student() {
	}

	public Student(String name, int marks) {
		super(name);
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;

		Student other = (Student) obj;
		if (!(this.getMarks() == other.getMarks()))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.marks;
	}

	@Override
	public boolean isOutstanding() {
		return marks > 85;
	}

}
