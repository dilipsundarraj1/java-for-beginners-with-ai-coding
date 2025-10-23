package com.modernjava._10exceptions;

import java.io.IOException;

public class _4ThrowingExceptions {
    public static void main(String[] args) {
        System.out.println("--- Throwing Exceptions Demo ---");
        demoThrowExample();
        try {
            demoThrowsExample();
        } catch (IOException e) {
            System.out.println("Checked exception thrown using throws: " + e.getMessage());
        }
    }

    static void demoThrowExample() {
        System.out.println("--- Throw Example Demo ---");
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }

    static void demoThrowsExample() throws IOException {
        System.out.println("--- Throws Example Demo ---");
        System.out.print("Enter a character: ");
        int ch = System.in.read(); // This can throw IOException
        System.out.println("You entered: " + (char) ch);
    }
}
