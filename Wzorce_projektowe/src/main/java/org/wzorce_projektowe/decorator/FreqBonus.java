package org.wzorce_projektowe.decorator;

/**
 * Created by Adam Seweryn
 */
public class FreqBonus extends Bonus {
    public FreqBonus(Payable payable) {
        super(payable);
    }

    @Override
    protected int getPaidBonus(int salary) {
        return 100;
    }
}
