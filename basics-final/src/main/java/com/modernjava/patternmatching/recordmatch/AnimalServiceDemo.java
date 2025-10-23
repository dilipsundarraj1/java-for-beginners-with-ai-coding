package com.modernjava.patternmatching.recordmatch;

public class AnimalServiceDemo {

    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();

        // Create sample animals
        Cat cat1 = new Cat("Whiskers", "Orange");
        Cat catWithNullName = new Cat(null, "Black");
        Dog dog1 = new Dog("Buddy", "Golden");

        System.out.println("=== AnimalService Demo ===\n");

        // Test retrieveName method
        System.out.println("Testing retrieveName method:");
        System.out.println("Cat (Whiskers): " + animalService.retrieveName(cat1));
        System.out.println("Cat (null name): " + animalService.retrieveName(catWithNullName));
        System.out.println("Dog (Buddy): " + animalService.retrieveName(dog1));
        System.out.println("Null animal: " + animalService.retrieveName(null));

        System.out.println("\n" + "=".repeat(40) + "\n");

        // Test retrieveNameV2 method
        System.out.println("Testing retrieveNameV2 method:");
        System.out.println("Cat (Whiskers): " + animalService.retrieveNameV2(cat1));
        System.out.println("Cat (null name): " + animalService.retrieveNameV2(catWithNullName));
        System.out.println("Dog (Buddy): " + animalService.retrieveNameV2(dog1));
        System.out.println("Null animal: " + animalService.retrieveNameV2(null));

        System.out.println("\n" + "=".repeat(40) + "\n");

        // Test retrieveNameGuardedPattern method
        System.out.println("Testing retrieveNameGuardedPattern method:");
        System.out.println("Cat (Whiskers): " + animalService.retrieveNameGuardedPattern(cat1));
        System.out.println("Cat (null name): " + animalService.retrieveNameGuardedPattern(catWithNullName));
        System.out.println("Dog (Buddy): " + animalService.retrieveNameGuardedPattern(dog1));
        System.out.println("Null animal: " + animalService.retrieveNameGuardedPattern(null));

        // Test retrieveNameGuardedPatternWithUnnamedVariables method
        System.out.println("Testing retrieveNameGuardedPattern method:");
        System.out.println("Cat (Whiskers): " + animalService.retrieveNameGuardedPatternWithUnNamedVariables(cat1));
        System.out.println("Cat (null name): " + animalService.retrieveNameGuardedPatternWithUnNamedVariables(catWithNullName));
        System.out.println("Dog (Buddy): " + animalService.retrieveNameGuardedPatternWithUnNamedVariables(dog1));
        System.out.println("Null animal: " + animalService.retrieveNameGuardedPatternWithUnNamedVariables(null));

        System.out.println("\n=== Demo Complete ===");
    }
}
