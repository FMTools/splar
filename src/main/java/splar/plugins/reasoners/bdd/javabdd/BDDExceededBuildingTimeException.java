package splar.plugins.reasoners.bdd.javabdd;

public class BDDExceededBuildingTimeException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String details;
	
	public BDDExceededBuildingTimeException(String message, String details) {
		super(message);
		this.details = details;
	}
	
	public String getDetails() {
		return details;
	}
}
