package com.modernjava._11inheritance.animal;

// Subclass inheriting from Animal
public class Cat extends Animal {
    // Constructor to initialize the cat with a name
    public Cat(String name) {
        super(name);
    }

    // Override speak() method to make the cat meow
    @Override
    public void speak() {
        System.out.println(name + " meows.");
    }

    // Make the cat purr as a specific behavior
    public void purr() {
        System.out.println(name + " is purring.");
    }

    // Make the cat scratch furniture as a specific behavior
    public void scratch() {
        System.out.println(name + " is scratching the furniture.");
    }

    // Make the cat say meow as a specific behavior
    public void meow() {
        System.out.println(name + " says meow!");
    }
}

