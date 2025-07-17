package com.example.demo.car;

/**
 * Interface representing a car gearbox.
 * Provides methods to shift gears and get the current gear.
 */
public interface Gearbox {
    /**
     * Shifts the gearbox up by one gear.
     */
    void shiftUp();

    /**
     * Shifts the gearbox down by one gear.
     */
    void shiftDown();

    /**
     * Returns the current gear of the gearbox.
     * @return the current gear number
     */
    int getCurrentGear();
}
