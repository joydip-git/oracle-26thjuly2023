package com.java.collectiondemo.ui;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/* List<Integer> list = new ArrayList<Integer>(); */
		Sample sample = new Sample();
		/* Sample<Integer> sample = new Sample<Integer>(); */
		sample.add(10, 20);
		// sample.add(12.34f, 34.45f);
		// sample.add("anil", "kumar");
		Integer[] arr = new Integer[] { 1, 2, 3, 4 };
		Character[] characters = new Character[] { 'a', 'b' };
		printElements(arr);
		printElements(characters);
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		printElements(numbers);
	}

	static <E> void printElements(E[] arr) {
		for (E e : arr) {
			System.out.println(e);
		}
	}
	static void printElements(List<? extends Number> list) {
		for (Number number : list) {
			
		}
	}
	static void printValues(List<?> list) {
		for (Object obj : list) {
			
		}
	}
}
