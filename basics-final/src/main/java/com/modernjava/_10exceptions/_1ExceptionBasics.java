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
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    // Demonstrates NullPointerException
    static void demoNullPointerException() {
        try {
            String text = null;
            System.out.println(text.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a null pointer exception: " + e);
        }catch(Exception e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    // Demonstrates ArrayIndexOutOfBoundsException
    static void demoArrayIndexOutOfBoundsException() {
        System.out.println("Example: ArrayIndexOutOfBoundsException (Invalid Index Access)");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught array index out of bounds exception: " + e);
        }
    }

    // Demonstrates ClassCastException
    static void demoClassCastException() {
        System.out.println("Example: ClassCastException (Invalid Type Casting)");
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj; // Invalid cast
            System.out.println(num);
        } catch (ClassCastException e) {
            System.out.println("Caught class cast exception: " + e);
        }
    }

    // Demonstrates IllegalArgumentException
    static void demoIllegalArgumentException() {
        System.out.println("Example: IllegalArgumentException (Invalid Argument)");
        try {
            printSquareRoot(-4); // Invalid argument
        } catch (IllegalArgumentException e) {
            System.out.println("Caught illegal argument exception: " + e);
        }
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
