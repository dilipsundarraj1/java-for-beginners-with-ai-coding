package com.modernjava._11inheritance;

import com.modernjava._11inheritance.animal.Animal;
import com.modernjava._11inheritance.animal.Dog;
import com.modernjava._11inheritance.animal.Cat;
import com.modernjava._11inheritance.bank.BankAccount;
import com.modernjava._11inheritance.bank.CheckingAccount;
import com.modernjava._11inheritance.bank.SavingsAccount;
import com.modernjava._11inheritance.vehicle.GasVehicle;
import com.modernjava._11inheritance.vehicle.ElectricVehicle;

public class InheritanceDemo {
    public static void main(String[] args) {
        demoAnimalInheritance();
        demoBankAccountInheritance();
        demoVehicleInheritance();
    }

    private static void demoAnimalInheritance() {
        Animal genericAnimal = new Animal("GenericAnimal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        System.out.println("--- Animal/Dog/Cat Inheritance Demo ---");
        genericAnimal.speak(); // Output: GenericAnimal makes a sound.
        dog.speak();           // Output: Buddy barks.
        dog.fetch();           // Dog-specific behavior
        dog.wagTail();         // Dog-specific behavior
        cat.speak();           // Output: Whiskers meows.
        cat.meow();            // Cat-specific behavior
        cat.purr();            // Cat-specific behavior
        cat.scratch();         // Cat-specific behavior
    }

    private static void demoBankAccountInheritance() {
        System.out.println("\n--- BankAccount Inheritance Demo ---");
        BankAccount baseAccount = new BankAccount("BA123", 500.0);
        baseAccount.deposit(200);
        baseAccount.withdraw(100);
        System.out.println("Base Account Balance: " + baseAccount.getBalance());

        SavingsAccount savings = new SavingsAccount("SA456", 1000.0, 0.05);
        savings.deposit(500);
        savings.addInterest();
        savings.withdraw(200);
        System.out.println("Savings Account Balance: " + savings.getBalance());

        CheckingAccount checking = new CheckingAccount("CA789", 300.0, 200.0);
        checking.deposit(100);
        checking.withdraw(350); // Should use overdraft
        checking.withdraw(300); // Should fail (exceeds overdraft)
        System.out.println("Checking Account Balance: " + checking.getBalance());
    }

    private static void demoVehicleInheritance() {
        System.out.println("\n--- Vehicle Inheritance Demo ---");
        GasVehicle gasCar = new GasVehicle("Toyota Camry", 2020);
        ElectricVehicle electricCar = new ElectricVehicle("Tesla Model 3", 2023);

        gasCar.startEngine();      // Gas-specific engine start
        gasCar.refuel();           // Gas-specific behavior
        gasCar.emitExhaust();      // Gas-specific behavior

        electricCar.startEngine(); // Electric-specific engine start
        electricCar.chargeBattery(); // Electric-specific behavior
        electricCar.ecoMode();       // Electric-specific behavior
    }
}
