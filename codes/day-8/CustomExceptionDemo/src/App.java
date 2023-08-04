
public class App {

	public static void main(String[] args) {
		Applicant applicant = null;

		try {
			applicant = new Applicant("sunil", 17);
			// applicant.setName("anil");
			// applicant.setAge(14);
		} catch (AgeLessThanEighteenException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
