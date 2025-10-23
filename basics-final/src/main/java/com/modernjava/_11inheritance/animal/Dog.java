package com.modernjava._11inheritance.animal;

// Subclass inheriting from Animal
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    // Overriding the speak method
    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }

    // Dog-specific behavior: fetch
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    // Dog-specific behavior: wag tail
    public void wagTail() {
        System.out.println(name + " is wagging its tail.");
    }
}
