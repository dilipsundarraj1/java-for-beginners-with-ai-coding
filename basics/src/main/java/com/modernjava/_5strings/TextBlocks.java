package com.modernjava._5strings;

public class TextBlocks {

    public static void main(String[] args) {
        System.out.println("=== Text Blocks Demonstration ===");

        // Demonstrate traditional string concatenation
        demonstrateTraditionalString();

        // Demonstrate text blocks (Java 13+)
        demonstrateTextBlocks();
    }

    /**
     * Demonstrates traditional multi-line string creation using concatenation
     */
    private static void demonstrateTraditionalString() {
        System.out.println("\n--- Traditional Multi-line String ---");

        String json = "{\n" +
                "   \"name\": \"Inception\",\n" +
                "   \"rating\": 8.8,\n" +
                "   \"genre\": \"Sci-Fi\"\n" +
                "}";

        System.out.println("Movie JSON (Traditional):");
        System.out.println(json);
    }

    /**
     * Demonstrates text blocks for cleaner multi-line strings (Java 13+)
     */
    private static void demonstrateTextBlocks() {
        System.out.println("\n--- Text Blocks (Java 13+) ---");

        String jsonTextBlock = """
                {
                    "name": "John",
                    "age": 30,
                    "city": "New York"
                }
                """;

        System.out.println("Person JSON (Text Block):");
        System.out.println(jsonTextBlock);
    }
}
