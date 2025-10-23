package com.modernjava._4controlstatements;

import java.util.Scanner;

public class TicketCalculatorV1 {

    enum SeatType { REGULAR, PREMIUM, RECLINER }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a member? (true/false): ");
        boolean isMember = scanner.nextBoolean();

        System.out.print("Enter seat type (REGULAR, PREMIUM, RECLINER): ");
        String seatInput = scanner.next();
        SeatType seatType = SeatType.valueOf(seatInput.toUpperCase());

        // Calculate price using same logic as TicketCalculator
        int price = calculateBasePriceByAge(age);
        price = applyMemberDiscount(price, isMember);
        price = applySeatSurcharge(price, seatType);
        price = ensureMinimumPrice(price);

        System.out.println("Final Ticket Price: $" + price);
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
     * Demonstrates switch expression with enum (replaced applyPremiumSurcharge)
     * Seat-based surcharge using modern switch expression from SwitchDemo
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
}

