import java.util.Set;

public class App {

	public static void main(String[] args) {
		OuterCls outer = new OuterCls();
		OuterCls.MemberInnerCls inner = outer.new MemberInnerCls();
		System.out.println(inner.printMessage());

		// version-1: separate classes and has-a relationship
		// Address anilPesrsonAddress = new Address("Bangalore");
		// Person anilPerson = new Person("Anil", anilPersonAddress);

		// version-2: nested class (member inner class)

		Person anilPerson = new Person("Anil");
		Person.Address anilHomeAddress = anilPerson.new Address("Bangalore");
		System.out.println(anilHomeAddress.getLocation());

		// Person anilPerson = new Person("Anil", "Delhi", "Bangalore");

		MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
		map.push(2, "anil");
		map.push(1, "sunil");

		Set<MyHashMap.MapEntry<Integer, String>> entries = map.getEntries();
		for (MyHashMap.MapEntry<Integer, String> mapEntry : entries) {
			System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
		}

	}

}
