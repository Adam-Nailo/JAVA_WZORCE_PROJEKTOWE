package org.wzorce_projektowe;

import lombok.Builder;
import lombok.Data;

/**
 * Created by Adam Seweryn
 */

public class Main {
    public static void main(String[] args) {
        House dom = new House("ul. Wysoka 2", 2, 3, 12);
        House domek = House.builder()
                .adress("ul.Wysoka 2")
                .floorsNumber(2)
                .doorsNumber(3)
                .windowsNumber(12)
                .build();
        System.out.println(domek);
    }
}