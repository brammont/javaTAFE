/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petsapp;

/**
 *
 * @author 30085203
 */
public class Pet {
    private int id;
    private String name;
    private int age;
    private Toy favoriteToy;

    // Constructor
    public Pet(int id, String name, int age, Toy favoriteToy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.favoriteToy = favoriteToy;
    }

    // Method to be overridden by subclasses
    public void speak() {
        System.out.println("Pet speaks");
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Toy getFavoriteToy() {
        return favoriteToy;
    }
}

