package io.daplug.exception;

public class DaplugSamException extends DaplugException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5138999257835062750L;

	
	public DaplugSamException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public DaplugSamException(Throwable cause) {
		super("Sam Error", cause);
	}
}
