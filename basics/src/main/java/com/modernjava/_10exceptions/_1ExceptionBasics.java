package com.modernjava._10exceptions;



public class _1ExceptionBasics {
    public static void main(String[] args) {
        System.out.println("--- Exception Basics Demo ---");
        demoArithmeticException();
        demoNullPointerException();
        demoArrayIndexOutOfBoundsException();
        demoClassCastException();
        demoIllegalArgumentException();
        System.out.println("Program continues after exception handling.");
    }

    // Demonstrates ArithmeticException
    static void demoArithmeticException() {
        // handle this exception
        int result = 10 / 0; // This will cause ArithmeticException
    }

    // Demonstrates NullPointerException
    static void demoNullPointerException() {
            // handle the specific exception and also wrap it with generic exception
            String text = null;
            System.out.println(text.length()); // This will cause NullPointerException
    }

    // Demonstrates ArrayIndexOutOfBoundsException
    static void demoArrayIndexOutOfBoundsException() {
            int[] arr = {1, 2, 3};
    }

    // Demonstrates ClassCastException
    static void demoClassCastException() {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Invalid cast
            System.out.println(num);
    }

    // Demonstrates IllegalArgumentException
    static void demoIllegalArgumentException() {
            printSquareRoot(-4); // Invalid argument
    }

    private static double printSquareRoot(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        double result = Math.sqrt(num);
        System.out.println("Square root: " + result);
        return result;
    }
}
