package com.modernjava._7regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Comprehensive Regex Cheat Sheet and Reference Guide
 * 
 * This class serves as a quick reference for common regex patterns
 * and demonstrates their usage with practical examples.
 */
public class RegexCheatSheet {
    
    public static void main(String[] args) {
        System.out.println("=== Regex Cheat Sheet and Reference ===\n");
        
        // 1. Basic Character Patterns
        basicCharacterPatterns();
        
        // 2. Quantifiers
        quantifierPatterns();
        
        // 3. Character Classes
        characterClasses();
        
        // 4. Anchors and Boundaries
        anchorsAndBoundaries();
        
        // 5. Common Patterns Library
        commonPatternsLibrary();
    }
    
    /**
     * Demonstrates basic character patterns
     */
    private static void basicCharacterPatterns() {
        System.out.println("1. Basic Character Patterns:");
        System.out.println("   .     - Matches any character (except newline)");
        System.out.println("   \\d    - Matches any digit (0-9)");
        System.out.println("   \\D    - Matches any non-digit");
        System.out.println("   \\w    - Matches word characters (a-z, A-Z, 0-9, _)");
        System.out.println("   \\W    - Matches non-word characters");
        System.out.println("   \\s    - Matches whitespace (space, tab, newline)");
        System.out.println("   \\S    - Matches non-whitespace");
        
        String testText = "Hello World! 123 Test@Email.com";
        
        demonstratePattern("\\d+", testText, "Find all digits");
        demonstratePattern("\\w+", testText, "Find all word sequences");
        demonstratePattern("\\S+", testText, "Find all non-whitespace sequences");
        
        System.out.println();
    }
    
    /**
     * Demonstrates quantifier patterns
     */
    private static void quantifierPatterns() {
        System.out.println("2. Quantifiers:");
        System.out.println("   *     - Zero or more");
        System.out.println("   +     - One or more");
        System.out.println("   ?     - Zero or one (optional)");
        System.out.println("   {n}   - Exactly n times");
        System.out.println("   {n,}  - n or more times");
        System.out.println("   {n,m} - Between n and m times");
        
        String testText = "cat cats catttt dog dogs";
        
        demonstratePattern("cat*", testText, "cat followed by zero or more 't'");
        demonstratePattern("cat+", testText, "cat followed by one or more 't'");
        demonstratePattern("cats?", testText, "cat with optional 's'");
        demonstratePattern("cat{2}", testText, "cat followed by exactly 2 't'");
        demonstratePattern("dog{1,2}", testText, "dog followed by 1-2 'g'");
        
        System.out.println();
    }
    
    /**
     * Demonstrates character classes
     */
    private static void characterClasses() {
        System.out.println("3. Character Classes:");
        System.out.println("   [abc]     - Matches a, b, or c");
        System.out.println("   [^abc]    - Matches anything except a, b, or c");
        System.out.println("   [a-z]     - Matches any lowercase letter");
        System.out.println("   [A-Z]     - Matches any uppercase letter");
        System.out.println("   [0-9]     - Matches any digit");
        System.out.println("   [a-zA-Z0-9] - Matches alphanumeric characters");
        
        String testText = "ABC123def456XYZ";
        
        demonstratePattern("[A-Z]+", testText, "Find uppercase sequences");
        demonstratePattern("[a-z]+", testText, "Find lowercase sequences");
        demonstratePattern("[0-9]+", testText, "Find digit sequences");
        demonstratePattern("[^0-9]+", testText, "Find non-digit sequences");
        
        System.out.println();
    }
    
