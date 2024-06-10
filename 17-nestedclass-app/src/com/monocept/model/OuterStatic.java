package com.monocept.model;

public class OuterStatic {
	int number=0;
	public void outerDisplay() {
		System.out.println("outside static class");
	}
	public static class InnerStatic{
		public void innerDisplay() {
//			number=10;
			System.out.println("Inside static class");
		}
	}
}
