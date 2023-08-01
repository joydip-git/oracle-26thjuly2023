import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {

	static <E> List<E> filterValues(List<E> input, Predicate<E> logic) {
		List<E> result = new ArrayList<E>();
		input.forEach((n) -> {
			if (logic.test(n)) {
				result.add(n);
			}
		});
		return result;
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(4);
		numbers.add(2);
		numbers.add(6);
		numbers.add(3);

		/*
		 * Stream<Integer> streamOfNumbers = numbers.stream(); // filtration
		 * Predicate<Integer> evenFilter = (num) -> num % 2 == 0; Stream<Integer>
		 * filteredStream = streamOfNumbers.filter(evenFilter);
		 * 
		 * // sorting Comparator<Integer> compareLogic = (a, b) -> Integer.compare(a,
		 * b); Stream<Integer> sortedStream = filteredStream.sorted(compareLogic);
		 * 
		 * // Optional<Integer> firstEvenNumber = sortedStream.findFirst();
		 * System.out.println(firstEvenNumber.get());
		 */
		int firstEvenNumber = numbers.stream().filter((num) -> num % 2 == 0).sorted((a, b) -> Integer.compare(a, b))
				.findFirst().get();
		System.out.println(firstEvenNumber);
		System.out.println("\n\n");
		numbers.forEach((n) -> System.out.println(n));
	}

}
