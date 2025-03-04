package com.fit.StatePattern.entities;

import com.fit.StatePattern.repositories.RoleState;

public class EmployeeState {
    private String name;
    private RoleState roleState;

    public EmployeeState(String name, RoleState roleState) {
        this.name = name;
        this.roleState = roleState;
    }

    public void setRoleState(RoleState roleState) {
        this.roleState = roleState;
    }

    public void performDuties(){
        roleState.handleDuties(name);
    }
}
