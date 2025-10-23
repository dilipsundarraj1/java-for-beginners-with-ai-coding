package com.modernjava._2primitives;

/**
 * This class demonstrates floating-point primitive data types in Java.
 * float: 32-bit IEEE 754 floating point (6-7 decimal digits precision)
 * double: 64-bit IEEE 754 floating point (15-17 decimal digits precision)
 */
public class FloatingPointExamples {
    public static void main(String[] args) {
        System.out.println("=== Floating Point Types Examples ===\n");

        // FLOAT Examples (32-bit floating point)
        System.out.println("1. FLOAT (32-bit floating point):");
        System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Precision: ~6-7 decimal digits");

        float temperature = 98.6f;          // Note the 'f' suffix
        float price = 19.99f;
        float pi = 3.14159f;

        System.out.println("Body temperature: " + temperature + "°F");
        System.out.println("Product price: $" + price);
        System.out.println("Pi (float): " + pi);
        System.out.println();

        // DOUBLE Examples (64-bit floating point) - More commonly used
        System.out.println("2. DOUBLE (64-bit floating point) - Default Choice:");
        System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Precision: ~15-17 decimal digits");

        double preciseTemperature = 98.60000000001;
        double bankBalance = 15432.89;
        double piPrecise = 3.141592653589793;
        double gpsLatitude = 40.712776000000001;

        System.out.println("Precise temperature: " + preciseTemperature + "°F");
        System.out.println("Bank balance: $" + bankBalance);
        System.out.println("Pi (double): " + piPrecise);
        System.out.println("GPS Latitude: " + gpsLatitude);
        System.out.println();



        // Special Values
        System.out.println("4. Special Floating Point Values:");

        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        double notANumber = Double.NaN;
        double divisionByZero = 5.0 / 0.0; // Infinity
        double zeroDivision = 0.0 / 0.0;
        float divisionByZeroF = 5.0f / 0.0f; // Infinity

        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);
        System.out.println("Not a Number (NaN): " + notANumber);
        System.out.println("5.0 / 0.0 = " + divisionByZero);
        System.out.println("5.0f / 0.0f = " + divisionByZeroF);
        System.out.println("0.0 / 0.0 = " + zeroDivision);

        // Checking for special values
        System.out.println("Is NaN? " + Double.isNaN(notANumber));
        System.out.println("Is Infinite? " + Double.isInfinite(positiveInfinity));
        System.out.println();

        // Precision Comparison
        System.out.println("3. Precision Comparison:");

        float floatResult = 1.0f / 3.0f;
        double doubleResult = 1.0 / 3.0;

        System.out.println("1/3 as float:  " + floatResult);
        System.out.println("1/3 as double: " + doubleResult);

        // Large number precision loss
        float bigFloat = 16777216f;
        double bigDouble = 16777216.0;

        System.out.println("\nLarge number precision:");
        System.out.println("Float 16777216 + 1 = " + (bigFloat + 1));  // Precision loss!
        System.out.println("Double 16777216 + 1 = " + (bigDouble + 1)); // Still precise
        System.out.println();


        // Type Casting
        System.out.println("6. Type Casting Examples:");

        double doubleValue = 123.789;
        float floatFromDouble = (float) doubleValue;
        int intFromDouble = (int) doubleValue; // Truncates decimal part

        System.out.println("Original double: " + doubleValue);
        System.out.println("Cast to float: " + floatFromDouble);
        System.out.println("Cast to int (truncated): " + intFromDouble);

        // Automatic promotion
        int intNum = 10;
        double result = intNum / 3.0; // int promoted to double
        System.out.println("10 / 3.0 = " + result);
        System.out.println();

        // Floating Point Precision Issues
        System.out.println("7. ⚠️  Floating Point Precision Issues:");

        double a = 0.1;
        double b = 0.2;
        double sum = a + b;

        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("Is 0.1 + 0.2 == 0.3? " + (sum == 0.3));
        System.out.println("Difference from 0.3: " + Math.abs(sum - 0.3));

        // Safe comparison
        double epsilon = 1e-9;
        boolean isEqual = Math.abs(sum - 0.3) < epsilon;
        System.out.println("Safe comparison (within epsilon): " + isEqual);
        System.out.println();

    }
}
