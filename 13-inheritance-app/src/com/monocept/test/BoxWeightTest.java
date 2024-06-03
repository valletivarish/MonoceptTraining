package com.monocept.test;

import com.monocept.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		BoxWeight boxWeight=new BoxWeight(10,20,30,40);
//		boxWeight.setDepth(10);
//		boxWeight.setHeight(20);
//		boxWeight.setWidth(30);
//		boxWeight.setWeight(100);
		System.out.println("Depth\t:\t"+boxWeight.getDepth());
		System.out.println("Height\t:\t"+boxWeight.getHeight());
		System.out.println("Width\t:\t"+boxWeight.getWidth());
		System.out.println("Weight\t:\t"+boxWeight.getWeight());

	}

}
