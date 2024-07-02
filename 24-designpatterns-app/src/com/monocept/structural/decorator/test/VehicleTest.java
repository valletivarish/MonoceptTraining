package com.monocept.structural.decorator.test;

import com.monocept.structural.decorator.model.CarInspection;
import com.monocept.structural.decorator.model.OilChange;
import com.monocept.structural.decorator.model.WheelAlignment;

public class VehicleTest {

	public static void main(String[] args) {
		CarInspection carInspection = new CarInspection();
		System.out.println(carInspection.getDescription());
		System.out.println(carInspection.getCost());
		System.out.println("-------------------");
		OilChange carInspectionOilchange = new OilChange(carInspection);
		System.out.println(carInspectionOilchange.getDescription());
		System.out.println(carInspectionOilchange.getCost());
		System.out.println("--------------------");
		WheelAlignment carInspectionOilchangeWheelAlignment = new WheelAlignment(carInspectionOilchange);
		System.out.println(carInspectionOilchangeWheelAlignment.getDescription());
		System.out.println(carInspectionOilchangeWheelAlignment.getCost());
	}

}
