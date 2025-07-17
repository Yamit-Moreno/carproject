package com.example.demo.car;

import org.springframework.stereotype.Component;

/**
 * Gasoline engine implementation for cars.
 * Extends AbstractEngine and starts the engine with a gasoline-specific message.
 */
@Component
public class GasolineEngine extends AbstractEngine {

    @Override
    public void start() {
        running = true;
        System.out.println("Gasoline engine started!");
    }
}
