package org.wzorce_projektowe;


/**
 * Created by Adam Seweryn
 */

public class Main {
    public static void main(String[] args) {

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

    }
}