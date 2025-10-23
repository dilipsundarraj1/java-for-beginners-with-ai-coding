package com.modernjava._9functionalprogramming;

import com.modernjava.domain.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * This class demonstrates the four types of Method References in Java:
 * 1. Reference to a static method (ClassName::staticMethod)
 * 2. Reference to an instance method of a particular object (object::instanceMethod)
 * 3. Reference to an instance method of an arbitrary object of a class (ClassName::instanceMethod)
 * 4. Reference to a constructor (ClassName::new)
 */
public class _2MethodReferencesExample {

    public static void main(String[] args) {
        System.out.println("=== Exploring Method References ===\n");

        referenceToStaticMethod();
        referenceToInstanceMethodOfParticularObject();
        referenceToInstanceMethodOfArbitraryObject();
        referenceToConstructor();
    }

    /**
     * 1. Reference to a static method: ClassName::staticMethod
     * Used when you want to call a static method as a method reference
     */
    private static void referenceToStaticMethod() {
        System.out.println("1. Reference to Static Method (ClassName::staticMethod):");

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");

        // Using lambda expression
        List<Integer> integersWithLambda = numbers.stream()
            .map(s -> Integer.parseInt(s))
            .toList();

        // Using method reference to static method Integer.parseInt
        List<Integer> integersWithMethodRef = numbers.stream()
            .map(Integer::parseInt)
            .toList();

        System.out.println("Original strings: " + numbers);
        System.out.println("Converted to integers (lambda): " + integersWithLambda);
        System.out.println("Converted to integers (method ref): " + integersWithMethodRef);

        // Another example with Math.abs
        List<Integer> negativeNumbers = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> absoluteValues = negativeNumbers.stream()
            .map(Math::abs)  // Reference to static method Math.abs
            .toList();

        System.out.println("Negative numbers: " + negativeNumbers);
        System.out.println("Absolute values: " + absoluteValues);
        System.out.println();
    }

    /**
     * 2. Reference to an instance method of a particular object: object::instanceMethod
     * Used when you want to call a method on a specific instance
     */
    private static void referenceToInstanceMethodOfParticularObject() {
        System.out.println("2. Reference to Instance Method of Particular Object (object::instanceMethod):");

        StringProcessor processor = new StringProcessor("PREFIX_");
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        // Using lambda expression
        List<String> processedWithLambda = words.stream()
            .map(word -> processor.addPrefix(word))
            .toList();

        // Using method reference to instance method of specific object
        List<String> processedWithMethodRef = words.stream()
            .map(processor::addPrefix)  // Reference to instance method of 'processor' object
            .toList();

        System.out.println("Original words: " + words);
        System.out.println("Processed (lambda): " + processedWithLambda);
        System.out.println("Processed (method ref): " + processedWithMethodRef);

        // Another example with System.out.println
        System.out.println("Printing each word using method reference:");
        words.forEach(System.out::println);  // Reference to println method of System.out object
        System.out.println();
    }

    /**
     * 3. Reference to an instance method of an arbitrary object of a class: ClassName::instanceMethod
     * Used when the method is called on objects that are passed as parameters
     */
    private static void referenceToInstanceMethodOfArbitraryObject() {
        System.out.println("3. Reference to Instance Method of Arbitrary Object (ClassName::instanceMethod):");

        List<String> words = Arrays.asList("hello", "world", "java", "programming");

        // Using lambda expression
        List<String> upperCaseWithLambda = words.stream()
            .map(s -> s.toUpperCase())
            .toList();

        // Using method reference to instance method of arbitrary String object
        List<String> upperCaseWithMethodRef = words.stream()
            .map(String::toUpperCase)  // Reference to toUpperCase method of any String object
            .toList();

        System.out.println("Original words: " + words);
        System.out.println("Upper case (lambda): " + upperCaseWithLambda);
        System.out.println("Upper case (method ref): " + upperCaseWithMethodRef);

        // Another example with String.length()
        List<Integer> wordLengths = words.stream()
            .map(String::length)  // Reference to length method of any String object
            .toList();

        System.out.println("Word lengths: " + wordLengths);

        // Example with sorting using Comparator
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 20)
        );

        // Sort by name using method reference
        List<Person> sortedByName = people.stream()
            .sorted(Comparator.comparing(Person::name))  // Reference to name method (record accessor)
            .toList();

        System.out.println("People sorted by name: " + sortedByName);
        System.out.println();
    }

    /**
     * 4. Reference to a constructor: ClassName::new
     * Used to create new instances of a class
     */
    private static void referenceToConstructor() {
        System.out.println("4. Reference to Constructor (ClassName::new):");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Using lambda expression to create Person objects
        List<Person> peopleWithLambda = names.stream()
            .map(name -> new Person(name, 25))
            .toList();

        // Using method reference to constructor (for single parameter constructor)
        Supplier<Person> personSupplier = Person::new;  // Reference to no-arg constructor
        Person emptyPerson = personSupplier.get();

        System.out.println("Empty person: " + emptyPerson);

        // Using constructor reference with Function for single parameter
        Function<String, Person> personFactory = Person::new;  // Reference to single-arg constructor
        List<Person> peopleWithConstructorRef = names.stream()
            .map(personFactory)
            .toList();

        System.out.println("People created with lambda: " + peopleWithLambda);
        System.out.println("People created with constructor ref: " + peopleWithConstructorRef);

        // Example with array constructor reference
        String[] array1 = names.stream().toArray(String[]::new);  // Reference to String array constructor
        System.out.println("Array created with constructor reference: " + Arrays.toString(array1));
        System.out.println();
    }
}
