package com.monocept.creational.singleton.model;

public class Login {
	private static Login login;
	synchronized public static Login getLogin() {
		if(login==null)
			login=new Login();
		return login;
	}
	public String getMessage() {
		return "Login Successfully";
	}
}
