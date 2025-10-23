package com.modernjava._12polymorohism.vehicle;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Vehicle reference, Car object
        Vehicle v2 = new Bike();  // Vehicle reference, Bike object
        v1.start();  // Calls Car's start()
        v2.start();  // Calls Bike's start()

    }
}

