package com.fit.StatePattern.services;

import com.fit.StatePattern.repositories.RoleState;

public class TeamLeaderState implements RoleState {
    @Override
    public void handleDuties(String name) {
        System.out.println(name + " đi tuần và gán việc nhân viên.");
    }
}
