package org.wzorce_projektowe.decorator;

import org.wzorce_projektowe.strategy.Employee;

/**
 * Created by Adam Seweryn
 */
public class SpecialBonus extends Bonus {
    public SpecialBonus(Payable payable) {
        super(payable);
    }
    @Override
    protected int getPaidBonus(int salary) {
        return 1000;
    }
}
