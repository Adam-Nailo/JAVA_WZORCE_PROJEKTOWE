package org.wzorce_projektowe;


import org.wzorce_projektowe.adapter.OfficialTrippingEmployee;
import org.wzorce_projektowe.decorator.DeadlineBonus;
import org.wzorce_projektowe.decorator.FreqBonus;
import org.wzorce_projektowe.decorator.Payable;
import org.wzorce_projektowe.decorator.SpecialBonus;
import org.wzorce_projektowe.models.FamilyHouse;
import org.wzorce_projektowe.obsevers.ObservableTempValue;
import org.wzorce_projektowe.strategy.*;

/**
 * Created by Adam Seweryn
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        creationPatterns();
//        observerPattern();

        ApiFacade facade = new ApiFacade();
        Employee mike = facade.createDoctor(10000);
        facade.pushDoctorToJob(mike);
        System.out.println("zarobki " + facade.countSalary(mike));
        facade.giveFreeHouseToBestFreqEmployee(mike);
    }

    private static void observerPattern() throws InterruptedException {
//        obsługa interfejsu użytkownika
//        obsługa zmian repozytorium
//        obsługa zmian w czujnikach

        ObservableTempValue observableValue = new ObservableTempValue();

        observableValue.addObserver((o, arg) -> System.out.println("1 " + arg.toString()));
        observableValue.addObserver((o, arg) -> System.out.println("2 " + arg.toString()));

        while (true) {
            Thread.sleep(500);
            observableValue.setValue((int) (observableValue.getOldTemp() + Math.random() * 6 - 2));
        }
    }


    private static void creationPatterns() {
        //        BUILDER
        House dom = new House("ul. Wysoka 2", 2, 3, 12);
        House domek = House.builder()
                .adress("ul.Wysoka 2")
                .floorsNumber(2)
                .doorsNumber(3)
                .windowsNumber(12)
                .build();
        System.out.println(domek);

//        STATYCZNE METODY WYTWÓRCZE
//        from, of, valueOf, instanceOf
        boolean isTrue = true;
        Boolean.valueOf(isTrue);

        FamilyHouse familyHouse = FamilyHouse.from(domek);
        System.out.println(familyHouse);

//        SINGLETON
        Logger.getInstance().logToConsole();
    }
}