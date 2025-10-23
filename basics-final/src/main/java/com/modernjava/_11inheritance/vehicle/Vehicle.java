package com.modernjava._11inheritance.vehicle;

// Base class for all vehicles
public class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Common method for all vehicles
    public void startEngine() {
        System.out.println("Engine started for " + model + " (" + year + ")");
    }
}
