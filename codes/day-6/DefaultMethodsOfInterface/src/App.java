import java.util.List;

public class App {

	public static void main(String[] args) {
		//List<Integer> ints =null;
		ElementCollection<Integer> numbers = new ElementList<Integer>();
		numbers.addElement(12);
		numbers.addElement(1);
		ElementComparer<Integer> compare = new ElementComparer<Integer>() {
			
			@Override
			public int compareElements(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return 0;
			}
			@Override
			public int foo() {
				return 10;
			}
		};
		numbers.sort(compare);
	}

}
