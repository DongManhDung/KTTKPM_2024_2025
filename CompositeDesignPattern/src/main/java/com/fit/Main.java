package com.fit;

import com.fit.composite.Shop;
import com.fit.composite.Table;
import com.fit.leaf.Product;

public class Main {
    public static void main(String[] args) {
        Product coffee = new Product("Coffee", 30000);
        Product tea = new Product("Tea", 25000);
        Product water = new Product("Water", 10000);
        Product milkTea = new Product("Milk Tea", 40000);

        Table table1 = new Table(1);
        table1.addItem(coffee);
        table1.addItem(tea);

        Table table2 = new Table(2);
        table2.addItem(milkTea);
        table2.addItem(water);
        table2.addItem(coffee);

        Table table3 = new Table(3);
        table3.addItem(milkTea);
        table3.addItem(water);
        table3.addItem(coffee);
        table3.addItem(tea);


        Shop shop = new Shop();
        shop.addTable(table1);
        shop.addTable(table2);
        shop.addTable(table3);

        System.out.println(table1);
        System.out.println(table2);
        System.out.println(table3);
        System.out.println(shop);

    }
}