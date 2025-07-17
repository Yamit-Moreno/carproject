package com.example.demo.car;

/**
 * Interface representing a car engine.
 * Provides methods to start, stop, and check if the engine is running.
 */
public interface Engine {
    /**
     * Starts the engine.
     */
    void start();

    /**
     * Stops the engine.
     */
    void stop();

    /**
     * Checks if the engine is running.
     * @return true if the engine is running, false otherwise
     */
    boolean isRunning();
}
