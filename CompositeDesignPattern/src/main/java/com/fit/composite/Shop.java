package com.fit.composite;

import com.fit.component.BillComponent;

import java.util.ArrayList;
import java.util.List;

public class Shop implements BillComponent {

    private List<Table> tables = new ArrayList<>();

    public void addTable(Table table) {
        tables.add(table);
    }

    @Override
    public double getPrice() {
        return tables.stream().mapToDouble(Table::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Total Revenue of Coffee Shop: " + getPrice() + " VND";
    }
}
