
public class Employee {
	String name;
	int id;
	String department;
	double salary;
	static String companyName;// ="Oracle";
	public final static String LOCATION = "Bangalore";

	static {
		System.out.println(
				"called only one time...the very first time (either you create an instance or you call a static member of the class...static block executed");
		companyName = "Oracle";
		//LOCATION = "";
	}

	public Employee(String name, int id, String department, double salary) {

		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static String getCompanyName() {
		return companyName;
	}

	/*
	 * public static void setCompanyName(String companyName) { companyName =
	 * companyName; }
	 */

}
