package com.monocept.test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue();
		pq.add(10);
		pq.add(30);
		pq.add(-1);
		
		pq.add(5);
		pq.add(16);
		pq.add(20);
		System.out.println(pq);
		
	}

}
