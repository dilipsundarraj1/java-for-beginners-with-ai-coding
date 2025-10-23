package com.modernjava._11inheritance.vehicle;

// Subclass representing a gas-powered vehicle
public class GasVehicle extends Vehicle {
    public GasVehicle(String model, int year) {
        super(model, year);
    }

    @Override
    public void startEngine() {
        System.out.println(model + " (" + year + ") engine started with gasoline.");
    }

    public void refuel() {
        System.out.println(model + " is refueling at the gas station.");
    }

    public void emitExhaust() {
        System.out.println(model + " is emitting exhaust fumes.");
    }
}

