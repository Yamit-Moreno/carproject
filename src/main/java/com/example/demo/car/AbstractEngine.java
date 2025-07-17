package com.example.demo.car;

/**
 * Abstract base class for engine implementations.
 * Handles engine running state and basic stop logic.
 */
public abstract class AbstractEngine implements Engine {
    protected boolean running = false;

    @Override
    public void stop() {
        running = false;
        System.out.println("Engine stopped.");
    }

    @Override
    public boolean isRunning() {
        return running;
    }
}

