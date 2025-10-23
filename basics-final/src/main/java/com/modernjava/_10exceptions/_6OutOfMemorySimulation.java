package com.modernjava._10exceptions;

import java.util.ArrayList;
import java.util.List;

public class _6OutOfMemorySimulation {
    public static void main(String[] args) {
        demoOutOfMemoryError();
    }

    public static void demoOutOfMemoryError() {
        System.out.println("--- OutOfMemoryError Simulation Demo ---");
        List<int[]> memoryHog = new ArrayList<>();
        try {
            while (true) {
                // Allocate large chunks of memory repeatedly
                memoryHog.add(new int[1_000_000]); // 1 million integers ~ 4MB
                System.out.println("Allocated ~ " + memoryHog.size() * 4 + " MB");
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError caught! JVM ran out of heap space.");
        }
        System.out.println("Program continues after OutOfMemoryError.");
    }
}