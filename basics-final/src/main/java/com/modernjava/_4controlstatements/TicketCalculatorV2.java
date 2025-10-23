package com.modernjava._4controlstatements;

import java.util.Scanner;

public class TicketCalculatorV2 {

    enum SeatType { REGULAR, PREMIUM, RECLINER }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many tickets do you want to calculate? ");
        int numberOfTickets = scanner.nextInt();

        int totalPrice = 0;

        // FOR LOOP EXAMPLE 1: Processing multiple tickets
        for (int i = 1; i <= numberOfTickets; i++) {
            System.out.println("\n--- Ticket #" + i + " ---");

            System.out.print("Enter age for ticket " + i + ": ");
            int age = scanner.nextInt();

            System.out.print("Is ticket " + i + " for a member? (true/false): ");
            boolean isMember = scanner.nextBoolean();

            System.out.print("Enter seat type for ticket " + i + " (REGULAR, PREMIUM, RECLINER): ");
            String seatInput = scanner.next();
            SeatType seatType = SeatType.valueOf(seatInput.toUpperCase());

            // Calculate individual ticket price
            int ticketPrice = calculateBasePriceByAge(age);
            ticketPrice = applyMemberDiscount(ticketPrice, isMember);
            ticketPrice = applySeatSurcharge(ticketPrice, seatType);
            ticketPrice = ensureMinimumPrice(ticketPrice);

            System.out.println("Ticket #" + i + " Price: $" + ticketPrice);
            totalPrice += ticketPrice;
        }

        // Apply bulk discount if applicable
        int finalPrice = calculateBulkDiscount(totalPrice, numberOfTickets);

        System.out.println("\n=== ORDER SUMMARY ===");
        System.out.println("Total tickets: " + numberOfTickets);
        System.out.println("Subtotal: $" + totalPrice);
        System.out.println("Final Price (after bulk discount): $" + finalPrice);

        if (numberOfTickets > 1) {
            System.out.println("Average price per ticket: $" + (finalPrice / numberOfTickets));
        }

        // Demonstrate other for loop examples
        demonstrateAgePricing();
        demonstrateSeatPricing();

        scanner.close();
    }

    /**
     * Demonstrates if/else if/else chain concept
     * Age-based pricing with multiple mutually exclusive conditions
     */
    public static int calculateBasePriceByAge(int age) {
        int price;
        if (age < 3) {
            price = 0;  // free for toddlers
        } else if (age < 12) {
            price = 8;  // child price
        } else if (age < 60) {
            price = 12; // adult price
        } else {
            price = 9;  // senior price
        }
        return price;
    }

    /**
     * Demonstrates simple if statement with boolean condition
     * Member discount with compound boolean expression
     */
    public static int applyMemberDiscount(int currentPrice, boolean isMember) {
        if (isMember && currentPrice > 0) {
            currentPrice -= 1;  // subtract $1 for members
        }
        return currentPrice;
    }

    /**
     * Demonstrates switch expression with enum
     * Seat-based surcharge using modern switch expression
     */
    public static int applySeatSurcharge(int currentPrice, SeatType seatType) {
        int surcharge = switch (seatType) {
            case REGULAR -> 0;
            case PREMIUM -> 3; // $3.00
            case RECLINER -> 5; // $5.00
        };
        return currentPrice + surcharge;
    }

    /**
     * Demonstrates simple validation if statement
     * Ensures price doesn't go below zero (defensive programming)
     */
    public static int ensureMinimumPrice(int price) {
        if (price < 0) {
            price = 0;  // price cannot be negative
        }
        return price;
    }

    /**
     * FOR LOOP EXAMPLE 2: Bulk discount calculation using step-based for loop
     * Shows iterative processing for bulk discount scenarios
     */
    public static int calculateBulkDiscount(int totalPrice, int numberOfTickets) {
        int discount = 0;

        // Apply progressive bulk discount for every 5 tickets
        for (int i = 5; i <= numberOfTickets; i += 5) {
            discount += 2; // $2 discount for every group of 5 tickets
            System.out.println("Applied bulk discount for tickets " + (i-4) + "-" + i + ": $2");
        }

        if (discount > 0) {
            System.out.println("Total bulk discount applied: $" + discount);
        }

        return Math.max(0, totalPrice - discount);
    }

    /**
     * FOR LOOP EXAMPLE 3: Array processing with traditional for loop
     * Shows how for loops can be used for batch processing and analysis
     */
    public static void demonstrateAgePricing() {
        System.out.println("\n=== AGE PRICING ANALYSIS ===");
        int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};

        for (int i = 0; i < sampleAges.length; i++) {
            int age = sampleAges[i];
            int basePrice = calculateBasePriceByAge(age);
            String category = getCategoryName(age);
            System.out.println("Age " + age + " (" + category + "): $" + basePrice);
        }
    }

    /**
     * FOR LOOP EXAMPLE 4: Enhanced for loop (for-each) with enums
     * Shows modern for loop syntax with enum values
     */
    public static void demonstrateSeatPricing() {
        System.out.println("\n=== SEAT TYPE PRICING ANALYSIS ===");
        SeatType[] allSeatTypes = SeatType.values();

        for (SeatType seat : allSeatTypes) {
            int surcharge = switch (seat) {
                case REGULAR -> 0;
                case PREMIUM -> 3;
                case RECLINER -> 5;
            };
            System.out.println(seat + " seat surcharge: +$" + surcharge);
        }
    }

    /**
     * FOR LOOP EXAMPLE 5: Validation with for loop
     * Shows input validation using loops (bonus example)
     */
    public static SeatType getSeatTypeWithValidation(Scanner scanner) {
        SeatType[] validTypes = SeatType.values();

        while (true) {
            System.out.print("Enter seat type (");

            // Use for loop to display options
            for (int i = 0; i < validTypes.length; i++) {
                System.out.print(validTypes[i]);
                if (i < validTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("): ");

            String input = scanner.next().toUpperCase();

            // Use for loop to validate input
            for (SeatType type : validTypes) {
                if (type.name().equals(input)) {
                    return type;
                }
            }

            System.out.println("Invalid seat type. Please try again.");
        }
    }

    /**
     * Helper method to get category name for age groups
     */
    private static String getCategoryName(int age) {
        if (age < 3) return "Toddler";
        else if (age < 12) return "Child";
        else if (age < 60) return "Adult";
        else return "Senior";
    }
}
