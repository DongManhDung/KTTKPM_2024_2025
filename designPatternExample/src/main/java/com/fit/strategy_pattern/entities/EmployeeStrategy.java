package com.fit.strategy_pattern.entities;

import com.fit.strategy_pattern.repositories.WorkStrategy;

public class EmployeeStrategy {
    String name;
    WorkStrategy workStrategy;

    public EmployeeStrategy(String name, WorkStrategy workStrategy) {
        this.name = name;
        this.workStrategy = workStrategy;
    }

    public void setWorkStrategy(WorkStrategy workStrategy) {
        this.workStrategy = workStrategy;
    }

    public void performDuties() {
        workStrategy.execute(name);
    }
}
