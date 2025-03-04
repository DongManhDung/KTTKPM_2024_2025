package com.fit;

import com.fit.decorator_pattern.repositories.EmployeeComponent;
import com.fit.decorator_pattern.services.BaseEmployee;
import com.fit.decorator_pattern.services.TeamLeaderDecorator;
import com.fit.not_use_dp.Employee;
import com.fit.state_pattern.entities.EmployeeState;
import com.fit.state_pattern.services.DirectorState;
import com.fit.state_pattern.services.TeamLeaderState;
import com.fit.strategy_pattern.entities.EmployeeStrategy;
import com.fit.strategy_pattern.services.ManagementCompany;
import com.fit.strategy_pattern.services.PatrolAndAssignWork;

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


        System.out.println("3. Strategy Pattern");
        EmployeeStrategy empStrategy = new EmployeeStrategy("Cường", new PatrolAndAssignWork());
        empStrategy.performDuties();
        empStrategy.setWorkStrategy(new ManagementCompany());
        empStrategy.performDuties();
        System.out.println();

        System.out.println("4. Decorator Pattern");
        EmployeeComponent empComponent = new BaseEmployee("Hùng");
        EmployeeComponent teamLeader = new TeamLeaderDecorator(empComponent);
        teamLeader.performDuties();


    }
}