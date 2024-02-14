package org.wzorce_projektowe.database;

import org.wzorce_projektowe.strategy.BikeTravelStrategy;
import org.wzorce_projektowe.strategy.DoctorJobStrategy;
import org.wzorce_projektowe.strategy.Employee;
import org.wzorce_projektowe.strategy.SandwichBreakfastStrategy;

/**
 * Created by Adam Seweryn
 */
public class EmployeeCreator {

    public static final String BIKE_DOCTOR_SANDWICH = "bikeDoctorSandwich";

    public Employee create(String employeeType){
        switch (employeeType){
            case BIKE_DOCTOR_SANDWICH:
            {
                Employee mike = new Employee();
                mike.travelStrategy = new BikeTravelStrategy();
                mike.jobStrategy = new DoctorJobStrategy();
                mike.breakfastStrategy = new SandwichBreakfastStrategy();
                return mike;
            }
            default: return new Employee();

        }

    }
}
