package com.monocept.test;

import com.monocept.model.OuterStatic;
import com.monocept.model.OuterStatic.InnerStatic;

public class OuterStaticTest {

	public static void main(String[] args) {
		OuterStatic obj=new OuterStatic();
		obj.outerDisplay();
		OuterStatic.InnerStatic obj1=new InnerStatic();
		obj1.innerDisplay();

	}

}
