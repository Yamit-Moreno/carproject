package com.example.demo;

import com.example.demo.car.Driver;
import com.example.demo.car.Wheel;
import com.example.demo.car.StandardWheel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import com.example.demo.car.Door;
import com.example.demo.car.StandardDoor;
import com.example.demo.car.CarService;
import com.example.demo.car.DoorOpenException;
import com.example.demo.car.WheelMissingException;
import com.example.demo.car.EngineNotRunningException;

import java.util.List;

/**
 * Main entry point for the Spring Boot Car Project application.
 * Configures beans and runs the main car simulation logic.
 */
@SpringBootApplication
public class CarprojectApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarprojectApplication.class, args);
    }

    /**
     * CommandLineRunner bean to simulate car actions at application startup.
     * @param driver the injected Driver bean
     * @param carService the injected CarService bean
     * @param doors the injected list of Door beans
     * @return a lambda that runs the simulation
     */
    @Bean
    public CommandLineRunner run(Driver driver, CarService carService, List<Door> doors) {
        return args -> {
            // Initial car report
            System.out.println(carService.getCarReport());

            // Yearly car service: close doors, inflate wheels
            carService.serviceCar();

            // Car report after service
            System.out.println(carService.getCarReport());

            // Status check
            carService.checkCarStatus();

            // Open first door
            doors.get(0).open();

            // Attempt to drive with door open (should throw exception)
            try {
                driver.takeARide();
            } catch (DoorOpenException | WheelMissingException ex) {
                System.out.println("EXCEPTION CAUGHT: " + ex.getMessage());
            }

            // Close the door
            doors.get(0).close();

            // Valid drive
            try {
                driver.takeARide();
            } catch (DoorOpenException | WheelMissingException ex) {
                System.out.println("EXCEPTION CAUGHT: " + ex.getMessage());
            }

            // Another drive attempt to catch more exceptions
            try {
                driver.takeARide();
            } catch (DoorOpenException | WheelMissingException | EngineNotRunningException ex) {
                System.out.println("EXCEPTION CAUGHT: " + ex.getMessage());
            }

            // Inflate wheels
            carService.inflateAllWheels();

            // Final car report
            System.out.println(carService.getCarReport());
        };
    }

    /**
     * Bean providing a list of four standard wheels for the car.
     * @return list of StandardWheel objects
     */
    @Bean
    public List<Wheel> wheels() {
        return List.of(
            new StandardWheel(),
            new StandardWheel(),
            new StandardWheel(),
            new StandardWheel()
        );
    }

    /**
     * Bean providing a list of four standard doors for the car.
     * @return list of StandardDoor objects
     */
    @Bean
    public List<Door> doors() {
        return List.of(
            new StandardDoor(),
            new StandardDoor(),
            new StandardDoor(),
            new StandardDoor()
        );
    }
}

