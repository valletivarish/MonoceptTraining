package com.monocept.structural.adaptar.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingItems {
    List<IItems> items = new ArrayList<>();

    public ShoppingItems() {
        super();
    }

    public ShoppingItems(List<IItems> items) {
        super();
        this.items = items;
    }

    public List<IItems> getItems() {
        return items;
    }

    public void setItems(List<IItems> items) {
        this.items = items;
    }

    public void addItems(IItems item) {
        items.add(item);
    }

    public void displayCart() {
        int totalPrice = 0;

        System.out.println("Item Name : Item Price");
        for (IItems item : items) {
            System.out.println(item.getItems() + " : " + item.getPrice());
            totalPrice += item.getPrice();
        }

        System.out.println("Total : " + totalPrice);
        System.out.println(); 
    }
}
