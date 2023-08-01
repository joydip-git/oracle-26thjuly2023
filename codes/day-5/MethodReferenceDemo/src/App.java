import java.util.ArrayList;
import java.util.List;

public class App {
	// pass only the reference (pointer) to a function/method from Greetings class
	static void printMessage(MessagePrinter messagePrinter) {
		// use that reference (pointer) to the method to call that method
		String message = messagePrinter.invokeMessagePrinterImplementation("joydip");
		System.out.println(message);
	}

	public static void main(String[] args) {
		Greetings greetings = new Greetings();

		//greetings.sayHello(name);
		// Referring to an instance method of Greetings class (using reference to an instance)
		MessagePrinter referenceToSayHello = greetings::sayHello;
		//Actual<Greetings> actual = new Actual<Greetings>(greetings,greetings.getClass().getMethod("sayHello"));
		printMessage(referenceToSayHello);

		//Greetings.sayBye(name);
		// Referring to a static method of Greetings class (using Class Name)
		MessagePrinter referenceToSayBye = Greetings::sayBye;
		printMessage(referenceToSayBye);
		//filter(numbers,<logic>);
	}
	/*static List<Integer> filter(List<Integer> input,<logic>){
		List<Integer> result = new ArrayList<Integer>();
		for (Integer num : input) {
			if(condition) {
				result.add(num);
			}
		}
		return result;
	}*/
}
