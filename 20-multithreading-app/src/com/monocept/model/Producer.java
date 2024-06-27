package com.monocept.model;

public class Producer implements Runnable{
	public Q q;
	public Thread thread;
	int k=0;
	public Producer(Q q) {
		super();
		this.q = q;
		this.thread=new Thread(this,"Producer");
		thread.start();
	}
	@Override
	public void run() {
		int i=0;
		while(k<=10) {
			k++;
			q.put(i++);
		}
		
	}
	
}
