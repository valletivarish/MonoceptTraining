package com.monocept.creational.singleton.test;

import com.monocept.creational.singleton.model.DBManager;
import com.monocept.creational.singleton.model.Login;

public class SingletonTest {

	public static void main(String[] args) {
		Login login=Login.getLogin();
		System.out.println(login.getMessage());
		
		DBManager dbManager=DBManager.getDBManager();
		System.out.println(dbManager.getMessage());
				

	}

}
