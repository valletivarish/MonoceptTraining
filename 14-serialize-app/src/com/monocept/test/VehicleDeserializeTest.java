package com.monocept.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.monocept.model.Car;

public class VehicleDeserializeTest {

    public static void main(String[] args) {
        ObjectInputStream object = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Monocept\\14-serialize-app\\vehicleList");
            object = new ObjectInputStream(fileInputStream);
            int i=0;
            while (true) {
                try {
                    Car car = (Car) object.readObject();
                    System.out.println();
                    System.out.println("\ndetails of car "+(i+1)+" : ");
                    System.out.println("Car Name: " + car.getCompanyName());
                    System.out.println("Car Mileage: " + car.getMileage());
                    System.out.println("Car Price: " + car.getPrice());
                    i++;
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (object != null) {
                try {
                	object.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
