package org.wzorce_projektowe.strategy;

/**
 * Created by Adam Seweryn
 */
public class DoctorJobStrategy implements JobStrategy {
    @Override
    public void doYourJob() {
        System.out.println("Cure people.");
    }
}
