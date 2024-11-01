/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.eggsorder;

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
public class EggsOrderIT {
    
    @Test
    public void testCalculateTotalAmount() {
        int eggs = 26;
        String expected = "You ordered 26 eggs.\nThat is 2 dozen eggs at $7.25 per dozen and 2 additional eggs at $0.75 each for a total of $16.00.";
        String result = EggsOrder.calculateTotalAmount(eggs);
        assertEquals(expected, result, "The calculated total amount message is incorrect.");
    }
}