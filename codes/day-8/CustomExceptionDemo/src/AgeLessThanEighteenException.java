/*
public class AgeLessThanEighteenException extends Exception {
	// private String errorMessage;

	public AgeLessThanEighteenException() {
		super("Age is less than 18");
	}

	public AgeLessThanEighteenException(String errorMessage) {
		super(errorMessage);
		// this.errorMessage = errorMessage;
	}

	public AgeLessThanEighteenException(String errorMessage, Exception ex) {
		super(errorMessage, ex);
		// this.errorMessage = errorMessage;
	}
}*/
public class AgeLessThanEighteenException extends Exception {
	private String message;
	private Exception actualException;

	public AgeLessThanEighteenException() {
		// super("Age is less than 18");
		super();
		message = "Age is less than 18";
	}

	public AgeLessThanEighteenException(String errorMessage) {
		// super(message);
		super();
		this.message = errorMessage;
	}

	public AgeLessThanEighteenException(String errorMessage, Exception ex) {
		// super(errorMessage, ex);
		// this.errorMessage = errorMessage;
		super();
		this.message = errorMessage;
		this.actualException = ex;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	public Exception getActualException() {
		return this.actualException;
	}
}
