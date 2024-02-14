package org.wzorce_projektowe;

import org.wzorce_projektowe.adapter.OfficialTrippingEmployee;
import org.wzorce_projektowe.database.EmployeeCreator;
import org.wzorce_projektowe.database.EmployeeDatabase;
import org.wzorce_projektowe.decorator.DeadlineBonus;
import org.wzorce_projektowe.decorator.FreqBonus;
import org.wzorce_projektowe.decorator.Payable;
import org.wzorce_projektowe.decorator.SpecialBonus;
import org.wzorce_projektowe.strategy.*;

/**
 * Created by Adam Seweryn
 */
public class ApiFacade {

    private final EmployeeDatabase eDatabase = new EmployeeDatabase();
    private final EmployeeCreator employeeCreator = new EmployeeCreator();

    public Employee createDoctor(int i) {
        Employee mike = employeeCreator.create(EmployeeCreator.BIKE_DOCTOR_SANDWICH);
        mike.setSalary(i);

        eDatabase.addEmployee(mike);
        return mike;
    }

    public void pushDoctorToJob(Employee mike) {
        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBreakfast(mike);

        mike.travelStrategy = new CarTravelStrategy();
        mike.goToWork();
    }

    public int countSalary(Employee mike) {
        Payable employee = mike;
        if (mike.getSalary() > 8000) {
            employee = new SpecialBonus(employee);
        }
        if (mike.travelStrategy instanceof BikeTravelStrategy) {
            employee = new FreqBonus(employee);
        }
        return employee.getSalary();
    }

    public void giveFreeHouseToBestFreqEmployee(Employee mike) {
        System.out.println(mike.toString() + "dostaje dom" + House.builder()
                .adress("ul.Wysoka 2")
                .floorsNumber(2)
                .doorsNumber(3)
                .windowsNumber(12)
                .build().toString());
    }
}
