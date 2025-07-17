package com.example.demo.car;

/**
 * Exception thrown when attempting to drive with one or more doors open.
 */
public class DoorOpenException extends RuntimeException {
    public DoorOpenException(String message) {
        super(message);
    }
}
