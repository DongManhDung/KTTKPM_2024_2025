package com.fit.state_pattern.services;

import com.fit.state_pattern.repositories.RoleState;

public class TeamLeaderState implements RoleState {
    @Override
    public void handleDuties(String name) {
        System.out.println(name + " đi tuần và gán việc nhân viên.");
    }
}
