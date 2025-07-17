package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.car.CarService;

/**
 * Unit tests for the CarService class.
 */
@SpringBootTest  // מריץ את כל האפליקציה של Spring ליצירת Beans אמיתיים
public class CarServiceTest {

    @Autowired
    private CarService carService; // ה־Bean האמיתי שנמצא ב־Spring

    /**
     * Checks that all wheels are inflated after yearly service.
     */
    @Test
    void allWheelsAreInflatedAfterService() {
        carService.serviceCar(); // מריצים טיפול שנתי
        assertTrue(carService.checkAllWheels(),
            "All wheels should be inflated after service");
    }

    /**
     * Checks that all doors are closed after yearly service.
     */
    @Test
    void allDoorsAreClosedAfterService() {
        carService.serviceCar(); // מריצים טיפול שנתי
        assertTrue(carService.checkAllDoors(),
            "All doors should be closed after service");
    }
}
