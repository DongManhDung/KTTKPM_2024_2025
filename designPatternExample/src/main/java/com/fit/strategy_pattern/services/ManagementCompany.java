package com.fit.strategy_pattern.services;

import com.fit.strategy_pattern.repositories.WorkStrategy;

public class ManagementCompany implements WorkStrategy {
    @Override
    public void execute(String name) {
        System.out.println(name + " quản lý công ty.");
    }
}
