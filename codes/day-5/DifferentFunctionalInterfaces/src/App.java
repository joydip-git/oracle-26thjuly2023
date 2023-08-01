import java.util.*;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(5);
		numbers.add(2);
		numbers.add(4);

		// static <T> void sort(List<T> list, Comparator<? super T> c)
		
		/*
		 * Comparator<Integer> compareNunbers = (a, b) -> a.compareTo(b);
		 * Collections.sort(numbers, compareNunbers);
		 */
		Collections.sort(numbers, (a, b) -> b.compareTo(a));
		

		/*
		 * for (Integer number : numbers) { System.out.println(number); }
		 */

		// void forEach(Consumer<? super T> action)
		// forEach method demands you to pass an argument of type Consumer<T>
		// (in this case T is Integer)
		Consumer<Integer> printNumber = (num) -> System.out.println(num);
		numbers.forEach(printNumber);
	}
}
