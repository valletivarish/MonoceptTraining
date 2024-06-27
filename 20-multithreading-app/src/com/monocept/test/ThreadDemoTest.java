package com.monocept.test;

import com.monocept.model.MyThread;
import com.monocept.model.NewThread;

public class ThreadDemoTest {

	public static void main(String[] args) {
		MyThread thread1=new MyThread("thread1");
		MyThread thread2=new MyThread("thread2");
		MyThread thread3=new MyThread("thread3");
//		MyThread thread4=new MyThread("thread4");
//		thread4.setPriority(10);
		thread2.setPriority(10);
		thread3.setPriority(Thread.NORM_PRIORITY);
		thread1.setPriority(4);
		
//		for(int i=3;i>0;i--) {
//			System.out.println(Thread.currentThread().getName());
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
