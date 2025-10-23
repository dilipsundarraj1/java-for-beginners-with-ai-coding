package com.modernjava._7regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Introduction to Regular Expressions (Regex) in Java
 *
 * Regular expressions are patterns used to match character combinations in strings.
 * Java provides the java.util.regex package for regex operations.
 */
public class RegexBasics {



    public static void main(String[] args) {
        System.out.println("=== Regex Basics in Java ===\n");

        // 1. Basic Pattern Matching
        basicPatternMatching();

        // 2. Common Regex Patterns
        commonPatterns();

        // 3. Pattern and Matcher Classes
        patternMatcherExample();

        // 4. Case Sensitivity
        caseSensitivity();
    }

    /**
     * Demonstrates basic pattern matching using String.matches()
     */
    private static void basicPatternMatching() {
        System.out.println("1. Basic Pattern Matching:");

        String text = "Hello123";
        String text1 = "123Hello";

        // Check if string contains only letters
        boolean onlyLetters = text.matches("[a-zA-Z]+");
        System.out.println("'" + text + "' contains only letters: " + onlyLetters);

        // Check if string contains letters and numbers
        boolean lettersAndNumbers = text.matches("[a-zA-Z0-9]+");
        System.out.println("'" + text + "' contains letters and numbers: " + lettersAndNumbers);

        // Check if string starts with "Hello"
        boolean startsWithHello = text.matches("Hello.*");
        System.out.println("'" + text + "' starts with 'Hello': " + startsWithHello);

        boolean onlyLetters1 = text1.matches("[a-zA-Z]+");
        System.out.println("'" + text1 + "' contains only letters: " + onlyLetters1);

        // Check if string contains letters and numbers
        boolean lettersAndNumbers1 = text1.matches("[a-zA-Z0-9]+");
        System.out.println("'" + text1 + "' contains letters and numbers: " + lettersAndNumbers1);

        // Check if string starts with "Hello"
        boolean startsWithHello1 = text1.matches("Hello.*");
        System.out.println("'" + text1 + "' starts with 'Hello': " + startsWithHello1);

        System.out.println();
    }

    /**
     * Demonstrates common regex patterns
     */
    private static void commonPatterns() {
        System.out.println("2. Common Regex Patterns:");

        // Email pattern (simplified)
        String email = "user@example.com";
        String emailPattern = "\\w+@\\w+\\.\\w+";
        System.out.println("'" + email + "' is valid email: " + email.matches(emailPattern));

        // Phone number pattern
        String phone = "123-456-7890";
        String phonePattern = "\\d{3}-\\d{3}-\\d{4}";
        System.out.println("'" + phone + "' is valid phone: " + phone.matches(phonePattern));

        // ZIP code pattern
        String zip = "12345";
        String zipPattern = "\\d{5}";
        System.out.println("'" + zip + "' is valid ZIP: " + zip.matches(zipPattern));

        // Password pattern (at least 8 chars, contains letter and number)
        String password = "Password123";
        String passwordPattern = "(?=.*[a-zA-Z])(?=.*\\d).{8,}";
        System.out.println("'" + password + "' is strong password: " + password.matches(passwordPattern));

        System.out.println();
    }

    /**
     * Demonstrates Pattern and Matcher classes for more complex operations
     */
    private static void patternMatcherExample() {
        System.out.println("3. Pattern and Matcher Classes:");



        String text = "Contact us at support@company.com or sales@company.com";
        String emailPattern = "\\w+@\\w+\\.\\w+";

        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Finding all emails in: " + text);
        while (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
            System.out.println("  at position: " + matcher.start() + "-" + matcher.end());
        }

        System.out.println();
    }

    /**
     * Demonstrates case sensitivity in regex
     */
    private static void caseSensitivity() {
        System.out.println("4. Case Sensitivity:");

        String text = "Hello World";

        // Case sensitive matching
        boolean caseSensitive = text.matches("hello world");
        System.out.println("Case sensitive match: " + caseSensitive);

        // Case insensitive matching using Pattern.CASE_INSENSITIVE flag
        Pattern pattern = Pattern.compile("hello world", Pattern.CASE_INSENSITIVE);
        boolean caseInsensitive = pattern.matcher(text).matches();
        System.out.println("Case insensitive match: " + caseInsensitive);

        // Alternative: using (?i) flag in pattern
        boolean caseInsensitiveInline = text.matches("(?i)hello world");
        System.out.println("Case insensitive (inline flag): " + caseInsensitiveInline);

        System.out.println();
    }
}
