package com.monocept.model;

public class InputValidator {
	
	public static boolean validateUsername(String username) {
		if(!validateUser(username,3,20)) {
			return false;
		}
		return true;
	}
	public static boolean validatePassword(String password) {
		if(!validateUser(password,8,30)) {
			return false;
		}
		return true;
	}
	public static boolean validateEmail(String email) {
		if(!validateUser(email,5,50) || !email.contains("@") || !email.contains(".") || (email.lastIndexOf(".")<email.lastIndexOf("@"))){
			return false;
		}
		return true;
	}
	
	public static boolean validateUser(String value,int minLength, int maxLength) {
		if(value==null || value=="" || value.length()<minLength ||value.length()>maxLength) {
			return false;
		}
		return true;
	}
}
