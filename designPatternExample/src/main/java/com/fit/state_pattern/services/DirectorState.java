package com.fit.state_pattern.services;

import com.fit.state_pattern.repositories.RoleState;

public class DirectorState implements RoleState {
    @Override
    public void handleDuties(String name) {
        System.out.println(name + " quản lý công ty.");
    }
}
