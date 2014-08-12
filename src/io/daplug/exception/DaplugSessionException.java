package io.daplug.exception;

public class DaplugSessionException extends DaplugException{


	/**
	 * 
	 */
	private static final long serialVersionUID = -120153448371681113L;

	public DaplugSessionException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public DaplugSessionException(Throwable cause) {
		super("Apdu Error", cause);
	}

}
