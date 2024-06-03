package com.monocept.model;

public class Car extends FourWheeler {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car Name: " + getCompanyName() + "\nCar Mileage: " + getMileage() + "\nCar Price: " + getPrice();
    }
}
