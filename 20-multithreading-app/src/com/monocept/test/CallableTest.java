package com.monocept.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;


import com.monocept.model.NewTask;
import com.monocept.model.Task;

public class CallableTest {

	public static void main(String[] args) throws ExecutionException {
		ExecutorService service=Executors.newFixedThreadPool(10);
		List<NewTask> tasks=new ArrayList<NewTask>();
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		tasks.add(new NewTask());
		
		try {
			List<Future<Integer>> futures = service.invokeAll(tasks);
			for(Future<Integer> future:futures) {
				System.out.println(future.get());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
