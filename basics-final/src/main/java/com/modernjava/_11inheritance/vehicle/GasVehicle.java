package com.modernjava._11inheritance.vehicle;

// Subclass representing a gas-powered vehicle
public class GasVehicle extends Vehicle {
    // Constructor to initialize gas vehicle with model and year
    public GasVehicle(String model, int year) {
        super(model, year);
    }

    // Override startEngine() method to start the engine with gasoline
    @Override
    public void startEngine() {
        System.out.println(model + " (" + year + ") engine started with gasoline.");
    }

    // Refuel the gas vehicle at a gas station
    public void refuel() {
        System.out.println(model + " is refueling at the gas station.");
    }

    // Make the gas vehicle emit exhaust fumes as a specific behavior
    public void emitExhaust() {
        System.out.println(model + " is emitting exhaust fumes.");
    }
}

