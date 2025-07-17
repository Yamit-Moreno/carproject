package com.example.demo.car;

import java.util.List;

/**
 * Abstract base class for car implementations.
 * Holds shared logic and fields for car components.
 */
public abstract class AbstractCar implements Car {
    protected Engine engine;
    protected Gearbox gearbox;
    protected List<Wheel> wheels;
    protected List<Door> doors;

    public AbstractCar(Engine engine, Gearbox gearbox, List<Wheel> wheels, List<Door> doors) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.wheels = wheels;
        this.doors = doors;
    }

    @Override
    public void start() {
        engine.start();
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        engine.stop();
        System.out.println("Car stopped.");
    }

    /**
     * Drives the car. Must be implemented by subclasses.
     */
    @Override
    public abstract void drive();
}
