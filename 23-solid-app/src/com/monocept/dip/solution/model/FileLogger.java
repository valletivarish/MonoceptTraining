package com.monocept.dip.solution.model;

public class FileLogger implements ILogger{

	@Override
	public void log(Exception error) {
		System.out.println("Logged into file "+error);
		
	}

}
