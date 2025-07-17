package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for car maintenance operations and status reporting.
 * Provides yearly service, wheels and doors checks, and status reports for a car.
 */
@Service
public class CarService {

    private final Car car;

    /**
     * Constructs the CarService with the injected car dependency.
     * @param car the car to maintain and report on
     */
    @Autowired
    public CarService(Car car) {
        this.car = car;
    }

    /**
     * Returns a detailed status report of the car.
     * @return car report as a string
     */
    public String getCarReport() {
        StringBuilder sb = new StringBuilder("=== Car Report ===\n");
        if (car instanceof StandardCar stdCar) {
            sb.append("Engine running: ").append(stdCar.engine.isRunning()).append("\n");
            sb.append("Number of wheels: ").append(stdCar.wheels != null ? stdCar.wheels.size() : 0).append("\n");
            sb.append("All wheels inflated: ").append(checkAllWheels()).append("\n");
            sb.append("Number of doors: ").append(stdCar.doors != null ? stdCar.doors.size() : 0).append("\n");
            sb.append("All doors closed: ").append(checkAllDoors()).append("\n");
        }
        sb.append("=========================\n");
        return sb.toString();
    }

    /**
     * Performs yearly car maintenance: closes all doors and inflates all wheels.
     */
    public void serviceCar() {
        System.out.println("=== Yearly Car Service ===");
        // Close all doors
        if (car instanceof StandardCar stdCar && stdCar.doors != null) {
            stdCar.doors.forEach(Door::close);
            System.out.println("All doors are now closed!");
        }
        // Inflate all wheels
        if (car instanceof StandardCar stdCar2 && stdCar2.wheels != null) {
            stdCar2.wheels.forEach(Wheel::inflate);
            System.out.println("All wheels are now inflated!");
        }
        System.out.println("Car yearly service finished!");
    }

    /**
     * Checks if all wheels are inflated.
     * @return true if all wheels are inflated, false otherwise
     */
    public boolean checkAllWheels() {
        if (car instanceof StandardCar stdCar && stdCar.wheels != null) {
            return stdCar.wheels.stream().allMatch(Wheel::isInflated);
        }
        return false;
    }

    /**
     * Checks if all doors are closed.
     * @return true if all doors are closed, false otherwise
     */
    public boolean checkAllDoors() {
        if (car instanceof StandardCar stdCar && stdCar.doors != null) {
            return stdCar.doors.stream().noneMatch(Door::isOpen);
        }
        return false;
    }

    /**
     * Prints a short car status report to the console.
     */
    public void checkCarStatus() {
        System.out.println(getCarReport());
    }

    /**
     * Inflates all wheels if they are not already inflated.
     */
    public void inflateAllWheels() {
        if (car instanceof StandardCar stdCar && stdCar.wheels != null) {
            stdCar.wheels.forEach(wheel -> {
                if (!wheel.isInflated()) {
                    wheel.inflate();
                }
            });
            System.out.println("All wheels are now inflated!");
        }
    }
}
