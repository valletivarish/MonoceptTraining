package com.monocept.creational.singleton.model;

public class DBManager {
	private static DBManager dbManager;
	public static DBManager getDBManager() {
		if(dbManager==null) {
			dbManager=new DBManager();
		}
		return dbManager;
	}
	public String getMessage() {
		return "data base loaded";
	}
}
