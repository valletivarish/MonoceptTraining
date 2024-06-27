package com.monocept.test;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread thread=Thread.currentThread();
		thread.setName("MainThread");
		for(int i=5;i>0;i--) {
			System.out.println(thread.getName()+" "+i);
		}

	}

}
