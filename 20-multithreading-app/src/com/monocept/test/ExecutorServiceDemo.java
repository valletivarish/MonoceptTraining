package com.monocept.test;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.concurrent.*;
import java.util.concurrent.Executors;

import com.monocept.model.Task;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		int count =Runtime.getRuntime().availableProcessors();
		ScheduledExecutorService service=Executors.newScheduledThreadPool(1);
		System.out.println("Starting normal schedule");
		String currentTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(Thread.currentThread().getName()+" "+currentTime);
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		System.out.println("Starting at fixed rate");
		service.scheduleAtFixedRate(new Task(), 0, 10, TimeUnit.SECONDS);
		
		System.out.println("Starting with fixed delay");
		service.scheduleWithFixedDelay(new Task(), 0, 10, TimeUnit.SECONDS);
	}

}
