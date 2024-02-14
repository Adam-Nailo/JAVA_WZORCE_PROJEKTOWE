package org.wzorce_projektowe.database;

import lombok.Getter;
import lombok.Setter;
import org.wzorce_projektowe.strategy.Employee;

import java.util.ArrayList;

/**
 * Created by Adam Seweryn
 */
@Getter
public class EmployeeDatabase {
    private ArrayList<Employee> employeeList = new ArrayList<>();
//    {
//        employeeList.add(new Employee());
//        employeeList.add(new Employee());
//    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }
}
