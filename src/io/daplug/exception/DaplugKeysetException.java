package io.daplug.exception;

public class DaplugKeysetException extends DaplugException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1664694753551081820L;

	public DaplugKeysetException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public DaplugKeysetException(Throwable cause) {
		super("Keyset Error", cause);
	}
}
