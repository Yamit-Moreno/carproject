package com.example.demo.car;

/**
 * Exception thrown when attempting to operate the car while the engine is not running.
 */
public class EngineNotRunningException extends RuntimeException {
    public EngineNotRunningException(String message) {
        super(message);
    }
}
