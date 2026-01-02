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

    }

    // Test retrieveNameGuardedPattern() - Guarded pattern with when clause
    private static void testRetrieveNameGuardedPattern(AnimalService service) {
    }

    // Test retrieveNameGuardedPatternWithUnNamedVariables() - Unnamed variables with underscore
    private static void testRetrieveNameGuardedPatternWithUnNamedVariables(AnimalService service) {
    }
}

