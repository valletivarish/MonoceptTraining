package com.monocept.test;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeTest {

	public static void main(String[] args) {
		ArrayDeque<Integer> deque=new ArrayDeque<Integer>();
		deque.add(10);
		//[10]
		deque.addFirst(20);
		//[20,10]
		deque.addLast(30);
		//[20,10,30]
		deque.add(40);
		//[20,10,30,40]
		Iterator<Integer> dequeList=deque.iterator();
		while(dequeList.hasNext()) {
			System.out.println(dequeList.next());
		}
		System.out.println(deque);
		System.out.println("first element : "+deque.getFirst());
		System.out.println("last element : "+deque.getLast());
		//check whether the dequeue is empty or not
		System.out.println(deque.isEmpty());
		System.out.println("pop first element : "+deque.pollFirst());
		System.out.println("pop last element : "+deque.pollLast());
		System.out.println(deque);
		//clearing deque
		deque.clear();
		System.out.println(deque.isEmpty());
	}

}
