
public class Start {

	public static void main(String[] args) {
		CalculationPrototype proto = new Calculation()::add;

		/*
		 * CalculationPrototype prototype = public int subtract(first, second) { return
		 * first - second; };
		 */
		// Lambda expression to write an anonymous method

		CalculationPrototype addProto = (first, second) -> {
			return first + second;
		};
		CalculationPrototype subProto = (int first, int second) -> {
			return first - second;
		};
		CalculationPrototype multiProto = (first, second) -> first * second;
		CalculationPrototype divProto = (first, second) -> first / second;

		int addRes = addProto.invokeImplementation(10, 12);
		PrintPrototype<Integer> printNum = (num) -> System.out.println(num);
		printNum.invokeImplementation(addRes);

	}

}
