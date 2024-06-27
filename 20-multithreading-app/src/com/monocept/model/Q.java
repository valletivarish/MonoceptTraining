package com.monocept.model;

public class Q {
	int n;
	synchronized void put(int n) {
		this.n=n;
		System.out.println("Put :"+n);
	}
	synchronized int get() {
		System.out.println("Get : "+n);
		return n;
	}

}
