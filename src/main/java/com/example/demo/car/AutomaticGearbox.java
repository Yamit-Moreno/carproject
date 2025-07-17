package com.example.demo.car;

import org.springframework.stereotype.Component;

/**
 * Automatic gearbox implementation.
 * Supports shifting gears up and down automatically.
 */
@Component
public class AutomaticGearbox implements Gearbox {
    private int currentGear = 1;

    @Override
    public void shiftUp() {
        currentGear++;
        System.out.println("Automatic gearbox shifted up to gear " + currentGear);
    }

    @Override
    public void shiftDown() {
        if (currentGear > 1) {
            currentGear--;
            System.out.println("Automatic gearbox shifted down to gear " + currentGear);
        }
    }

    @Override
    public int getCurrentGear() {
        return currentGear;
    }
}
