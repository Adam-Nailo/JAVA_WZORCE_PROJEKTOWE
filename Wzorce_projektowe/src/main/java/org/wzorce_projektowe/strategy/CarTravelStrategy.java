package org.wzorce_projektowe.strategy;

/**
 * Created by Adam Seweryn
 */
public class CarTravelStrategy implements TravelStrategy {
    @Override
    public void goToWork() {
        System.out.println("Going by car.");
    }
}
