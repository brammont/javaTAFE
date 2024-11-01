/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30085203
 */
public class Dog extends Pet {

    public Dog(int id, String name, int age, Toy favoriteToy) {
        super(id, name, age, favoriteToy); // Call superclass constructor
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof");
    }

    public void bark() {
        System.out.println("Dog is barking: Woof Woof");
    }
}

