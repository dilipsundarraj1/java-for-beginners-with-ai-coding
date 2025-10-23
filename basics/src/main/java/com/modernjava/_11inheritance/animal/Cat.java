package com.modernjava._11inheritance.animal;

// Subclass inheriting from Animal
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Overriding the speak method
    @Override
    public void speak() {
        System.out.println(name + " meows.");
    }

    // Cat-specific behavior: purr
    public void purr() {
        System.out.println(name + " is purring.");
    }

    // Cat-specific behavior: scratch
    public void scratch() {
        System.out.println(name + " is scratching the furniture.");
    }

    // Cat-specific behavior: meow
    public void meow() {
        System.out.println(name + " says meow!");
    }
}

