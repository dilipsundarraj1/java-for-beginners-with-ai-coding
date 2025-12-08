package com.modernjava._8collections.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayListStringBasics - Introduction to ArrayList using String objects
 * Demonstrates fundamental ArrayList operations with simple String examples
 * This serves as a foundation before moving to more complex object types
 */
public class ArrayListBasics {

    public static void main(String[] args) {
        System.out.println("=== ArrayList Basics with Strings ===\n");


        // 1. Creating ArrayList - Different ways
        demonstrateArrayListCreation();

        // 2. Adding elements
        demonstrateAddingElements();

        // 3. Accessing elements
        demonstrateAccessingElements();

        // 4. Modifying elements
        demonstrateModifyingElements();

        // 5. Removing elements
        demonstrateRemovingElements();

        // 6. ArrayList properties and methods
        demonstrateArrayListProperties();

        // 7. Combined filtering and transforming operations
        demonstrateFilteringAndTransforming();

    }

    private static void demonstrateArrayListCreation() {
        System.out.println("1. Creating ArrayList - Different Ways:");

        // Way 1: Using ArrayList constructor (less flexible)
        ArrayList<String> namesList1 = new ArrayList<>();
        System.out.println("   Created ArrayList using ArrayList<String> constructor");

        // Way 2: Using List interface (recommended - more flexible)
        List<String> namesList2 = new ArrayList<>();
        System.out.println("   Created ArrayList using List<String> interface (Recommended)");

        // Way 3: With initial capacity (performance optimization)
        List<String> namesList3 = new ArrayList<>(10);
        System.out.println("   Created ArrayList with initial capacity of 10");

        // Way 4: Creating and initializing in one step (Java 9+)
        List<String> colors = new ArrayList<>(List.of("Red", "Green", "Blue"));
        System.out.println("   Created and initialized ArrayList: " + colors);

        // Display initial sizes
        System.out.println("   Initial sizes - List1: " + namesList1.size() +
                          ", List2: " + namesList2.size() +
                          ", List3: " + namesList3.size() +
                          ", Colors: " + colors.size());
        System.out.println();
    }

    private static void demonstrateAddingElements() {
        System.out.println("2. Adding Elements to ArrayList:");

        List<String> fruits = new ArrayList<>();

        // Method 1: add() - adds to the end of list
        fruits.add("Apple");
        System.out.println("   Added 'Apple': " + fruits);
        System.out.println("   Size after adding: " + fruits.size());

        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("   Added more fruits: " + fruits);

        // Method 2: add(index, element) - inserts at specific position
        fruits.add(1, "Mango"); // Insert at index 1
        System.out.println("   Inserted 'Mango' at index 1: " + fruits);

        fruits.add(0, "Strawberry"); // Insert at beginning
        System.out.println("   Inserted 'Strawberry' at beginning: " + fruits);

        // Adding at the end using size() as index
        fruits.add(fruits.size(), "Grapes"); // Same as just add()
        System.out.println("   Added 'Grapes' at end: " + fruits);

        System.out.println("   Final size: " + fruits.size());
        System.out.println();
    }

    private static void demonstrateAccessingElements() {
        System.out.println("3. Accessing Elements from ArrayList:");

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");

        System.out.println("   Cities list: " + cities);

        // Method 1: get(index) - access by index
        String firstCity = cities.get(0);
        String lastCity = cities.get(cities.size() - 1);
        String middleCity = cities.get(cities.size() / 2);

        System.out.println("   First city: " + firstCity);
        System.out.println("   Last city: " + lastCity);
        System.out.println("   Middle city: " + middleCity);

        // Accessing all elements with traditional for loop
        System.out.println("   All cities using traditional for loop:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println("     [" + i + "] " + cities.get(i));
        }

        // Method 2: Enhanced for loop (for-each) - cleaner syntax
        System.out.println("   All cities using enhanced for loop:");
        for (String city : cities) {
            System.out.println("     - " + city);
        }

        System.out.println();
    }

