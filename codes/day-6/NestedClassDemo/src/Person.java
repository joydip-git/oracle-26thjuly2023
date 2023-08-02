
/*public class Person {
	Address permanentAddress;
	String name;
	
	public Person() {}
	public Person(String name, Address permanentAddress) {
		this.name = name;
		this.permanentAddress = permanentAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
}*/
/*public class Person {
	private String name;
	private Address permanentAddress;
	private Address temporaryAddress;

	public Person() {
	}

	public Person(String name, String permamnentLocation, String temprorayLocation) {
		this.name = name;
		this.permanentAddress = new Address(permamnentLocation);
		this.temporaryAddress = new Address(temprorayLocation);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private class Address {
		private String location;

		public Address(String location) {
			this.location = location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLocation() {
			return this.location;
		}
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public Address getTemporaryAddress() {
		return temporaryAddress;
	}
}
*/

public class Person {
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class Address {
		private String location;
		
		public Address() {}

		public Address(String location) {
			this.location = location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getLocation() {
			return this.location;
		}
	}
}
