package com.monocept.model;

public class NewThread implements Runnable{
	public Thread thread;
	
	public NewThread(String name) {
		this.thread =new Thread(this,name);
		thread.start();
	}


	public void run() {
		for(int i=3;i>0;i--) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
