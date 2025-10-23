package com.modernjava._2primitives;

/**
 * This class demonstrates char primitive data type in Java.
 * char: 16-bit Unicode character (0 to 65,535 or '\u0000' to '\uffff')
 *
 * Covers:
 * - Basic char usage and declarations
 * - Unicode characters and escape sequences
 * - Special characters and symbols
 * - Difference between char and String
 * - Real-world practical examples
 * - Converting between char and int values
 */
public class CharExamples {

    static void main(String[] args) {
        System.out.println("=== COMPREHENSIVE CHAR GUIDE ===\n");

        // ========================================
        // 1. BASIC CHAR VALUES AND CHARACTERISTICS
        // ========================================
        System.out.println("1. BASIC CHAR VALUES");
        System.out.println("====================");

        // Basic char declarations
        char letterA = 'A';
        char letterZ = 'Z';
        char digit5 = '5';
        char space = ' ';
        char exclamation = '!';

        System.out.println("📝 Basic Char Declarations:");
        System.out.println("letterA: " + letterA);
        System.out.println("letterZ: " + letterZ);
        System.out.println("digit5: " + digit5);
        System.out.println("space: '" + space + "'");
        System.out.println("exclamation: " + exclamation);

        // Char characteristics
        System.out.println("\n🔍 Char Characteristics:");
        System.out.println("Size: 16 bits (2 bytes)");
        System.out.println("Range: 0 to 65,535 (unsigned)");
        System.out.println("Unicode range: '\\u0000' to '\\uffff'");
        System.out.println("Default value: '\\u0000' (null character)");

        // ========================================
        // 2. UNICODE CHARACTERS AND ESCAPE SEQUENCES
        // ========================================
        System.out.println("\n2. UNICODE CHARACTERS & ESCAPE SEQUENCES");
        System.out.println("=========================================");

        // Unicode notation examples
        System.out.println("🌍 Unicode Character Examples:");
        char unicodeA = '\u0041';      // 'A' in Unicode
        char unicodeAt = '\u0040';     // '@' symbol
        char unicodeDollar = '\u0024'; // '$' symbol
        char unicodeHeart = '\u2665';  // Heart symbol ♥
        char unicodeStar = '\u2605';   // Star symbol ★
        char unicodeArrow = '\u2192';  // Right arrow →

        System.out.println("Unicode A (\\u0041): " + unicodeA);
        System.out.println("Unicode @ (\\u0040): " + unicodeAt);
        System.out.println("Unicode $ (\\u0024): " + unicodeDollar);
        System.out.println("Unicode ♥ (\\u2665): " + unicodeHeart);
        System.out.println("Unicode ★ (\\u2605): " + unicodeStar);
        System.out.println("Unicode → (\\u2192): " + unicodeArrow);

        // Escape sequences
        System.out.println("\n⚡ Escape Sequences:");
        char newline = '\n';
        char tab = '\t';
        char carriageReturn = '\r';
        char backspace = '\b';
        char formFeed = '\f';
        char singleQuote = '\'';
        char doubleQuote = '\"';
        char backslash = '\\';

        System.out.println("Newline (\\n): ASCII " + (int)newline);
        System.out.println("Tab (\\t): ASCII " + (int)tab);
        System.out.println("Carriage return (\\r): ASCII " + (int)carriageReturn);
        System.out.println("Backspace (\\b): ASCII " + (int)backspace);
        System.out.println("Form feed (\\f): ASCII " + (int)formFeed);
        System.out.println("Single quote (\\'): " + singleQuote);
        System.out.println("Double quote (\\\"): " + doubleQuote);
        System.out.println("Backslash (\\\\): " + backslash);

        // ========================================
        // 3. SPECIAL CHARACTERS AND SYMBOLS
        // ========================================
        System.out.println("\n3. SPECIAL CHARACTERS & SYMBOLS");
        System.out.println("================================");

        // Mathematical symbols
        System.out.println("🧮 Mathematical Symbols:");
        char plus = '+';
        char minus = '-';
        char multiply = '*';
        char divide = '/';
        char percent = '%';
        char equals = '=';
        char lessThan = '<';
        char greaterThan = '>';

        System.out.println("Plus: " + plus);
        System.out.println("Minus: " + minus);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);
        System.out.println("Percent: " + percent);
        System.out.println("Equals: " + equals);
        System.out.println("Less than: " + lessThan);
        System.out.println("Greater than: " + greaterThan);

        // Currency and special symbols
        System.out.println("\n💰 Currency & Special Symbols:");
        char dollar = '$';
        char euro = '\u20AC';      // € symbol
        char pound = '\u00A3';     // £ symbol
        char yen = '\u00A5';       // ¥ symbol
        char copyright = '\u00A9'; // © symbol
        char registered = '\u00AE'; // ® symbol
        char trademark = '\u2122';  // ™ symbol

        System.out.println("Dollar: " + dollar);
        System.out.println("Euro: " + euro);
        System.out.println("Pound: " + pound);
        System.out.println("Yen: " + yen);
        System.out.println("Copyright: " + copyright);
        System.out.println("Registered: " + registered);
        System.out.println("Trademark: " + trademark);


        // ========================================
        // 4. CHAR VS STRING DIFFERENCES
        // ========================================
        System.out.println("\n4. CHAR VS STRING DIFFERENCES");
        System.out.println("==============================");

        System.out.println("🔤 Key Differences:");
        System.out.println("• char: Single character, primitive type, 16-bit");
        System.out.println("• String: Sequence of characters, reference type, variable size");
        System.out.println("• char uses single quotes: 'A'");
        System.out.println("• String uses double quotes: \"Hello\"");

        // Demonstrating the difference
        char singleChar = 'H';
        // String singleCharAsString = "H"; // This would be a String, not covered yet

        System.out.println("\nChar example: " + singleChar);
        System.out.println("Char size: Always 16 bits (2 bytes)");

        // Arithmetic Operation
        System.out.println("Char can be used in arithmetic operations");

        // Arithmetic with chars
        char charA = 'A';
        char charB = 'B';
        int difference = charB - charA;

        System.out.println("Char 'B' - char 'A' = " + difference);


        // ========================================
        // 5. REAL-WORLD PRACTICAL EXAMPLES
        // ========================================
        System.out.println("\n5. REAL-WORLD PRACTICAL EXAMPLES");
        System.out.println("=================================");

        // Grade system using chars
        System.out.println("🎓 Grade System:");
        char grade1 = 'A';
        char grade2 = 'B';
        char grade3 = 'C';
        char grade4 = 'D';
        char grade5 = 'F';

        if (grade1 >= 'A' && grade1 <= 'C') {
            System.out.println("Grade " + grade1 + ": Passing grade - Good performance!");
        }

        if (grade5 == 'F') {
            System.out.println("Grade " + grade5 + ": Failing grade - Needs improvement");
        }


    }
}
