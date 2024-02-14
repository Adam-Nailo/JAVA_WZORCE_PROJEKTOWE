package org.wzorce_projektowe;

import org.wzorce_projektowe.adapter.OfficialTrippingEmployee;
import org.wzorce_projektowe.decorator.DeadlineBonus;
import org.wzorce_projektowe.decorator.FreqBonus;
import org.wzorce_projektowe.decorator.Payable;
import org.wzorce_projektowe.decorator.SpecialBonus;
import org.wzorce_projektowe.strategy.*;

/**
 * Created by Adam Seweryn
 */
public class ApiFacade {
    public Employee createDoctor(int i) {
        Employee mike = new Employee();
        mike.setSalary(i);

        mike.travelStrategy = new BikeTravelStrategy();
        mike.jobStrategy = new DoctorJobStrategy();
        mike.breakfastStrategy = new SandwichBreakfastStrategy();

        OfficialTrippingEmployee otMike = new OfficialTrippingEmployee(mike);
        otMike.goToClient();

        System.out.println("zarobki " + mike.getSalary());
        System.out.println("zarobki " + new FreqBonus(new DeadlineBonus(new SpecialBonus(mike))).getSalary());

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
        if (mike.getSalary()>8000){
            employee = new SpecialBonus(employee);
        }
        if (mike.travelStrategy instanceof BikeTravelStrategy){
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
