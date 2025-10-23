package com.modernjava._10exceptions;

public class _2TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("--- Try-Catch-Finally Demo ---");
        demoTryCatchFinally();
        demoFinallyNoException();
        demoFinallyWithReturn();
        System.out.println("Program continues after try-catch-finally.");
    }

    static void demoTryCatchFinally() {
        try {
            int result = 20 / 0;
//            int result = 20 / 4;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }
    }

    static void demoFinallyNoException() {
        System.out.println("--- Finally with No Exception Demo ---");
        try {
            int result = 20 / 4;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes (no exception).\n");
        }
    }

    static void demoFinallyWithReturn() {
        System.out.println("--- Finally with Return Statement Demo ---");
        int value = getValueWithFinally();
        System.out.println("Returned value: " + value);
    }

    static int getValueWithFinally() {
        try {
            System.out.println("In try block, returning 42.");
            return 42;
        } finally {
            System.out.println("Finally block executes even after return statement.\n");
        }
    }
}
