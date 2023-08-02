
public class OuterCls {
	private String message = "Hello from member inner class";

	public class MemberInnerCls {
		public String printMessage() {
			return message;
		}
	}
}
