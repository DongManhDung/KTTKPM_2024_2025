package com.fit.decorator_pattern.services;

import com.fit.decorator_pattern.repositories.EmployeeComponent;

public class RoleDecorator implements EmployeeComponent {
    protected EmployeeComponent employee;

    RoleDecorator(EmployeeComponent employee) {
        this.employee = employee;
    }

    public void performDuties() {
        employee.performDuties();
    }
}
