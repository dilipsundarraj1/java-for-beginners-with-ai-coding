package com.modernjava._12polymorohism;

// Simple example: Runtime Polymorphism (Method Overriding)
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}

public class SimplePolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("\n--- Runtime Polymorphism ---");
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.start();
        v2.start();
    }
}

