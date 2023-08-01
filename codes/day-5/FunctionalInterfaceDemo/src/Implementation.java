
public class Implementation implements Sample {

	@Override
	public String sayHello(String name) {
		return "Greetings: " + name;
	}
	
	public String sayBye(String name) {
		return "Bye: " + name;
	}
}
