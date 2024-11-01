/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.petsapp;

/**
 *
 * @author 30085203
 */
public class PetsApp {
    public static void main(String[] args) {
        // Create Toy objects for pets
        Toy ball = new Toy(1, "Ball");
        Toy yarn = new Toy(2, "Yarn");

        Pet myPet;

        // Demonstrate polymorphism with Dog
        myPet = new Dog(1, "Buddy", 3, ball);
        System.out.print("Dog: ");
        myPet.speak();  // This will call the Dog's speak method
        if (myPet instanceof Dog) {
            ((Dog) myPet).bark();  // Cast to Dog to call bark method
        }

        System.out.println();

        // Demonstrate polymorphism with Cat
        myPet = new Cat(2, "Whiskers", 2, yarn);
        System.out.print("Cat: ");
        myPet.speak();  // This will call the Cat's speak method
        if (myPet instanceof Cat) {
            ((Cat) myPet).meow();  // Cast to Cat to call meow method
        }
    }
}

