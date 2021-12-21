package d;

public class PersonAgeException extends Exception {

	public PersonAgeException() {
		super();
	}

	public PersonAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonAgeException(String message) {
		super(message);
	}

	public PersonAgeException(Throwable cause) {
		super(cause);
	}

}
