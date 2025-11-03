package com.modernjava._4controlstatements._for;

public class ForDemo {

    public static void basicForLoop(){
        // Basic for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }

    public static void sumForLoop() {
        // Sums numbers from 1 to 5
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to 5: " + sum);
    }



    public static void main(String[] args) {

        // for loop
        basicForLoop();
        sumForLoop();

        // enhanced-for loop
        showSeats();
        showPrices();
        showSeatAvailability();

        // odd and even numbers
        printOddAndEvenNumbers();
    }

    private static void showSeats() {
        int[] seats = {1, 2, 3};
        for (int seat : seats) {
            System.out.println("Seat: " + seat);
        }
    }

    private static void showPrices() {
        double[] prices = {12.50, 15.75, 8.99};
        for (double price : prices) {
            System.out.println("Price: $" + price);
        }
    }

    /**
     * Demonstrates enhanced for loop with char array
     * Shows how to count and categorize seat availability
     */
    private static void showSeatAvailability() {
        System.out.println("\n=== SEAT AVAILABILITY STATUS ===");
        
        // A = available, X = booked
        char[] seats = {'A', 'X', 'A', 'A', 'X', 'A', 'X', 'A'};

        int availableCount = 0;
        int bookedCount = 0;

        // Enhanced for loop — reading values only
        for (char status : seats) {
            if (status == 'A') {
                availableCount++;
            } else if (status == 'X') {
                bookedCount++;
            }
        }

        System.out.println("Available: " + availableCount);
        System.out.println("Booked   : " + bookedCount);
        
        // Display visual representation
        System.out.print("Seats    : ");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("[" + seats[i] + "] ");
        }
        System.out.println();
        System.out.print("Position : ");
        for (int i = 0; i < seats.length; i++) {
            System.out.print(" " + (i + 1) + "  ");
        }
        System.out.println();
    }

    /**
     * Prints odd and even numbers from 1 to 100 using a single for loop
     * Also counts the total number of odd and even numbers
     */
    private static void printOddAndEvenNumbers() {
        System.out.println("\n=== ODD AND EVEN NUMBERS FROM 1 TO 100 ===");

        int oddCount = 0;
        int evenCount = 0;

        System.out.print("Odd Numbers  : ");
        System.out.print("Even Numbers : ");

        // Single for loop to process all numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                // odd numbers
                System.out.print(i + " ");
                oddCount++;
            } else {
                // even numbers
                System.out.print(i + " ");
                evenCount++;
            }
        }

        System.out.println("\n\nOdd Count  : " + oddCount);
        System.out.println("Even Count : " + evenCount);
        System.out.println("Total      : " + (oddCount + evenCount));
    }
}
