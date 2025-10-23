package com.modernjava._10exceptions;

public class _7StackOverflowSimulation {
    public static void recursiveCall() {
        // No base condition → infinite recursion
        recursiveCall();
    }

    public static void main(String[] args) {
        System.out.println("Starting StackOverflowError simulation...");
        recursiveCall();
    }
}