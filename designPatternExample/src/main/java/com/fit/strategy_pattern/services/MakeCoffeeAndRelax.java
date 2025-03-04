package com.fit.strategy_pattern.services;

import com.fit.strategy_pattern.repositories.WorkStrategy;

public class MakeCoffeeAndRelax implements WorkStrategy {
    @Override
    public void execute(String name) {
        System.out.println(name + " pha và phê.");
    }
}
