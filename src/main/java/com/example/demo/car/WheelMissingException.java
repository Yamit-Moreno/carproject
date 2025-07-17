package com.example.demo.car;

/**
 * Exception thrown when attempting to drive the car without enough wheels.
 */
public class WheelMissingException extends RuntimeException {
    public WheelMissingException(String message) {
        super(message);
    }
}
