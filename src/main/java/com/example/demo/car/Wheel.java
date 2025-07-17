package com.example.demo.car;

/**
 * Interface representing a car wheel.
 * Provides methods to check inflation state and inflate the wheel.
 */
public interface Wheel {
    /**
     * Checks if the wheel is inflated.
     * @return true if the wheel is inflated, false otherwise
     */
    boolean isInflated();

    /**
     * Inflates the wheel.
     */
    void inflate();
}
