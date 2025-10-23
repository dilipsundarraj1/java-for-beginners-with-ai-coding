package com.modernjava.sealed;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println("car instanceof Car: " + (car instanceof Car));
        System.out.println("car instanceof Truck: " + (car instanceof Truck));
        System.out.println("truck instanceof Car: " + (truck instanceof Car));
        System.out.println("truck instanceof Truck: " + (truck instanceof Truck));

        // Testing with FlyingCar and ElectricTruck
        Vehicle flyingCar = new Car();
        System.out.println("flyingCar instanceof Car: " + (flyingCar instanceof Vehicle));

        Vehicle electricTruck = new ElectricTruck();
        System.out.println("electricTruck instanceof Truck: " + (electricTruck instanceof Truck));

        // Polymorphic behavior
        var carDrive = car.drive();
        System.out.println("car drive: " + carDrive);

        var truckDrive = truck.drive();
        System.out.println("truck drive: " + truckDrive);

        var electricTruckDrive =electricTruck.drive();
        System.out.println("electricTruckDrive : " + electricTruckDrive);

    }
}

