package splar.core.fm.configuration;

public class ConfigurationEngineException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ConfigurationEngineException(Throwable throwable) {
		super(throwable);
	}
	
	public ConfigurationEngineException(String errorMessage) {
		super(errorMessage);
	}
	
	public ConfigurationEngineException(String errorMessage, Throwable throwable) {
		super(errorMessage, throwable);
	}	
	
}
