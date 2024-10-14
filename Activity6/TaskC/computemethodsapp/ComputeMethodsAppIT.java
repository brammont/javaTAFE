/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package computemethodsapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 30085203
 */
public class ComputeMethodsAppIT {
    private ComputeMethods compute;
    public ComputeMethodsAppIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        compute = new ComputeMethods();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class ComputeMethodsApp.
     */
    @Test
    public void testFToC() {
        // Test cases for the fToC method
        assertEquals(0.0, compute.fToC(32.0), "32°F should be 0°C");
        assertEquals(100.0, compute.fToC(212.0), "212°F should be 100°C");
        assertEquals(-40.0, compute.fToC(-40.0), "-40°F should be -40°C");
        assertEquals(37.7778, compute.fToC(100.0), 0.0001, "100°F should be approximately 37.78°C");
        assertEquals(20.0, compute.fToC(68.0), "68°F should be 20°C");
        assertEquals(15.5556, compute.fToC(60.0), 0.0001, "60°F should be approximately 15.56°C");
        assertEquals(-17.7778, compute.fToC(0.0), 0.0001, "0°F should be approximately -17.78°C");
        assertEquals(26.6667, compute.fToC(80.0), 0.0001, "80°F should be approximately 26.67°C");
        assertEquals(37.0, compute.fToC(98.6), 0.0001, "98.6°F should be approximately 37.0°C");
        assertEquals(10.0, compute.fToC(50.0), "50°F should be 10°C");
    }
    
}
