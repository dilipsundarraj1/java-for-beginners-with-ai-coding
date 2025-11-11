package app.service;

import app.domain.SeatType;

/**
 * PricingEngine is a utility class that handles all pricing calculations for movie tickets.
 * It provides methods to calculate base prices, apply discounts, add seat surcharges,
 * and determine ticket categories. This is a final class with a private constructor to
 * prevent instantiation, as it contains only static utility methods.
 */
public final class PricingEngine {
    // Private constructor to prevent instantiation of this utility class
    private PricingEngine() {}

    /**
     * Calculates the final ticket price based on age, membership status, and seat type.
     * This method orchestrates the pricing calculation by applying multiple pricing rules in sequence:
     * 1. Calculate base price by age
     * 2. Apply member discount if applicable
     * 3. Add seat type surcharge
     * 4. Ensure the final price is not negative
     *
     * @param age The age of the ticket holder
     * @param member Whether the ticket holder is a member
     * @param seatType The type of seat selected (REGULAR, PREMIUM, RECLINER)
     * @return The final calculated ticket price
     */
    public static int calculateTicketPrice(int age, boolean member, SeatType seatType) {
        int price = calculateBasePriceByAge(age);
        price = applyMemberDiscount(price, member);
        price = applySeatSurcharge(price, seatType);
        return ensureMinimumPrice(price);
    }

    /**
     * Determines the base ticket price based on the customer's age.
     * Uses age-based pricing tiers:
     * - Under 3 years: FREE (0)
     * - 3 to 11 years: CHILD rate (8)
     * - 12 to 59 years: ADULT rate (12)
     * - 60 years and over: SENIOR rate (9)
     *
     * @param age The age of the ticket holder
     * @return The base ticket price for the given age
     */
    public static int calculateBasePriceByAge(int age) {
        return age < 3 ? 0 : age < 12 ? 8 : age < 60 ? 12 : 9;
    }

    /**
     * Applies a member discount to the ticket price.
     * Members receive a $1 discount on any ticket with a price greater than 0.
     * If the customer is not a member or the price is already 0, no discount is applied.
     *
     * @param price The current ticket price
     * @param member Whether the ticket holder is a member
     * @return The price after applying member discount
     */
    public static int applyMemberDiscount(int price, boolean member) {
        return (member && price > 0) ? price - 1 : price;
    }

    /**
     * Applies a seat type surcharge to the ticket price.
     * Different seat types have different surcharges:
     * - REGULAR: $0 (base seat type)
     * - PREMIUM: $3 (enhanced seating)
     * - RECLINER: $5 (luxury seating)
     *
     * @param price The current ticket price
     * @param seatType The type of seat selected
     * @return The price after adding the seat type surcharge
     */
    public static int applySeatSurcharge(int price, SeatType seatType) {
        // Determine surcharge amount based on seat type
        int surcharge = switch (seatType) {
            case REGULAR -> 0;
            case PREMIUM -> 3;
            case RECLINER -> 5;
        };
        return price + surcharge;
    }

    /**
     * Ensures the final ticket price is never negative.
     * This method serves as a safety check to guarantee that after all calculations,
     * the price is at least 0.
     *
     * @param price The calculated ticket price
     * @return The price, or 0 if the calculated price is negative
     */
    public static int ensureMinimumPrice(int price) {
        return Math.max(price, 0);
    }

    /**
     * Calculates the final price after applying bulk discounts.
     * Bulk discount is applied based on quantity:
     * - For every 5 tickets purchased, a $2 discount is applied to the total
     * - The final price is guaranteed to never be negative
     *
     * @param totalPrice The subtotal price of all tickets before bulk discount
     * @param numberOfTickets The total number of tickets in the purchase
     * @return The final price after applying bulk discount
     */
    public static int calculateBulkDiscount(int totalPrice, int numberOfTickets) {
        // Calculate discount: $2 for every 5 tickets
        int discount = (numberOfTickets / 5) * 2;
        return Math.max(totalPrice - discount, 0);
    }

    /**
     * Converts a numeric age to its corresponding age category name.
     * Returns a human-readable category for displaying age classifications.
     *
     * @param age The age of the ticket holder
     * @return The age category name (Toddler, Child, Adult, or Senior)
     */
    public static String getAgeCategoryName(int age) {
        return age < 3 ? "Toddler" : age < 12 ? "Child" : age < 60 ? "Adult" : "Senior";
    }

    /**
     * Determines a comprehensive ticket category string combining age, membership, seat type, and tier level.
     * Returns a formatted string with ticket classification information in the format:
     * "AGE_CATEGORY-MEMBERSHIP_STATUS-SEAT_CATEGORY (TIER_LEVEL)"
     *
     * Examples:
     * - "ADULT-MEMBER-PREMIUM (GOLD)"
     * - "CHILD-REGULAR-STANDARD (BRONZE)"
     * - "SENIOR-MEMBER-LUXURY (SILVER)"
     *
     * Tier levels are determined as follows:
     * - GOLD: Adult (12-59) member with non-regular seat
     * - SILVER: Member with premium seat
     * - BRONZE: All other combinations
     *
     * @param age The age of the ticket holder
     * @param member Whether the ticket holder is a member
     * @param seatType The type of seat selected
     * @return A formatted string representing the ticket category
     */
    public static String determineTicketCategory(int age, boolean member, SeatType seatType) {
        // Determine the age category string
        String ageCategory = age < 3 ? "FREE" : age < 12 ? "CHILD" : age >= 60 ? "SENIOR" : "ADULT";
        // Determine membership status string
        String membershipStatus = member ? "MEMBER" : "REGULAR";
        // Determine the seat category string
        String seatCategory = switch (seatType) {
            case REGULAR -> "STANDARD";
            case PREMIUM -> "PREMIUM";
            case RECLINER -> "LUXURY";
        };
        // Determine the tier level based on customer profile
        // GOLD tier: Adults who are members with premium seating
        boolean premiumCat = (age >= 12 && age < 60 && member && seatType != SeatType.REGULAR);
        // SILVER tier: Members with premium seats, BRONZE for all others
        String categoryLevel = premiumCat ? "GOLD" : (member && seatType == SeatType.PREMIUM) ? "SILVER" : "BRONZE";
        // Return formatted ticket category string
        return String.format("%s-%s-%s (%s)", ageCategory, membershipStatus, seatCategory, categoryLevel);
    }
}
