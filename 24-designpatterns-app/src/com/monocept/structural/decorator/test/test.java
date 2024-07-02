package com.monocept.structural.decorator.test;

import com.monocept.structural.decorator.model.GoldenHat;
import com.monocept.structural.decorator.model.RibbonHat;
import com.monocept.structural.decorator.model.StandardHat;

public class test {

	public static void main(String[] args) {
		StandardHat standardHat=new StandardHat();
		System.out.println(standardHat.getName());
		System.out.println(standardHat.getPrice());
		System.out.println(standardHat.getDescription());
		
		GoldenHat goldenStandardHat=new GoldenHat(standardHat);
		System.out.println(goldenStandardHat.getName());
		System.out.println(goldenStandardHat.getPrice());
		System.out.println(goldenStandardHat.getDescription());
		
		RibbonHat ribbonGoldenStandardHat=new RibbonHat(goldenStandardHat);
		System.out.println(ribbonGoldenStandardHat.getName());
		System.out.println(ribbonGoldenStandardHat.getPrice());
		System.out.println(ribbonGoldenStandardHat.getDescription());

	}

}
