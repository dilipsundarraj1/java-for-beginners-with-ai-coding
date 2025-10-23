package com.modernjava._10exceptions;

public class _5ExceptionPropagationDemo {

    // main() → method3() → method2() → method1() [throws here]

    public static void method1() {
        System.out.println("Inside method1()");
        throw new RuntimeException("Exception thrown in method1");
    }

    public static void method2() {
        System.out.println("Inside method2(), calling method1()");
        method1(); // Exception not handled here, propagates up
    }

    public static void method3() {
        System.out.println("Inside method3(), calling method2()");
        try {
            method2();
        } catch (RuntimeException e) {
            System.out.println("Exception caught in method3: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating Exception Propagation:");
        method3();
    }
}

