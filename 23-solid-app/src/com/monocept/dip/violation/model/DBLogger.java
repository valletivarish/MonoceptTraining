package com.monocept.dip.violation.model;

public class DBLogger {
	void log(Exception error) {
		System.out.println("Logged to database"+error);
	}
}
