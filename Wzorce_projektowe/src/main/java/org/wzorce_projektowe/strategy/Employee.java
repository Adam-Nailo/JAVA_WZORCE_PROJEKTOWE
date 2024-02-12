package org.wzorce_projektowe.strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Adam Seweryn
 */
public class Employee implements TravelStrategy, JobStrategy, BreakfastStrategy {

    @Getter
    @Setter
    private int salary = 0;
    public TravelStrategy travelStrategy;
    public JobStrategy jobStrategy;
    public BreakfastStrategy breakfastStrategy;

    @Override
    public void eatYourBreakfast(Employee employee) {
        breakfastStrategy.eatYourBreakfast(employee);
    }

    @Override
    public void doYourJob() {
        jobStrategy.doYourJob();
    }

    @Override
    public void goToWork() {
        travelStrategy.goToWork();
    }
}
