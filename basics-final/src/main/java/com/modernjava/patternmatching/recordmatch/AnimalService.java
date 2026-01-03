package com.modernjava.patternmatching.recordmatch;

public class AnimalService {

    public String retrieveName(Animal animal) {
        return switch (animal) {
            case null -> ""; // This handles the null pointer exception.
            case Cat cat -> cat.name();
            case Dog dog -> dog.name();
        };

    }

    /*
    Record deconstruction pattern matching
     */
    public String retrieveNameV2(Animal animal) {
        return switch (animal) {
            case null -> ""; // This handles the null pointer exception.
            case Cat(String name, String color) -> name; // Pattern matching with record patterns
            case Dog(String name, String color) -> name; // Pattern matching with record patterns
        };
    }

    /*
    Record deconstruction pattern matching with guarded patterns
     */
    public String retrieveNameV3(Animal animal) {
        return switch (animal) {
            case null -> ""; // This handles the null pointer exception.
            case Cat(String name, String color) when name != null -> name; // Guarded pattern: name must not be null
            case Dog(String name, String color) when name != null -> name; // Guarded pattern: name must not be null
            default -> ""; // Return empty string if name is null or no match
        };
    }

    public String retrieveNameV4(Animal animal) {
        return switch (animal) {
            case null -> ""; // This handles the null pointer exception.
            case Cat(String name, String _) when name != null -> name; // Guarded pattern: name must not be null
            case Dog(String name, String _) when name != null -> name; // Guarded pattern: name must not be null
            default -> ""; // Return empty string if name is null or no match
        };
    }

}

