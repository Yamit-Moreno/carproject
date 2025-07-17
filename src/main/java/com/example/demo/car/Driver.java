package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Represents a driver who operates a car.
 * Responsible for starting, driving, and stopping the car.
 */
@Component
public class Driver {

    private final Car car;

    /**
     * Constructs a driver with the injected car dependency.
     * @param car the car to be operated by the driver
     */
    @Autowired
    public Driver(Car car) {
        this.car = car;
    }

    /**
     * Simulates the driver taking a ride in the car:
     * starts, drives, and stops the car.
     */
    public void takeARide() {
        System.out.println("Driver is getting ready to drive...");
        car.start();
        car.drive();
        car.stop();
        System.out.println("Driver finished the ride.");
    }
}
