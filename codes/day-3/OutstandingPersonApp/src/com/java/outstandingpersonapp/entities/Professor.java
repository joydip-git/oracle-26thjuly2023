package com.java.outstandingpersonapp.entities;

public final class Professor extends Person {

	private int noOfBooksPublished;

	public Professor() {

	}

	public Professor(String name, int booksCount) {
		super(name);
		this.noOfBooksPublished = booksCount;
	}

	public int getNoOfBooksPublished() {
		return noOfBooksPublished;
	}

	public void setNoOfBooksPublished(int noOfBooksPublished) {
		this.noOfBooksPublished = noOfBooksPublished;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;

		Professor other = (Professor) obj;
		if (!(this.getNoOfBooksPublished() == other.getNoOfBooksPublished()))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.noOfBooksPublished;
	}

	@Override
	public boolean isOutstanding() {
		return noOfBooksPublished > 5 ? true : false;
	}

}
