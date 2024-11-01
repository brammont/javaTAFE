/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.petsapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 30085203
 */
public class DogIT {
    
    @Test
    public void testSpeak() {
        Toy ball = new Toy(1, "Ball");
        Dog dog = new Dog(1, "Buddy", 3, ball);
        assertDoesNotThrow(dog::speak, "Dog's speak method should not throw an exception");
    }

    @Test
    public void testBark() {
        Toy ball = new Toy(1, "Ball");
        Dog dog = new Dog(1, "Buddy", 3, ball);
        assertDoesNotThrow(dog::bark, "Dog's bark method should not throw an exception");
    }
}