package com.monocept.creational.abstractfactory.test;

import java.util.Scanner;

import com.monocept.creational.abstractfactory.model.ICar;
import com.monocept.creational.abstractfactory.model.ICarFactory;
import com.monocept.creational.abstractfactory.model.MahindraFactory;
import com.monocept.creational.abstractfactory.model.MarutiFactory;
import com.monocept.creational.abstractfactory.model.TataFactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		ICarFactory carFactory=null;
		ICar car=null;
		Scanner scanner=new Scanner(System.in);
		boolean exit=false;
		while(!exit) {
			System.out.println("choose a option : \n1. Maruti \n2. Tata \n3. Mahindra \n4. Exit");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:
				marutiCar(carFactory,car);
				break;
			case 2:
				tataCar(carFactory,car);
				break;
			case 3:
				mahindraCar(carFactory,car);
				break;
			case 4:
				exit=true;
				
				
			}
		}
	}

	private static void mahindraCar(ICarFactory carFactory, ICar car) {
		carFactory=new MahindraFactory();
		car=carFactory.makeCar();
		car.start();
		car.stop();
		
	}

	private static void tataCar(ICarFactory carFactory, ICar car) {
		carFactory=new TataFactory();
		car=carFactory.makeCar();
		car.start();
		car.stop();
		
	}

	private static void marutiCar(ICarFactory carFactory, ICar car) {
		carFactory=new MarutiFactory();
		car=carFactory.makeCar();
		car.start();
		car.stop();
	}

}
