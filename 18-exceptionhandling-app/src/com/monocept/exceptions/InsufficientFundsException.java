package com.monocept.exceptions;

public class InsufficientFundsException extends Exception{
	public String getMessage() {
		return "your account has insufficient funds";
	}
}
