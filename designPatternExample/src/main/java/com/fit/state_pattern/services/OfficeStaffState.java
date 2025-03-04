package com.fit.state_pattern.services;

import com.fit.state_pattern.repositories.RoleState;

public class OfficeStaffState implements RoleState {
    @Override
    public void handleDuties(String name) {
        System.out.println(name + " pha và phê.");
    }
}
