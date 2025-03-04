package com.fit.decorator_pattern.services;

import com.fit.decorator_pattern.repositories.EmployeeComponent;

public class TeamLeaderDecorator extends RoleDecorator {
    public TeamLeaderDecorator(EmployeeComponent employee) {
        super(employee);
    }

    public void performDuties() {
        super.performDuties();
        System.out.println("Đi tuần và gán việc nhân viên.");
    }
}
