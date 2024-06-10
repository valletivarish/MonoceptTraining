package com.monocept.test;

import com.monocept.model.OuterClass;
import com.monocept.model.OuterClass.InnerClass;

public class OuterClassTest {

	public static void main(String[] args) {
		OuterClass outerClass=new OuterClass();
		outerClass.displayOuter();
		OuterClass.InnerClass innerClass=outerClass.new InnerClass();
		innerClass.displayInner();

	}

}
