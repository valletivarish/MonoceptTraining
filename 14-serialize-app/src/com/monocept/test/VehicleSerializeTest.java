package com.monocept.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.monocept.model.Car;

public class VehicleSerializeTest {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of vehicles : ");
		int noOfVehicles=scanner.nextInt();
		Car cars[]=new Car[noOfVehicles];
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("D:\\Monocept\\14-serialize-app\\vehicleList");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			for(int i=0;i<cars.length;i++) {
				cars[i]=new Car();
				System.out.print("Enter the car company name : ");
				cars[i].setCompanyName(scanner.next());
				System.out.print("Enter the car mileage : ");
				cars[i].setMileage(scanner.nextDouble());
				System.out.print("Enter the car price : ");
				cars[i].setPrice(scanner.nextLong());
				objectOutputStream.writeObject(cars[i]);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Serialize completed");

	}

}
