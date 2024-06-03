package com.monocept.model;

public class Derived extends Base{
	public int x;

	public Derived(int x) {
		super(x);
		this.x = x;
	}
	public void display() {
		super.display();
		System.out.println("inside derived");
	}
	
}
