package com.modernjava._4controlstatements._while;

import java.util.Scanner;

public class WhileDemo {

    public static void basicWhileLoop() {
        // Basic while loop
        int i = 0;
        while (i < 5) {
            System.out.println("While Iteration: " + i);
            i++;
        }
    }

    public static void basicDoWhileLoop() {
        // Basic do-while loop
        int i = 0;
        do {
            System.out.println("Do-While Iteration: " + i);
            i++;
        } while (i < 5);
    }

    public static void checkAvailableSeatsLogic() {
        Scanner sc = new Scanner(System.in);

        int availableSeats = 5; // small screen :)
        System.out.println("Welcome to CineMax! Seats available: " + availableSeats);

        while (availableSeats > 0) {
            System.out.print("How many tickets would you like to buy? ");
            int requested = sc.nextInt();

            if (requested <= 0) {
                System.out.println("Please enter at least 1.");
                continue; // re-ask in the same loop
            }

            if (requested > availableSeats) {
                System.out.println("Only " + availableSeats + " left. Try a smaller number.");
                continue;
            }

            availableSeats -= requested;
            System.out.println("Purchased " + requested + " ticket(s). Remaining: " + availableSeats);
        }

        System.out.println("Sorry, sold out!");
        sc.close();
    }

    public static void doWhileSeatBooking() {
        Scanner sc = new Scanner(System.in);

        int availableSeats = 3;
        String choice;

        do {
            System.out.println("\nSeats left: " + availableSeats);
            if (availableSeats == 0) {
                System.out.println("Sold out. Come back later!");
                break;
            }

            System.out.print("How many tickets? ");
            int req = sc.nextInt();

            if (req <= 0 || req > availableSeats) {
                System.out.println("Invalid amount. Try again next time.");
            } else {
                availableSeats -= req;
                System.out.println("Purchased " + req + ". Remaining: " + availableSeats);
            }

            System.out.print("Would you like to buy again? (y/n): ");
            choice = sc.next().trim().toLowerCase();
        } while (choice.equals("y"));

        System.out.println("Thanks for visiting CineMax!");
        sc.close();
    }

    public static void main(String[] args) {
//        System.out.println("=== While Loop Demo ===");
//        basicWhileLoop();
//
//        System.out.println("\n=== Do-While Loop Demo ===");
//        basicDoWhileLoop();
//
//        System.out.println("\n=== While Seat Booking System Demo ===");
//        checkAvailableSeatsLogic();

        System.out.println("\n=== Do-While Seat Booking System Demo ===");
        doWhileSeatBooking();
    }
}
