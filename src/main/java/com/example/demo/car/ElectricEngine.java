package com.example.demo.car;

import org.springframework.stereotype.Component;

/**
 * Electric engine implementation for cars.
 * Extends AbstractEngine and starts the engine with an electric-specific message.
 */
@Component
public class ElectricEngine extends AbstractEngine {
    @Override
    public void start() {
        running = true;
        System.out.println("Electric engine started!");
    }
}
