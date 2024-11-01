/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30085203
 */
public class Cat extends Pet {

    public Cat(int id, String name, int age, Toy favoriteToy) {
        super(id, name, age, favoriteToy); // Call superclass constructor
    }

    @Override
    public void speak() {
        System.out.println("Meow Meow");
    }

    public void meow() {
        System.out.println("Cat is meowing: Meow Meow");
    }
}

