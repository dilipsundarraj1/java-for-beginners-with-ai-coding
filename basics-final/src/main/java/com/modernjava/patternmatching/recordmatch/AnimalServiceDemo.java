package com.modernjava.patternmatching.recordmatch;

public class AnimalServiceDemo {

    static void main(String[] args) {
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
        Cat cat = new Cat("Mittens", "White");
        System.out.println("Cat: " + service.retrieveNameV2(cat));

        // Test with Dog
        Dog dog = new Dog("Max", "Black");
        System.out.println("Dog: " + service.retrieveNameV2(dog));

        // Test with Cat with null name
        Cat catWithNullName = new Cat(null, "Gray");
        System.out.println("Cat with null name: '" + service.retrieveNameV2(catWithNullName) + "'");

        // Test with null
        System.out.println("Null: '" + service.retrieveNameV2(null) + "'");
    }

    // Test retrieveNameGuardedPattern() - Guarded pattern with when clause
    private static void testRetrieveNameGuardedPattern(AnimalService service) {
        // Test with Cat
        Cat cat = new Cat("Luna", "Black");
        System.out.println("Cat: " + service.retrieveNameGuardedPattern(cat));

        // Test with Dog
        Dog dog = new Dog("Rex", "Golden");
        System.out.println("Dog: " + service.retrieveNameGuardedPattern(dog));

        // Test with Cat with null name (guarded pattern will catch this)
        Cat catWithNullName = new Cat(null, "Spotted");
        System.out.println("Cat with null name: '" + service.retrieveNameGuardedPattern(catWithNullName) + "'");

        // Test with null
        System.out.println("Null: '" + service.retrieveNameGuardedPattern(null) + "'");
    }

    // Test retrieveNameGuardedPatternWithUnNamedVariables() - Unnamed variables with underscore
    private static void testRetrieveNameGuardedPatternWithUnNamedVariables(AnimalService service) {
        // Test with Cat
        Cat cat = new Cat("Simba", "Orange");
        System.out.println("Cat: " + service.retrieveNameGuardedPatternWithUnNamedVariables(cat));

        // Test with Dog
        Dog dog = new Dog("Lassie", "White");
        System.out.println("Dog: " + service.retrieveNameGuardedPatternWithUnNamedVariables(dog));

        // Test with Cat with null name
        Cat catWithNullName = new Cat(null, "Brown");
        System.out.println("Cat with null name: '" + service.retrieveNameGuardedPatternWithUnNamedVariables(catWithNullName) + "'");

        // Test with null
        System.out.println("Null: '" + service.retrieveNameGuardedPatternWithUnNamedVariables(null) + "'");
    }
}

