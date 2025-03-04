package com.fit.StatePattern.services;

import com.fit.StatePattern.repositories.RoleState;

public class DirectorState implements RoleState {
    @Override
    public void handleDuties(String name) {
        System.out.println(name + " quản lý công ty.");
    }
}
