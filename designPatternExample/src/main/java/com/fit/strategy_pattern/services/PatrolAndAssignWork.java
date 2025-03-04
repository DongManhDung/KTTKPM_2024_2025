package com.fit.strategy_pattern.services;

import com.fit.strategy_pattern.repositories.WorkStrategy;

public class PatrolAndAssignWork implements WorkStrategy {
    @Override
    public void execute(String name) {
        System.out.println(name + " đi tuần và gán việc nhân viên.");
    }
}
