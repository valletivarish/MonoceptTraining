package com.monocept.model;

public class Callme {
	void call(String message) {
		System.out.print("["+message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
