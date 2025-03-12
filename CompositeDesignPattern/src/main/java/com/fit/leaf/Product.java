package com.fit.leaf;

import com.fit.component.BillComponent;

public class Product implements BillComponent {
    private double price;
    private String name;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - " + price + " VND";
    }
}
