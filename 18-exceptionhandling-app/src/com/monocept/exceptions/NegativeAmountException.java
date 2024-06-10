package com.monocept.exceptions;

public class NegativeAmountException extends Exception{
	
	private String message;
	
	public NegativeAmountException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
