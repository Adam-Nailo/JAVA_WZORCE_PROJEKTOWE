package org.wzorce_projektowe.models;

import lombok.Builder;
import lombok.Data;
import org.wzorce_projektowe.House;

/**
 * Created by Adam Seweryn
 */
@Builder
@Data
public class FamilyHouse {
    private String adress;
    private int floorsNumber;

    public static FamilyHouse from(House domek) {
        return new FamilyHouse(domek.getAdress(), domek.getFloorsNumber());
    }

}
