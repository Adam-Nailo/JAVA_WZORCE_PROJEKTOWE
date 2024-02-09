package org.wzorce_projektowe.obsevers;

import lombok.Getter;

import java.util.Observable;

/**
 * Created by Adam Seweryn
 */
@Getter
public class ObservableTempValue extends Observable {
    private int oldTemp = 0;
    public void setValue(int newTemp) {
        if (newTemp !=oldTemp){
            super.setChanged();
            super.notifyObservers(newTemp);
            oldTemp = newTemp;
        }

    }
}
