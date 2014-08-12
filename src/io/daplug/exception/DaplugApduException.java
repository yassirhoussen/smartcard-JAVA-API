package io.daplug.exception;

public class DaplugApduException extends DaplugException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2993484528712380007L;

	public DaplugApduException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public DaplugApduException(Throwable cause) {
		super("Apdu Error", cause);
	}
}