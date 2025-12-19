package com.modernjava._11inheritance.vehicle;

// Subclass representing an electric vehicle
public class ElectricVehicle extends Vehicle {
    // Constructor to initialize electric vehicle with model and year
    public ElectricVehicle(String model, int year) {
        super(model, year);
    }

    // Override startEngine() method to start the engine silently (electric)
    @Override
    public void startEngine() {
        System.out.println(model + " (" + year + ") engine started silently (electric).");
    }

    // Charge the battery of the electric vehicle as a specific behavior
    public void chargeBattery() {
        System.out.println(model + " is charging its battery.");
    }

    // Enable eco mode to optimize energy consumption in the electric vehicle
    public void ecoMode() {
        System.out.println(model + " is now in eco mode.");
    }
}

