package org.wzorce_projektowe.decorator;

/**
 * Created by Adam Seweryn
 */
public abstract class Bonus implements Payable {

    private Payable payable;

    Bonus(Payable payable) {
        this.payable = payable;
    }

    @Override
    public int getSalary() {
        return payable.getSalary() + getPaidBonus(payable.getSalary());
    }

    abstract protected int getPaidBonus(int salary);
}
