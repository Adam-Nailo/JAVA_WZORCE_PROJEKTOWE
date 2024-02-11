package org.wzorce_projektowe.strategy;

/**
 * Created by Adam Seweryn
 */
public class SandwichBreakfastStrategy implements BreakfastStrategy {
    @Override
    public void eatYourBreakfast(Employee employee) {
        System.out.println("Eat sandwich.");
    }
}
