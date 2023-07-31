
public class App {

	public static void main(String[] args) {

		System.out.println(Employee.LOCATION);
		System.out.println(Employee.getCompanyName());

		Employee anilEmp = new Employee("anil", 1, "EDU", 1000);
		Employee sunilEmp = new Employee("sunil", 2, "ABV", 2000);
		Employee maheshlEmp = new Employee("mahesh", 2, "OHI", 3000);

	}
}
