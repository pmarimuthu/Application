package com.avs.portal.exception;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = -3398679194752587707L;

	public ApplicationException() {
		
	}
	
	public ApplicationException(String message) {
		super(message);
	}
}
