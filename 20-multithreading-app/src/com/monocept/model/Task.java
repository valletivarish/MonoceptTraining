package com.monocept.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task implements Runnable{
	

	@Override
	public void run() {
		String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(Thread.currentThread().getName()+" "+currentTime);
		
	}

}
