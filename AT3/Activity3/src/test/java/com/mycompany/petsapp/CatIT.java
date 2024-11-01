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
public class CatIT {
    
    @Test
    public void testSpeak() {
        Toy yarn = new Toy(2, "Yarn");
        Cat cat = new Cat(2, "Whiskers", 2, yarn);
        assertDoesNotThrow(cat::speak, "Cat's speak method should not throw an exception");
    }

    @Test
    public void testMeow() {
        Toy yarn = new Toy(2, "Yarn");
        Cat cat = new Cat(2, "Whiskers", 2, yarn);
        assertDoesNotThrow(cat::meow, "Cat's meow method should not throw an exception");
    }
}