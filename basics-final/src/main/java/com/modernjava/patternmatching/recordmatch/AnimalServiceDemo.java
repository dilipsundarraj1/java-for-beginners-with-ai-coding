package com.modernjava.patternmatching.recordmatch;

public class AnimalServiceDemo {

    public static void main(String[] args) {
        AnimalService service = new AnimalService();

        System.out.println("========== Testing retrieveName() ==========");
        testRetrieveName(service);

        System.out.println("\n========== Testing retrieveNameV2() ==========");
        testRetrieveNameV2(service);

        System.out.println("\n========== Testing retrieveNameGuardedPattern() ==========");
        testRetrieveNameGuardedPattern(service);

        System.out.println("\n========== Testing retrieveNameGuardedPatternWithUnNamedVariables() ==========");
        testRetrieveNameGuardedPatternWithUnNamedVariables(service);
    }

    // Test retrieveName() - Basic type pattern matching
    private static void testRetrieveName(AnimalService service) {
        // Test with Cat
        Cat cat = new Cat("Whiskers", "Orange");
        System.out.println("Cat: " + service.retrieveName(cat));

        // Test with Dog
        Dog dog = new Dog("Buddy", "Brown");
        System.out.println("Dog: " + service.retrieveName(dog));

        // Test with null
        System.out.println("Null: '" + service.retrieveName(null) + "'");
    }

    // Test retrieveNameV2() - Record deconstruction pattern
    private static void testRetrieveNameV2(AnimalService service) {
        // Test with Cat
        Cat cat = new Cat("Whiskers", "Orange");
        System.out.println("Cat: " + service.retrieveNameV2(cat));

        // Test with Dog
        Dog dog = new Dog("Buddy", "Brown");
        System.out.println("Dog: " + service.retrieveNameV2(dog));

        // Test with null
        System.out.println("Null: '" + service.retrieveNameV2(null) + "'");
    }

    // Test retrieveNameGuardedPattern() - Guarded pattern with when clause
    private static void testRetrieveNameGuardedPattern(AnimalService service) {
        // Test with Cat
        Cat cat = new Cat("Whiskers", "Orange");
        System.out.println("Cat: " + service.retrieveNameV3(cat));

        // Test with Dog
        Dog dog = new Dog("Buddy", "Brown");
        System.out.println("Dog: " + service.retrieveNameV3(dog));

        // Test with null animal
        System.out.println("Null: '" + service.retrieveNameV3(null) + "'");

        // Test with Cat with null name
        Cat catWithNullName = new Cat(null, "Orange");
        System.out.println("Cat with null name: '" + service.retrieveNameV3(catWithNullName) + "'");

        // Test with Dog with null name
        Dog dogWithNullName = new Dog(null, "Brown");
        System.out.println("Dog with null name: '" + service.retrieveNameV3(dogWithNullName) + "'");
    }

    // Test retrieveNameGuardedPatternWithUnNamedVariables() - Unnamed variables with underscore
    private static void testRetrieveNameGuardedPatternWithUnNamedVariables(AnimalService service) {
        // Test with Cat
        Cat cat = new Cat("Whiskers", "Orange");
        System.out.println("Cat: " + service.retrieveNameV4(cat));

        // Test with Dog
        Dog dog = new Dog("Buddy", "Brown");
        System.out.println("Dog: " + service.retrieveNameV4(dog));

        // Test with null animal
        System.out.println("Null: '" + service.retrieveNameV4(null) + "'");

        // Test with Cat with null name
        Cat catWithNullName = new Cat(null, "Orange");
        System.out.println("Cat with null name: '" + service.retrieveNameV4(catWithNullName) + "'");

        // Test with Dog with null name
        Dog dogWithNullName = new Dog(null, "Brown");
        System.out.println("Dog with null name: '" + service.retrieveNameV4(dogWithNullName) + "'");
    }
}

