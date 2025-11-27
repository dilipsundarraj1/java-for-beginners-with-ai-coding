package com.modernjava._4controlstatements.ifelse;

/**
 * Utility class that demonstrates simple control-flow statements related to
 * ticket pricing: age-based base prices, member discounts, seat surcharges,
 * and validation to ensure a non-negative final price.
 */
public class TicketCalculator {

    /** Types of seats available when purchasing a ticket. */
    public enum SeatType { REGULAR, PREMIUM, RECLINER }

    /**
     * Example entry point that demonstrates usage of the helper methods in this
     * class. Initializes sample values, calculates the final ticket price and
     * prints it to standard output.
     *
     * @param args command-line arguments (ignored)
     */
    static void main(@SuppressWarnings("unused") String[] args) {
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
     * Determine the base ticket price according to the passenger's age.
     * Uses mutually-exclusive if / else-if / else branches to select one price.
     *
     * Pricing rules:
     * - age < 3 : free (0)
     * - 3 <= age < 12 : child price (8)
     * - 12 <= age < 60 : adult price (12)
     * - age >= 60 : senior price (9)
     *
     * @param age the age of the ticket holder (years)
     * @return the base ticket price in whole dollars (non-negative)
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
     * Apply a member discount to the current price when applicable.
     * If the purchaser is a member and the current price is greater than zero,
     * subtracts a flat $1 discount. The method never produces a negative price
     * (calling code should still validate if stricter guarantees are required).
     *
     * @param currentPrice the current ticket price before discount
     * @param isMember true if the purchaser is a member and eligible for a discount
     * @return the new ticket price after applying the member discount (>= 0)
     */
    public static int applyMemberDiscount(int currentPrice, boolean isMember) {
        if (isMember && currentPrice > 0) {
            currentPrice -= 1;  // subtract $1 for members
        }
        return currentPrice;
    }

    /**
     * Apply a seat-type surcharge to the current price.
     * Surcharges are applied based on the selected SeatType:
     * - REGULAR : $0
     * - PREMIUM : $3
     * - RECLINER: $5
     *
     * @param currentPrice the current ticket price before surcharge
     * @param seatType the selected seat type which determines the surcharge
     * @return the new ticket price after adding the seat surcharge
     */
    public static int applySeatSurcharge(int currentPrice, SeatType seatType) {
        int surcharge;
        if (seatType == SeatType.REGULAR) {
            surcharge = 0;
        } else if (seatType == SeatType.PREMIUM) {
            surcharge = 3; // $3.00
        } else if (seatType == SeatType.RECLINER) {
            surcharge = 5; // $5.00
        } else {
            surcharge = 0; // default case, should not occur
        }
        return currentPrice + surcharge;
    }

    /**
     * Ensure the computed price is not negative. If the provided price is
     * negative the method returns zero; otherwise it returns the original
     * price unchanged.
     *
     * @param price the computed ticket price which may be negative
     * @return price if non-negative, otherwise 0
     */
    public static int ensureMinimumPrice(int price) {
        if (price < 0) {
            price = 0;  // price cannot be negative
        }
        return price;
    }
}
