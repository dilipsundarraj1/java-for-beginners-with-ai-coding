package com.modernjava._11inheritance.animal;

// Base class demonstrating inheritance
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

