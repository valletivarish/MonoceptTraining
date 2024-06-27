package com.monocept.test;

import com.monocept.model.Consumer;
import com.monocept.model.Producer;
import com.monocept.model.Q;
import com.monocept.model.Q1;

public class Tester {

	public static void main(String[] args) {
		Q q1=new Q();
		Consumer consumer1=new Consumer(q1);
		Producer producer1=new Producer(q1);
		

	}

}
