package com.monocept.test;

import java.util.Scanner;

import com.monocept.model.Light;
import com.monocept.model.SecurityCamera;
import com.monocept.model.SmartDevice;
import com.monocept.model.SmartHome;
import com.monocept.model.Thermostat;

public class SmartHomeTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHome smartHome = new SmartHome();
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Add Device \n2. Control Device \n3. List all Devices \n4. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    deviceAvailable(scanner, smartHome);
                    break;
                case 2:
                    System.out.println("Enter the details : ");
                    System.out.print("Enter device Id : ");
                    String deviceID = scanner.next();
                    System.out.print("Enter device status : ");
                    boolean turnOn = scanner.nextBoolean();
                    smartHome.controlDevice(deviceID, turnOn);
                    break;
                case 3:
                    smartHome.listAllDevices();
                    break;
                case 4:
                    exit = true;
            }
        }
    }

    private static void deviceAvailable(Scanner scanner, SmartHome smartHome) {
        System.out.println("Available Devices : \n1. Light \n2. Thermostat \n3. Security Camera");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("You chose light");
                addLight(scanner, smartHome);
                break;
            case 2:
                System.out.println("You chose thermostat");
                addThermostat(scanner, smartHome);
                break;
            case 3:
                System.out.println("You chose security camera");
                addSecurityCamera(scanner, smartHome);
                break;
        }
    }

    private static void addLight(Scanner scanner, SmartHome smartHome) {
        System.out.print("Enter device id : ");
        String deviceId = scanner.next();
        System.out.print("Enter device name : ");
        String deviceName = scanner.next();
        smartHome.addDevice(new Light(deviceId, deviceName, false));
    }

    private static void addThermostat(Scanner scanner, SmartHome smartHome) {
        System.out.print("Enter device id : ");
        String deviceId = scanner.next();
        System.out.print("Enter device name : ");
        String deviceName = scanner.next();
        smartHome.addDevice(new Thermostat(deviceId, deviceName, false, 38));
    }

    private static void addSecurityCamera(Scanner scanner, SmartHome smartHome) {
        System.out.print("Enter device id : ");
        String deviceId = scanner.next();
        System.out.print("Enter device name : ");
        String deviceName = scanner.next();
        smartHome.addDevice(new SecurityCamera(deviceId, deviceName, false));
    }
}
