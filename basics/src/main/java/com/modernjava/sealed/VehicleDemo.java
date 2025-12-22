package com.modernjava.sealed;

public class VehicleDemo {
    static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println("car instanceof Car: " + (car instanceof Car));
        System.out.println("car instanceof Truck: " + (car instanceof Truck));
        System.out.println("truck instanceof Car: " + (truck instanceof Car));
        System.out.println("truck instanceof Truck: " + (truck instanceof Truck));


    }
}

