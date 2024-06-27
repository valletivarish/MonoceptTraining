package com.monocept.model;

public class Consumer implements Runnable{
	
	public Q q;
	public Thread thread;
	int k=0;
	
	public Consumer(Q q) {
		super();
		this.q = q;
		this.thread=new Thread(this,"Consumer");
		thread.start();
	}

	@Override
	public void run() {
		while(k<=10) {
			k++;
			q.get();
		}
		
	}
	
}
