package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.car.CarService;

/**
 * Unit tests for the {@link CarService} class.
 * <p>
 * This test class uses Spring Boot's testing support to load the application context
 */
@SpringBootTest  // Boots up the full Spring application context for testing
public class CarServiceTest {

    /**
     * The CarService bean injected by Spring for testing its methods.
     */
    @Autowired
    private CarService carService;

    /**
     * Test that all wheels are inflated after the yearly service is performed.
     * Calls {@link CarService#serviceCar()} and asserts that
     * {@link CarService#checkAllWheels()} returns true.
     */
    @Test
    void allWheelsAreInflatedAfterService() {
        carService.serviceCar(); // Perform yearly maintenance
        assertTrue(carService.checkAllWheels(),
            "All wheels should be inflated after service");
    }

    /**
     * Test that all doors are closed after the yearly service is performed.
     * Calls {@link CarService#serviceCar()} and asserts that
     * {@link CarService#checkAllDoors()} returns true.
     */
    @Test
    void allDoorsAreClosedAfterService() {
        carService.serviceCar(); // Perform yearly maintenance
        assertTrue(carService.checkAllDoors(),
            "All doors should be closed after service");
    }
}
