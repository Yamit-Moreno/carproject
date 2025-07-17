package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Standard implementation of a car.
 * Uses a gasoline engine, gearbox, wheels, and doors.
 * Handles driving logic and checks for engine, wheels, and door conditions.
 */
@Component
public class StandardCar extends AbstractCar {

    /**
     * Constructs a standard car with the given components.
     * @param engine  the engine for the car (qualified as "gasolineEngine")
     * @param gearbox the gearbox of the car
     * @param wheels  the list of wheels attached to the car
     * @param doors   the list of doors in the car
     */
    @Autowired
    public StandardCar(
            @Qualifier("gasolineEngine") Engine engine,
            Gearbox gearbox,
            List<Wheel> wheels,
            List<Door> doors) {
        super(engine, gearbox, wheels, doors);
    }

    /**
     * Drives the car, performing all required checks for engine, wheels, and doors.
     * Throws a custom exception if conditions are not met.
     */
    @Override
    public void drive() {
        if (!engine.isRunning()) {
            throw new EngineNotRunningException("Can't drive! Engine is not running.");
        }

        if (wheels == null || wheels.size() < 4) {
            throw new WheelMissingException("Not enough wheels!");
        }
        if (doors != null && !doors.isEmpty()) {
            boolean anyOpen = doors.stream().anyMatch(Door::isOpen);
            if (anyOpen) {
                throw new DoorOpenException("Can't drive! One or more doors are open.");
            }
        }
        System.out.println("Driving with " + gearbox.getCurrentGear() + " gear.");
        gearbox.shiftUp();
        System.out.println("Car is moving forward!");
    }
}