    private static void demonstrateModifyingElements() {
        System.out.println("4. Modifying Elements in ArrayList:");

        List<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        System.out.println("   Original animals: " + animals);

        // Method 1: set(index, element) - replace element at specific position
        String oldAnimal = animals.set(1, "Elephant");
        System.out.println("   Replaced animal at index 1: '" + oldAnimal + "' with 'Elephant'");
        System.out.println("   Updated animals: " + animals);

        // Replace first and last elements
        animals.set(0, "Lion");
        animals.set(animals.size() - 1, "Eagle");
        System.out.println("   After replacing first and last: " + animals);


        // Note: Cannot modify String objects directly since they're immutable
        // You must use set() to replace the entire string
        System.out.println("   Note: Strings are immutable, so we use set() to replace entire elements");

        System.out.println();
    }

    private static void demonstrateRemovingElements() {
        System.out.println("5. Removing Elements from ArrayList:");

        List<String> programming = new ArrayList<>();
        programming.add("Java");
        programming.add("Python");
        programming.add("JavaScript");
        programming.add("Python"); // Duplicate
        programming.add("C++");

        System.out.println("   Original programming languages: " + programming);
        System.out.println("   Initial size: " + programming.size());

        // Method 1: remove(index) - remove by position
        String removedLanguage = programming.remove(0);
        System.out.println("   Removed language at index 0: " + removedLanguage);
        System.out.println("   After removal: " + programming);
        System.out.println("   Size: " + programming.size());

        // Method 2: remove(object) - remove by content (first occurrence)
        boolean wasRemoved = programming.remove("Python");
        System.out.println("   Removed 'Python': " + wasRemoved);
        System.out.println("   After removing Python: " + programming);
        System.out.println("   Note: Only first occurrence of 'Python' was removed");

        // Try to remove non-existent element
        boolean notFound = programming.remove("Ruby");
        System.out.println("   Tried to remove 'Ruby': " + notFound + " (false means not found)");

        // Method 3: clear() - remove all elements
        programming.clear();
        System.out.println("   After clear(): " + programming);
        System.out.println("   Size after clear: " + programming.size());

        System.out.println();
    }

    private static void demonstrateArrayListProperties() {
        System.out.println("6. ArrayList Properties and Methods:");

        List<String> books = new ArrayList<>();
        books.add("1984");
        books.add("To Kill a Mockingbird");
        books.add("The Great Gatsby");
        books.add("Pride and Prejudice");




        System.out.println("   Books collection: " + books);

        // size() - get number of elements
        System.out.println("   Number of books: " + books.size());

        // isEmpty() - check if list is empty
        System.out.println("   Is books list empty? " + books.isEmpty());

        // contains() - check if specific element exists
        System.out.println("   Contains '1984'? " + books.contains("1984"));
        System.out.println("   Contains 'Harry Potter'? " + books.contains("Harry Potter"));

        // indexOf() - find index of element (returns -1 if not found)
        int index = books.indexOf("The Great Gatsby");
        System.out.println("   Index of 'The Great Gatsby': " + index);



        int notFoundIndex = books.indexOf("Moby Dick");
        System.out.println("   Index of 'Moby Dick': " + notFoundIndex + " (-1 means not found)");

        // lastIndexOf() - find last occurrence index
        books.add("1984"); // Add duplicate
        System.out.println("   Books with duplicate: " + books);
        System.out.println("   First index of '1984': " + books.indexOf("1984"));
        System.out.println("   Last index of '1984': " + books.lastIndexOf("1984"));


        System.out.println();
    }

    private static void demonstrateFilteringAndTransforming() {
        System.out.println("7. Combined Filtering and Transforming Operations:");

        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("banana");
        items.add("cherry");
        items.add("date");
        items.add("fig");
        items.add("grape");

        System.out.println("   Original items: " + items);

        // Filter: Keep items with length > 3
        List<String> filteredItems = new ArrayList<>();
        for (String item : items) {
            if (item.length() > 3) {
                filteredItems.add(item);
            }
        }
        System.out.println("   Filtered (length > 3): " + filteredItems);

        // Transform: Convert all items to uppercase
        List<String> transformedItems = new ArrayList<>();
        for (String item : filteredItems) {
            transformedItems.add(item.toUpperCase());
        }
        System.out.println("   Transformed to uppercase: " + transformedItems);

        // Combined: Filter and transform in one go
        List<String> combinedResult = new ArrayList<>();
        for (String item : items) {
            if (item.length() > 3) {
                combinedResult.add(item.toUpperCase());
            }
        }
        System.out.println("   Combined filter & transform: " + combinedResult);

        System.out.println();
    }
}
