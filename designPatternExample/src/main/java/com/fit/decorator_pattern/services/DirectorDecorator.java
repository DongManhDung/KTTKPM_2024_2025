package com.fit.decorator_pattern.services;

import com.fit.decorator_pattern.repositories.EmployeeComponent;

public class DirectorDecorator extends RoleDecorator {
    DirectorDecorator(EmployeeComponent employee) {
        super(employee);
    }

    public void performDuties() {
        super.performDuties();
        System.out.println("Quản lý công ty");
    }
}
