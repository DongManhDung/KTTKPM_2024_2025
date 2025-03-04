package com.fit.decorator_pattern.services;

import com.fit.decorator_pattern.repositories.EmployeeComponent;

public class BaseEmployee implements EmployeeComponent {
    private String name;

    public BaseEmployee(String name) {
        this.name = name;
    }

    public void performDuties(){
        System.out.println(name + " không có nhiệm vụ cụ thể");
    }
}
