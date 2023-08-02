import java.util.Set;
import java.util.function.Predicate;

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

		// FileDataAccess fileDataAccessObject = new TextFileDataAccess("");
		// Predicate<Integer> evenPredicate = new FilterLogic()::isEven;
		// Predicate<Integer> oddPredicate = (number) -> number % 2 != 0;

		// created here an anonymous class extending FileDataAccess abstract/concrete
		// class or interface
		// new keyword here is used to create instance of that anonymous class
		// fileDataAccessObject variable stored reference of the instance of the
		// anonymous class
		/*
		 * FileDataAccess fileDataAccessObject = new FileDataAccess() {
		 * 
		 * @Override public String getData() { return "data from XML file"; } };
		 * fileDataAccessObject.setFilePath(""); String data =
		 * fileDataAccessObject.getData(); System.out.println(data);
		 */
		FileDataAccess fileDataAccessObject = new FileDataAccess() {
			@Override
			public String getData() {
				return "data from XML file";
			}
		};
		// fileDataAccessObject.setFilePath("");
		String data = fileDataAccessObject.getData();
		System.out.println(data);
	}

}
