package com.modernjava.wrapperclasses;

/**
 * Wrapper Classes Demo
 *
 * Wrapper classes are objects that wrap primitive data types into an object.
 * Java provides a wrapper class for each primitive data type:
 *
 * Primitive Type -> Wrapper Class
 * byte            -> Byte
 * short           -> Short
 * int             -> Integer
 * long            -> Long
 * float           -> Float
 * double          -> Double
 * boolean         -> Boolean
 * char            -> Character
 */
public class WrapperclassesDemo {

    public static void main(String[] args) {
        System.out.println("=== JAVA WRAPPER CLASSES DEMONSTRATION ===\n");

        // 1. BYTE WRAPPER CLASS
        System.out.println("1. BYTE WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateByteWrapper();

        // 2. SHORT WRAPPER CLASS
        System.out.println("\n2. SHORT WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateShortWrapper();

        // 3. INTEGER WRAPPER CLASS
        System.out.println("\n3. INTEGER WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateIntegerWrapper();

        // 4. LONG WRAPPER CLASS
        System.out.println("\n4. LONG WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateLongWrapper();

        // 5. FLOAT WRAPPER CLASS
        System.out.println("\n5. FLOAT WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateFloatWrapper();

        // 6. DOUBLE WRAPPER CLASS
        System.out.println("\n6. DOUBLE WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateDoubleWrapper();

        // 7. BOOLEAN WRAPPER CLASS
        System.out.println("\n7. BOOLEAN WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateBooleanWrapper();

        // 8. CHARACTER WRAPPER CLASS
        System.out.println("\n8. CHARACTER WRAPPER CLASS");
        System.out.println("-".repeat(50));
        demonstrateCharacterWrapper();

        // 9. AUTOBOXING AND UNBOXING
        System.out.println("\n9. AUTOBOXING AND UNBOXING");
        System.out.println("-".repeat(50));
        demonstrateAutoboxingUnboxing();

        // 10. PRACTICAL USE CASES
        System.out.println("\n10. PRACTICAL USE CASES");
        System.out.println("-".repeat(50));
        demonstratePracticalUseCases();
    }

    /**
     * Demonstrates Byte Wrapper Class
     * Range: -128 to 127
     */
    private static void demonstrateByteWrapper() {
        // Creating Byte objects
        byte primitiveValue = 10;
        Byte wrappedValue = Byte.valueOf(primitiveValue);
        Byte wrappedValue2 = 20; // Auto-boxing

        System.out.println("Byte Min Value: " + Byte.MIN_VALUE);
        System.out.println("Byte Max Value: " + Byte.MAX_VALUE);
        System.out.println("Primitive byte: " + primitiveValue);
        System.out.println("Wrapped Byte (valueOf): " + wrappedValue);
        System.out.println("Wrapped Byte (auto-boxing): " + wrappedValue2);
        System.out.println("Parsing String to Byte: " + Byte.parseByte("50"));
        System.out.println("Byte to String: " + Byte.toString((byte) 100));
        System.out.println("Byte Size: " + Byte.SIZE + " bits");
    }

    /**
     * Demonstrates Short Wrapper Class
     * Range: -32,768 to 32,767
     */
    private static void demonstrateShortWrapper() {
        // Creating Short objects
        short primitiveValue = 1000;
        Short wrappedValue = Short.valueOf(primitiveValue);
        Short wrappedValue2 = 2000; // Auto-boxing

        System.out.println("Short Min Value: " + Short.MIN_VALUE);
        System.out.println("Short Max Value: " + Short.MAX_VALUE);
        System.out.println("Primitive short: " + primitiveValue);
        System.out.println("Wrapped Short (valueOf): " + wrappedValue);
        System.out.println("Wrapped Short (auto-boxing): " + wrappedValue2);
        System.out.println("Parsing String to Short: " + Short.parseShort("5000"));
        System.out.println("Short to String: " + Short.toString((short) 10000));
        System.out.println("Short Size: " + Short.SIZE + " bits");
        System.out.println("Compare two Short values: " + wrappedValue.compareTo(wrappedValue2));
    }

    /**
     * Demonstrates Integer Wrapper Class
     * Range: -2,147,483,648 to 2,147,483,647
     */
    private static void demonstrateIntegerWrapper() {
        // Creating Integer objects
        int primitiveValue = 100;
        Integer wrappedValue = Integer.valueOf(primitiveValue);
        Integer wrappedValue2 = 200; // Auto-boxing

        System.out.println("Integer Min Value: " + Integer.MIN_VALUE);
        System.out.println("Integer Max Value: " + Integer.MAX_VALUE);
        System.out.println("Primitive int: " + primitiveValue);
        System.out.println("Wrapped Integer (valueOf): " + wrappedValue);
        System.out.println("Wrapped Integer (auto-boxing): " + wrappedValue2);
        System.out.println("Parsing String to Integer: " + Integer.parseInt("12345"));
        System.out.println("Integer to String: " + Integer.toString(67890));
        System.out.println("Integer Size: " + Integer.SIZE + " bits");
        System.out.println("Compare two Integer values: " + wrappedValue.compareTo(wrappedValue2));
        System.out.println("Integer to Binary: " + Integer.toBinaryString(15));
        System.out.println("Integer to Hex: " + Integer.toHexString(255));
        System.out.println("Integer to Octal: " + Integer.toOctalString(8));
    }

    /**
     * Demonstrates Long Wrapper Class
     * Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     */
    private static void demonstrateLongWrapper() {
        // Creating Long objects
        long primitiveValue = 10000000000L;
        Long wrappedValue = Long.valueOf(primitiveValue);
        Long wrappedValue2 = 20000000000L; // Auto-boxing

        System.out.println("Long Min Value: " + Long.MIN_VALUE);
        System.out.println("Long Max Value: " + Long.MAX_VALUE);
        System.out.println("Primitive long: " + primitiveValue);
        System.out.println("Wrapped Long (valueOf): " + wrappedValue);
        System.out.println("Wrapped Long (auto-boxing): " + wrappedValue2);
        System.out.println("Parsing String to Long: " + Long.parseLong("9999999999"));
        System.out.println("Long to String: " + Long.toString(1234567890L));
        System.out.println("Long Size: " + Long.SIZE + " bits");
        System.out.println("Compare two Long values: " + wrappedValue.compareTo(wrappedValue2));
    }

    /**
     * Demonstrates Float Wrapper Class
     * Range: approximately ±3.4E+38
     */
    private static void demonstrateFloatWrapper() {
        // Creating Float objects
        float primitiveValue = 3.14f;
        Float wrappedValue = Float.valueOf(primitiveValue);
        Float wrappedValue2 = 2.71f; // Auto-boxing

        System.out.println("Float Min Value: " + Float.MIN_VALUE);
        System.out.println("Float Max Value: " + Float.MAX_VALUE);
        System.out.println("Primitive float: " + primitiveValue);
        System.out.println("Wrapped Float (valueOf): " + wrappedValue);
        System.out.println("Wrapped Float (auto-boxing): " + wrappedValue2);
        System.out.println("Parsing String to Float: " + Float.parseFloat("9.99"));
        System.out.println("Float to String: " + Float.toString(5.55f));
        System.out.println("Float Size: " + Float.SIZE + " bits");
        System.out.println("Compare two Float values: " + wrappedValue.compareTo(wrappedValue2));
        System.out.println("Is Float Finite: " + Float.isFinite(wrappedValue));
        System.out.println("Is Float Infinite: " + Float.isInfinite(Float.POSITIVE_INFINITY));
        System.out.println("Is Float NaN: " + Float.isNaN(Float.NaN));
    }

    /**
     * Demonstrates Double Wrapper Class
     * Range: approximately ±1.7E+308
     */
    private static void demonstrateDoubleWrapper() {
        // Creating Double objects
        double primitiveValue = 3.14159;
        Double wrappedValue = Double.valueOf(primitiveValue);
        Double wrappedValue2 = 2.71828; // Auto-boxing

        System.out.println("Double Min Value: " + Double.MIN_VALUE);
        System.out.println("Double Max Value: " + Double.MAX_VALUE);
        System.out.println("Primitive double: " + primitiveValue);
        System.out.println("Wrapped Double (valueOf): " + wrappedValue);
        System.out.println("Wrapped Double (auto-boxing): " + wrappedValue2);
        System.out.println("Parsing String to Double: " + Double.parseDouble("1.23456"));
        System.out.println("Double to String: " + Double.toString(9.87654));
        System.out.println("Double Size: " + Double.SIZE + " bits");
        System.out.println("Compare two Double values: " + wrappedValue.compareTo(wrappedValue2));
        System.out.println("Is Double Finite: " + Double.isFinite(wrappedValue));
        System.out.println("Is Double Infinite: " + Double.isInfinite(Double.POSITIVE_INFINITY));
        System.out.println("Is Double NaN: " + Double.isNaN(Double.NaN));
    }

    /**
     * Demonstrates Boolean Wrapper Class
     */
    private static void demonstrateBooleanWrapper() {
        // Creating Boolean objects
        boolean primitiveValue = true;
        Boolean wrappedValue = Boolean.valueOf(primitiveValue);
        Boolean wrappedValue2 = false; // Auto-boxing
        Boolean wrappedValue3 = Boolean.valueOf("true");

        System.out.println("Primitive boolean: " + primitiveValue);
        System.out.println("Wrapped Boolean (valueOf): " + wrappedValue);
        System.out.println("Wrapped Boolean (auto-boxing): " + wrappedValue2);
        System.out.println("Parsing String to Boolean: " + wrappedValue3);
        System.out.println("Boolean to String: " + Boolean.toString(true));
        System.out.println("Boolean TRUE constant: " + Boolean.TRUE);
        System.out.println("Boolean FALSE constant: " + Boolean.FALSE);
        System.out.println("Compare two Boolean values: " + wrappedValue.compareTo(wrappedValue2));
        System.out.println("Parse 'yes' to Boolean: " + Boolean.parseBoolean("yes")); // returns false
        System.out.println("Parse 'true' to Boolean: " + Boolean.parseBoolean("true")); // returns true
    }

    /**
     * Demonstrates Character Wrapper Class
     */
    private static void demonstrateCharacterWrapper() {
        // Creating Character objects
        char primitiveValue = 'A';
        Character wrappedValue = Character.valueOf(primitiveValue);
        Character wrappedValue2 = 'B'; // Auto-boxing
        Character wrappedValue3 = 65; // ASCII value for 'A'

        System.out.println("Primitive char: " + primitiveValue);
        System.out.println("Wrapped Character (valueOf): " + wrappedValue);
        System.out.println("Wrapped Character (auto-boxing): " + wrappedValue2);
        System.out.println("Character from ASCII: " + wrappedValue3);
        System.out.println("Character to String: " + Character.toString('Z'));
        System.out.println("Character to Upper Case: " + Character.toUpperCase('a'));
        System.out.println("Character to Lower Case: " + Character.toLowerCase('A'));
        System.out.println("Is Character Digit: " + Character.isDigit('5'));
        System.out.println("Is Character Letter: " + Character.isLetter('A'));
        System.out.println("Is Character Uppercase: " + Character.isUpperCase('A'));
        System.out.println("Is Character Lowercase: " + Character.isLowerCase('a'));
        System.out.println("Is Character Whitespace: " + Character.isWhitespace(' '));
        System.out.println("Compare two Character values: " + wrappedValue.compareTo(wrappedValue2));
        System.out.println("Character MIN value: " + Character.MIN_VALUE);
        System.out.println("Character MAX value: " + Character.MAX_VALUE);
        System.out.println("Character Size: " + Character.SIZE + " bits");
    }

    /**
     * Demonstrates Autoboxing and Unboxing
     */
    private static void demonstrateAutoboxingUnboxing() {
        System.out.println("--- AUTOBOXING (Primitive to Wrapper) ---");
        // Autoboxing - automatic conversion of primitive to wrapper class
        int primitiveInt = 100;
        Integer wrappedInt = primitiveInt; // Autoboxing
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Auto-boxed Integer: " + wrappedInt);
        System.out.println("Are they equal? " + (primitiveInt == wrappedInt.intValue()));

        System.out.println("\n--- UNBOXING (Wrapper to Primitive) ---");
        // Unboxing - automatic conversion of wrapper class to primitive
        Integer wrappedValue = 200;
        int unboxedValue = wrappedValue; // Unboxing
        System.out.println("Wrapped Integer: " + wrappedValue);
        System.out.println("Un-boxed int: " + unboxedValue);
        System.out.println("Are they equal? " + (unboxedValue == wrappedValue.intValue()));

        System.out.println("\n--- AUTOBOXING IN OPERATIONS ---");
        // Autoboxing happens automatically in various contexts
        Integer num1 = 10; // Autoboxing
        Integer num2 = 20; // Autoboxing
        Integer sum = num1 + num2; // Unboxing for addition, then Autoboxing for result
        System.out.println("num1: " + num1 + ", num2: " + num2);
        System.out.println("Sum (num1 + num2): " + sum);
    }

    /**
     * Demonstrates Practical Use Cases of Wrapper Classes
     */
    private static void demonstratePracticalUseCases() {
        System.out.println("--- USE CASE 1: Using with Collections ---");
        // Collections (ArrayList, HashMap, etc.) require objects, not primitives
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();
        numbers.add(10); // Autoboxing
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList<Integer>: " + numbers);
        System.out.println("Get element at index 1: " + numbers.get(1));

        System.out.println("\n--- USE CASE 2: Null Values ---");
        // Wrapper classes can have null values (primitives cannot)
        Integer nullableValue = null;
        System.out.println("Nullable Integer: " + nullableValue);
        if (nullableValue != null) {
            System.out.println("Value is not null");
        } else {
            System.out.println("Value is null - wrapper classes can be null!");
        }

        System.out.println("\n--- USE CASE 3: Type Conversion ---");
        // Wrapper classes provide convenient methods for type conversion
        String numberStr = "12345";
        int intValue = Integer.parseInt(numberStr);
        double doubleValue = Double.parseDouble("123.45");
        long longValue = Long.parseLong("9999999999");
        System.out.println("String to int: " + intValue);
        System.out.println("String to double: " + doubleValue);
        System.out.println("String to long: " + longValue);

        System.out.println("\n--- USE CASE 4: Constants and Utility Methods ---");
        // Access constants and useful utility methods
        System.out.println("Max Integer value: " + Integer.MAX_VALUE);
        System.out.println("Min Double value: " + Double.MIN_VALUE);
        System.out.println("Integer to Binary: " + Integer.toBinaryString(255));
        System.out.println("Integer to Hex: " + Integer.toHexString(255));

        System.out.println("\n--- USE CASE 5: Default Values in Methods ---");
        // Methods can return wrapper objects that might be null
        Integer result = getNumberOrNull(true);
        System.out.println("Result (true): " + result);
        result = getNumberOrNull(false);
        System.out.println("Result (false): " + result);
    }

    /**
     * Helper method that returns Integer or null based on condition
     */
    private static Integer getNumberOrNull(boolean condition) {
        return condition ? 42 : null;
    }
}
