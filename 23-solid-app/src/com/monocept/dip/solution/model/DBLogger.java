package com.monocept.dip.solution.model;

public class DBLogger implements ILogger{

	@Override
	public void log(Exception error) {
		System.out.println("Logged into database "+error);
		
	}

}
