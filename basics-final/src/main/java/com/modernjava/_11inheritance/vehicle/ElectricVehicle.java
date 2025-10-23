package com.modernjava._11inheritance.vehicle;

// Subclass representing an electric vehicle
public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(String model, int year) {
        super(model, year);
    }

    @Override
    public void startEngine() {
        System.out.println(model + " (" + year + ") engine started silently (electric).");
    }

    public void chargeBattery() {
        System.out.println(model + " is charging its battery.");
    }

    public void ecoMode() {
        System.out.println(model + " is now in eco mode.");
    }
}

