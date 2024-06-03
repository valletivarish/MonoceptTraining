package com.monocept.test;

import java.util.Scanner;
import com.monocept.model.Car;

public class CarTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of vehicles: ");
        int numberOfCars = scanner.nextInt();
        Car[] cars = new Car[numberOfCars];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println("Enter car company name:");
            scanner.nextLine(); 
            String companyName = scanner.nextLine();
            cars[i].setCompanyName(companyName);

            System.out.println("Enter car mileage:");
            double mileage = scanner.nextDouble();
            cars[i].setMileage(mileage);

            System.out.println("Enter car price:");
            double price = scanner.nextDouble();
            cars[i].setPrice(price);
        }

        for (int car = 0; car < cars.length; car++) {
            System.out.println("\nVehicle no " + (car + 1) + ":");
            System.out.println(cars[car]);
        }
        scanner.close();
    }
}
