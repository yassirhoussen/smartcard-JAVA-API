package io.daplug.exception;

public class DaplugCryptoException extends DaplugException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3843253338408605178L;

	public DaplugCryptoException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public DaplugCryptoException(Throwable cause) {
		super("Crypto Error", cause);
	}
}
