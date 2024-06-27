package com.monocept.test;

import com.monocept.model.Caller;
import com.monocept.model.Callme;

public class CallerTest {

	public static void main(String[] args) throws InterruptedException {
		Callme call=new Callme();
		
		
		Caller caller1=new Caller("hello",call);
		
		Caller caller2=new Caller("Swabhav",call);
		
		Caller caller3=new Caller("Techlabs",call);
		
		caller1.thread.join();
		caller2.thread.join();
		caller3.thread.join();
		

		

	}

}
