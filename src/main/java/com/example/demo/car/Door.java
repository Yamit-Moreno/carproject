package com.example.demo.car;

/**
 * Interface representing a car door.
 * Provides operations to open, close, and check if the door is open.
 */
public interface Door {
    /**
     * Opens the door.
     */
    void open();

    /**
     * Closes the door.
     */
    void close();

    /**
     * Checks if the door is open.
     * @return true if the door is open, false otherwise
     */
    boolean isOpen();
}
