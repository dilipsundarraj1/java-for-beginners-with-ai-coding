package com.modernjava._2primitives;

/**
 * This class demonstrates all integer primitive data types in Java.
 * byte: 8-bit signed integer (-128 to 127)
 * short: 16-bit signed integer (-32,768 to 32,767)
 * int: 32-bit signed integer (-2,147,483,648 to 2,147,483,647)
 * long: 64-bit signed integer (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
 */
public class IntegerExamples {
    public static void main(String[] args) {
        System.out.println("=== Integer Primitive Types Examples ===\n");

        // BYTE Examples (8-bit signed integer)
        System.out.println("1. BYTE (8-bit signed integer):");

        byte age = 25;
        byte temperature = -15;
        byte percentage = 100;

        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Percentage: " + percentage + "%");

        short year = 2025;
        short elevation = -1500; // meters below sea level
        short pixels = 1920; // screen width
        short port = 8080; // network port

        System.out.println("Year: " + year);
        System.out.println("Elevation: " + elevation + " meters");
        System.out.println("Screen width: " + pixels + " pixels");
        System.out.println("Server port: " + port);
        System.out.println();

        // INT Examples (32-bit signed integer) - Most commonly used
        System.out.println("3. INT (32-bit signed integer) - Most Common:");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);

        int population = 1500000;
        int salary = 75000;
        int studentId = 12345;
        int distance = -500000; // negative for debt/deficit

        System.out.println("City population: " + population);
        System.out.println("Annual salary: $" + salary);
        System.out.println("Student ID: " + studentId);
        System.out.println("Distance/Deficit: " + distance);
        System.out.println();

        // LONG Examples (64-bit signed integer)
        System.out.println("4. LONG (64-bit signed integer):");
        System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        long worldPopulation = 8000000000L; // Note the 'L' suffix
        long nationalDebt = 31000000000000L;
        long milliseconds = System.currentTimeMillis();
        long fileSize = 2147483648L; // File larger than int can hold

        System.out.println("World population: " + worldPopulation);
        System.out.println("National debt: $" + nationalDebt);
        System.out.println("Current time (milliseconds): " + milliseconds);
        System.out.println("Large file size: " + fileSize + " bytes");
        System.out.println();

        // Demonstrating overflow/underflow
        System.out.println("5. Overflow/Underflow Examples:");

        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Max byte value: " + maxByte);
        System.out.println("Max byte + 1 (overflow): " + (byte)(maxByte + 1));

        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int value: " + maxInt);
        System.out.println("Max int + 1 (overflow): " + (maxInt + 1));
        System.out.println();

        // Type casting examples
        System.out.println("6. Type Casting Examples:");

        long bigNumber = 1000000L;
        int castedToInt = (int) bigNumber; // Explicit casting
        short castedToShort = (short) castedToInt;
        byte castedToByte = (byte) castedToShort;

        System.out.println("Original long: " + bigNumber);
        System.out.println("Casted to int: " + castedToInt);
        System.out.println("Casted to short: " + castedToShort);
        System.out.println("Casted to byte: " + castedToByte);

        // DETAILED EXPLANATION OF WHY VALUES CHANGE
        System.out.println("\n🔍 WHY DO VALUES CHANGE DURING CASTING?");
        System.out.println("==========================================");

        // Show binary representation
        System.out.println("Binary representation of 1000000:");
        System.out.println("Original (32-bit): " + String.format("%32s", Integer.toBinaryString(1000000)).replace(' ', '0'));
        System.out.println("Short keeps only last 16 bits: " + String.format("%16s", Integer.toBinaryString(castedToShort & 0xFFFF)).replace(' ', '0'));
        System.out.println("Byte keeps only last 8 bits:   " + String.format("%8s", Integer.toBinaryString(castedToByte & 0xFF)).replace(' ', '0'));

        // Mathematical explanation
        System.out.println("\nMathematical explanation:");
        System.out.println("1000000 in binary = 11110100001001000000");
        System.out.println("For short (16 bits): 1000000 % 65536 = " + (1000000 % 65536) + " = 16960");
        System.out.println("For byte (8 bits):   1000000 % 256 = " + (1000000 % 256) + " = 64");

    }
}
