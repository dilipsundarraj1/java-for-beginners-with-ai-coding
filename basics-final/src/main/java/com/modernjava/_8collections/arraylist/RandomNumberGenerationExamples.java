package com.modernjava._8collections.arraylist;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.security.SecureRandom;

/**
 * RandomNumberGenerationExamples
 * Demonstrates different ways to generate random numbers in Java.
 */
public class RandomNumberGenerationExamples {
    public static void main(String[] args) {
        System.out.println("=== Random Number Generation in Java ===\n");
        demonstrateUtilRandom();
        demonstrateMathRandom();
    }

    // 1. Using java.util.Random
    private static void demonstrateUtilRandom() {
        System.out.println("1. Using java.util.Random:");
        Random random = new Random();
        var randomInt = random.nextInt();
        var randomBound = random.nextInt(100);
        var randomDouble = random.nextDouble();
        var randomBoolean = random.nextBoolean();

        System.out.println("   Random int: " + random.nextInt());
        System.out.println("   Random int (0-99): " + random.nextInt(100));
        System.out.println("   Random double: " + random.nextDouble());
        System.out.println("   Random boolean: " + random.nextBoolean());
        System.out.println();
    }

    // 2. Using Math.random()
    private static void demonstrateMathRandom() {
        System.out.println("2. Using Math.random():");
        double rand = Math.random(); // [0.0, 1.0)
        System.out.println("   Random double [0.0, 1.0): " + rand);
        int randInt = (int) (Math.random() * 100); // [0, 99]
        System.out.println("   Random int (0-99): " + randInt);
        System.out.println();
    }


}

