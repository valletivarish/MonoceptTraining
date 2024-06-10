package com.monocept.model;

public class SmartHome {
    SmartDevice[] devices = new SmartDevice[10];
    int count = 0;

    public void addDevice(Thermostat thermostat) {
        devices[count++] = thermostat;
    }

    public void addDevice(SecurityCamera securityCamera) {
        devices[count++] = securityCamera;
    }

    public void addDevice(Light light) {
        devices[count++] = light;
    }

    public void controlDevice(String deviceID, boolean turnOn) {
        SmartDevice device = findDevice(deviceID);
        if (device != null) {
            executeAction(device, turnOn);
        }
    }

    private SmartDevice findDevice(String deviceID) {
        for (int i = 0; i < count; i++) {
            SmartDevice device = devices[i];
            if (device.getDeviceID().equals(deviceID)) {
                return device;
            }
        }
        return null;
    }
    private void executeAction(SmartDevice device, boolean turnOn) {
        switch (device.getClass().getSimpleName()) {
            case "Light":
                Light light = (Light) device;
                if (turnOn) {
                    light.turnOn();
                    return;
                }
                light.turnOff();
                break;
            case "Thermostat":
                Thermostat thermostat = (Thermostat) device;
                if (turnOn) {
                    thermostat.turnOn();
                    return;
                }
                thermostat.turnOff();
                break;
            case "SecurityCamera":
                SecurityCamera securityCamera = (SecurityCamera) device;
                securityCamera.setRecording(turnOn);
                break;
        }
    }

    public void listAllDevices() {
        for (int i = 0; i < count; i++) {
        	System.out.println("Smart Device "+(i+1));
            SmartDevice device = devices[i];
            System.out.print("Device Id : ");
            System.out.println(device.getDeviceID());
            System.out.print("Device Name : ");
            System.out.println(device.getName());
            System.out.print("Device status : ");
            System.out.println(device.isOn());
        }
    }
}
