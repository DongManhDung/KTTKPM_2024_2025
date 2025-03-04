package com.fit.decorator_pattern.services;

import com.fit.decorator_pattern.repositories.EmployeeComponent;

public class OfficeStaffDecorator extends RoleDecorator{
    OfficeStaffDecorator(EmployeeComponent employee) {
        super(employee);
    }

    public void performDuties() {
        super.performDuties();
        System.out.println("Pha và phê.");
    }
}
