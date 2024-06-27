package com.monocept.creational.factory.test;

import com.monocept.creational.factory.model.CarFactory;
import com.monocept.creational.factory.model.ICar;
import com.monocept.creational.factory.model.Mahindra;
import com.monocept.creational.factory.model.Maruthi;
import com.monocept.creational.factory.model.Tata;

public class CarTest {

	public static void main(String[] args) {
		ICar car;
		car=CarFactory.getCar("Maruthi");
		car.startCar();
		car.stopCar();
		System.out.println(car.hashCode());
		System.out.println();
		car=CarFactory.getCar("Tata");
		car.startCar();
		car.stopCar();
		System.out.println(car.hashCode());
		System.out.println();
		car=CarFactory.getCar("Mahindra");
		car.startCar();
		car.stopCar();
		System.out.println(car.hashCode());

	}

}
