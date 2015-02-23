package splar.core.constraints.parsing;

public class CNFClauseParseException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public CNFClauseParseException(String message) {
		super(message);
	}

	public CNFClauseParseException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
