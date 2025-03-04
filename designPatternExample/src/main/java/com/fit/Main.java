package com.fit;

import com.fit.NotUseDP.Employee;
import com.fit.StatePattern.entities.EmployeeState;
import com.fit.StatePattern.services.DirectorState;
import com.fit.StatePattern.services.TeamLeaderState;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Không dùng Design Pattern");
        Employee e1 = new Employee("Nguyễn Văn A", "Đội trưởng");
        e1.performDuties();
        System.out.println();

        System.out.println("2. State Pattern");
        EmployeeState empState = new EmployeeState("Bình", new TeamLeaderState());
        empState.performDuties();
        empState.setRoleState(new DirectorState());
        empState.performDuties();
        System.out.println();

        



    }
}