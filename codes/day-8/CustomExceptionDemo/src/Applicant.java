
public class Applicant {
	private String name;
	private int age;

	public Applicant() {
		super();
	}

	public Applicant(String name, int age) throws AgeLessThanEighteenException{
		super();
		this.name = name;
		//this.age = age;
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeLessThanEighteenException {
		if (age < 18) {
			AgeLessThanEighteenException ex = new AgeLessThanEighteenException("age can't be less than 18");
			throw ex;
		}
		this.age = age;
	}
}
