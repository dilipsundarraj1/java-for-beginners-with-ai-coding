package com.modernjava._4controlstatements.ifelse;

public class TicketCalculator {

    enum SeatType { REGULAR, PREMIUM, RECLINER }

    public static void main(String[] args) {
        int age = 34;
        boolean isMember = true;
        SeatType seatType = SeatType.PREMIUM;

        // Demonstrate if/else if/else chain for age-based pricing
        int price = calculateBasePriceByAge(age);

        // Demonstrate individual if statements for discounts and surcharges
        price = applyMemberDiscount(price, isMember);
        price = applySeatSurcharge(price, seatType);

        // Demonstrate simple if statement for validation
        price = ensureMinimumPrice(price);

        System.out.println("Final Ticket Price: $" + price);
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
