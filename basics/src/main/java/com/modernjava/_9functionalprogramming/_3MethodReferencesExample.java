package com.modernjava._9functionalprogramming;

import com.modernjava.domain.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * This class demonstrates the four types of Method References in Java:
 * 1. Reference to a static method (ClassName::staticMethod)
 * 2. Reference to an instance method of a particular object (object::instanceMethod)
 * 3. Reference to an instance method of an arbitrary object of a class (ClassName::instanceMethod)
 * 4. Reference to a constructor (ClassName::new)
 */
public class _3MethodReferencesExample {

    static void main(String[] args) {
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

        //[practice] Using method reference to static method Integer.parseInt

        System.out.println("Original strings: " + numbers);
        System.out.println("Converted to integers (lambda): " + integersWithLambda);

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

        //[practice]  Using method reference to instance method of specific object

        System.out.println("Original words: " + words);
        System.out.println("Processed (lambda): " + processedWithLambda);

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

        System.out.println("Original words: " + words);
        System.out.println("Upper case (lambda): " + upperCaseWithLambda);

        // Another example with String.length()
        List<Integer> wordLengths = words.stream()
            .map((s)->s.length())  // Reference to length method of any String object
            .toList();

        System.out.println("Word lengths: " + wordLengths);

        // Example with sorting using Comparator
        List<Person> people = Arrays.asList(
                new Person("Charlie", 20),
            new Person("Alice", 25),
            new Person("Bob", 30)
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

        // [practice] Using method reference to constructor (for single parameter constructor)

        //[practice] Using constructor reference with Function for single parameter
        // Using constructor reference with BiFunction for two parameters

        System.out.println("People created with lambda: " + peopleWithLambda);

    }
}
