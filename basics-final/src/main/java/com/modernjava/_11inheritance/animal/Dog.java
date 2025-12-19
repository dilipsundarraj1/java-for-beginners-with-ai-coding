package com.modernjava._11inheritance.animal;

// Subclass inheriting from Animal
public class Dog extends Animal {

    // Constructor to initialize the dog with a name
    public Dog(String name) {
        super(name);
    }

    // Override speak() method to make the dog bark
    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }

    // Make the dog fetch the ball as a specific behavior
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    // Make the dog wag its tail as a specific behavior
    public void wagTail() {
        System.out.println(name + " is wagging its tail.");
    }
}
