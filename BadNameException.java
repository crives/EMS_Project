package EMS_Project;

public class BadNameException extends Exception {

//	private static final String message = "Please enter a valid name.";

	public BadNameException() {
//		super(message);
		System.out.println("Please enter a valid name.");
	}
}
