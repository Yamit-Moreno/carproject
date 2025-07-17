package com.example.demo.car;

/**
 * Abstract base class for wheel implementations.
 * Manages the inflated state and basic inflate logic for wheels.
 */
public abstract class AbstractWheel implements Wheel {
    private boolean inflated = false;

    @Override
    public boolean isInflated() {
        return inflated;
    }

    @Override
    public void inflate() {
        if (!inflated) {
            inflated = true;
            System.out.println("Wheel inflated!");
        } else {
            System.out.println("Wheel is already inflated.");
        }
    }
}
