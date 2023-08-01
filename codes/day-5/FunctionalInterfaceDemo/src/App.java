
public class App {

	public static void main(String[] args) {
		Implementation impl = new Implementation();
		// System.out.println(impl.sayHello("joydip"));
		Sample refToSayHello = impl::sayHello;
		System.out.println(refToSayHello.sayHello("joydip"));

		Sample refToSayBye = impl::sayBye;
		System.out.println(refToSayBye.sayHello("joydip"));
	}

}
