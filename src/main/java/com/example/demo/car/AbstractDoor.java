package com.example.demo.car;

/**
 * Abstract base class for door implementations.
 * Manages the basic open/close state and logic for doors.
 */
public abstract class AbstractDoor implements Door {
    private boolean open = false;

    @Override
    public boolean isOpen() {
        return open;
    }

    @Override
    public void open() {
        if (!open) {
            open = true;
            System.out.println("Door opened!");
        } else {
            System.out.println("Door is already open.");
        }
    }

    @Override
    public void close() {
        if (open) {
            open = false;
            System.out.println("Door closed!");
        } else {
            System.out.println("Door is already closed.");
        }
    }
}