    /**
     * Demonstrates anchors and boundaries
     */
    private static void anchorsAndBoundaries() {
        System.out.println("4. Anchors and Boundaries:");
        System.out.println("   ^     - Start of string/line");
        System.out.println("   $     - End of string/line");
        System.out.println("   \\b    - Word boundary");
        System.out.println("   \\B    - Non-word boundary");
        
        String[] testLines = {
            "start with this",
            "this is in middle", 
            "end with this"
        };
        
        System.out.println("Testing anchor patterns:");
        for (String line : testLines) {
            System.out.printf("  %-20s", "'" + line + "':");
            System.out.print(" ^start=" + line.matches("^start.*"));
            System.out.print(" this$=" + line.matches(".*this$"));
            System.out.print(" \\bthis\\b=" + Pattern.compile("\\bthis\\b").matcher(line).find());
            System.out.println();
        }
        
        System.out.println();
    }
    
    /**
     * Library of common practical patterns
     */
    private static void commonPatternsLibrary() {
        System.out.println("5. Common Patterns Library:");
        
        // Email patterns
        System.out.println("\nEmail Validation:");
        String basicEmail = "\\w+@\\w+\\.\\w+";
        String advancedEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        testPattern(basicEmail, "Basic email", "user@domain.com", "invalid-email");
        testPattern(advancedEmail, "Advanced email", "user.name+tag@example.co.uk", "invalid@");
        
        // Phone number patterns
        System.out.println("\nPhone Number Validation:");
        String phonePattern = "\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4}";
        testPattern(phonePattern, "Phone number", "123-456-7890", "(555) 123-4567", "123456");
        
        // Date patterns
        System.out.println("\nDate Validation:");
        String datePattern = "\\d{4}-\\d{2}-\\d{2}"; // YYYY-MM-DD
        String usDatePattern = "\\d{1,2}/\\d{1,2}/\\d{4}"; // MM/DD/YYYY
        testPattern(datePattern, "ISO date", "2023-12-25", "25-12-2023");
        testPattern(usDatePattern, "US date", "12/25/2023", "2023-12-25");
        
        // Credit card patterns
        System.out.println("\nCredit Card Validation:");
        String visaPattern = "^4\\d{3}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$";
        String mastercardPattern = "^5[1-5]\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$";
        testPattern(visaPattern, "Visa card", "4123 4567 8901 2345", "5123 4567 8901 2345");
        testPattern(mastercardPattern, "Mastercard", "5123 4567 8901 2345", "4123 4567 8901 2345");
        
        // IP Address patterns
        System.out.println("\nIP Address Validation:");
        String ipPattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        testPattern(ipPattern, "IP address", "192.168.1.1", "256.256.256.256");
        
        // URL patterns
        System.out.println("\nURL Validation:");
        String urlPattern = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";
        testPattern(urlPattern, "URL", "https://www.example.com", "not-a-url");
        
        // Password strength patterns
        System.out.println("\nPassword Strength:");
        String strongPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        testPattern(strongPassword, "Strong password", "MyP@ssw0rd!", "password123");
        
        // HTML tag patterns
        System.out.println("\nHTML Tag Matching:");
        String htmlTagPattern = "<[^>]+>";
        String htmlText = "This is <b>bold</b> and <i>italic</i> text.";
        demonstratePattern(htmlTagPattern, htmlText, "Find HTML tags");
        
        System.out.println();
    }
    
    /**
     * Helper method to demonstrate a pattern with sample text
     */
    private static void demonstratePattern(String pattern, String text, String description) {
        System.out.printf("   %-40s in '%s':%n", description, text);
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        
        if (m.find()) {
            m.reset(); // Reset to find all matches
            System.out.print("     Matches: ");
            while (m.find()) {
                System.out.print("'" + m.group() + "' ");
            }
            System.out.println();
        } else {
            System.out.println("     No matches found");
        }
    }
    
    /**
     * Helper method to test patterns with multiple test cases
     */
    private static void testPattern(String pattern, String description, String... testCases) {
        System.out.printf("   %-20s: %s%n", description, pattern);
        Pattern p = Pattern.compile(pattern);
        
        for (String testCase : testCases) {
            boolean matches = p.matcher(testCase).matches();
            System.out.printf("     %-25s: %s%n", "'" + testCase + "'", matches ? "✓" : "✗");
        }
    }
}
