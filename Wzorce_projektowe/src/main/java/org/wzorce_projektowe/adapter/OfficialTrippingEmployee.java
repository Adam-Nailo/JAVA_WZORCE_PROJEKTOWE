package org.wzorce_projektowe.adapter;

import org.wzorce_projektowe.strategy.Employee;

/**
 * Created by Adam Seweryn
 */
public class OfficialTrippingEmployee {
    private final Employee employee;

    public OfficialTrippingEmployee(Employee employee) {
        this.employee = employee;
    }

    public void goToClient() {
        employee.goToWork();
        System.out.println("to Client");
    }
}
