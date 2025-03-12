package com.fit.composite;

import com.fit.component.BillComponent;

import java.util.ArrayList;
import java.util.List;

public class Table implements BillComponent {

    private int tableNumber;
    public List<BillComponent> items = new ArrayList<>();

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void addItem(BillComponent item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        return items.stream().mapToDouble(BillComponent::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Table " + tableNumber + " - Total: " + getPrice() + " VND";
    }
}
