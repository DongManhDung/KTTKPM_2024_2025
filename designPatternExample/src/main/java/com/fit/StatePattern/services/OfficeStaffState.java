package com.fit.StatePattern.services;

import com.fit.StatePattern.repositories.RoleState;

public class OfficeStaffState implements RoleState {
    @Override
    public void handleDuties(String name) {
        System.out.println(name + " pha và phê.");
    }
}
