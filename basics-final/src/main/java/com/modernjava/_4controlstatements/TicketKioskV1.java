package com.modernjava._4controlstatements;

import java.util.Scanner;

/**
 * Interactive Ticket Kiosk System V1 demonstrating ternary operators for categorization
 * Introduces ticket categories using ternary operator conditions
 */
public class TicketKioskV1 {

    enum SeatType { REGULAR, PREMIUM, RECLINER }

    private static Scanner scanner = new Scanner(System.in);
    private static int totalTicketsSold = 0;
    private static int totalRevenue = 0;

    static void main(String[] args) {
        System.out.println("🎬 Welcome to CineMax Ticket Kiosk V1! 🎬");
        System.out.println("=========================================");

        runKiosk();

        System.out.println("\nThank you for using CineMax Ticket Kiosk V1!");
        System.out.println("Have a great day! 🍿");
        scanner.close();
    }

    /**
     * Main kiosk loop demonstrating while loop with menu system
     */
    public static void runKiosk() {
        boolean keepRunning = true;

        while (keepRunning) {
            displayMainMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> buyTickets();
                case 2 -> showPricingInfo();
                case 3 -> showKioskStats();
                case 4 -> {
                    keepRunning = false;
                    System.out.println("Exiting kiosk...");
                }
                default -> System.out.println("❌ Invalid option. Please try again.");
            }

            if (keepRunning) {
                waitForUserToContinue();
            }
        }
    }

    /**
     * Display main menu options
     */
    private static void displayMainMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           MAIN MENU");
        System.out.println("=".repeat(40));
        System.out.println("1. 🎫 Buy Tickets");
        System.out.println("2. 💰 View Pricing Information");
        System.out.println("3. 📊 View Kiosk Statistics");
        System.out.println("4. 🚪 Exit");
        System.out.print("\nPlease select an option (1-4): ");
    }

    /**
     * Get user's menu choice with input validation using while loop
     */
    private static int getUserChoice() {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine().trim());
                return (choice >= 1 && choice <= 4) ? choice : -1; // Ternary for validation
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }

            if (getUserChoice() == -1) {
                System.out.print("Please enter a number between 1 and 4: ");
            }
        }
    }

    /**
     * Main ticket buying process using while loops for continuous purchasing
     */
    private static void buyTickets() {
        System.out.println("\n🎫 TICKET PURCHASING");
        System.out.println("=" + "=".repeat(30));

        boolean continueBuying = true;
        int sessionTickets = 0;
        int sessionTotal = 0;

        while (continueBuying) {
            System.out.println("\n--- Ticket #" + (sessionTickets + 1) + " ---");

            // Get ticket details
            int age = getValidAge();
            boolean isMember = getMembershipStatus();
            SeatType seatType = getSeatTypeWithValidation();

            // Calculate price and determine category using ternary operators
            int ticketPrice = calculateTicketPrice(age, isMember, seatType);
            String ticketCategory = determineTicketCategory(age, isMember, seatType);

            // Display ticket details with category
            displayTicketSummary(sessionTickets + 1, age, isMember, seatType, ticketPrice, ticketCategory);

            sessionTickets++;
            sessionTotal += ticketPrice;

            // Ask if user wants to buy more tickets
            continueBuying = askToBuyMoreTickets();
        }

        // Process final order
        if (sessionTickets > 0) {
            processFinalOrder(sessionTickets, sessionTotal);
        }
    }

    /**
     * Determine ticket category using ternary operators
     */
    private static String determineTicketCategory(int age, boolean isMember, SeatType seatType) {
        // Primary category based on age using ternary operators
        String ageCategory = age < 3 ? "FREE" :
                           age < 12 ? "CHILD" :
                           age >= 60 ? "SENIOR" : "ADULT";

        // Membership status using ternary operator
        String membershipStatus = isMember ? "MEMBER" : "REGULAR";

        // Seat category using ternary operators
        String seatCategory = seatType == SeatType.REGULAR ? "STANDARD" :
                            seatType == SeatType.PREMIUM ? "PREMIUM" :
                            "LUXURY"; // RECLINER

        // Premium category determination using nested ternary operators
        boolean isPremiumCategory = (age >= 12 && age < 60 && isMember && seatType != SeatType.REGULAR);
        String categoryLevel = isPremiumCategory ? "GOLD" :
                             (isMember && seatType == SeatType.PREMIUM) ? "SILVER" :
                             "BRONZE";

        // Final category using ternary operator for formatting
        return String.format("%s-%s-%s (%s)", ageCategory, membershipStatus, seatCategory, categoryLevel);
    }

    /**
     * Get valid age input with while loop validation
     */
    private static int getValidAge() {
        int age;
        while (true) {
            System.out.print("Enter age (0-120): ");
            try {
                age = Integer.parseInt(scanner.nextLine().trim());
                // Ternary operator for age validation
                boolean isValidAge = (age >= 0 && age <= 120);
                if (isValidAge) {
                    break;
                } else {
                    System.out.println("❌ Age must be between 0 and 120.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Please enter a valid number.");
            }
        }
        return age;
    }

    /**
     * Get membership status with input validation using ternary operator
     */
    private static boolean getMembershipStatus() {
        while (true) {
            System.out.print("Are you a member? (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();

            // Ternary operators for membership validation
            boolean isYes = input.equals("y") || input.equals("yes");
            boolean isNo = input.equals("n") || input.equals("no");

            // Return result using ternary operator
            return isYes ? true :
                   isNo ? false :
                   getMembershipStatus(); // Recursive call if invalid input
        }
    }

    /**
     * Get seat type with validation using ternary operators
     */
    private static SeatType getSeatTypeWithValidation() {
        SeatType[] validTypes = SeatType.values();

        while (true) {
            System.out.print("Select seat type (REGULAR, PREMIUM, RECLINER): ");
            String input = scanner.nextLine().trim().toUpperCase();

            // Use ternary operators to find matching seat type
            SeatType selectedType = input.equals("REGULAR") ? SeatType.REGULAR :
                                  input.equals("PREMIUM") ? SeatType.PREMIUM :
                                  input.equals("RECLINER") ? SeatType.RECLINER :
                                  null;

            // Return using ternary operator
            if (selectedType != null) {
                return selectedType;
            } else {
                System.out.println("❌ Invalid seat type. Please try again.");
            }
        }
    }

    /**
     * Ask user if they want to buy more tickets using ternary operator
     */
    private static boolean askToBuyMoreTickets() {
        while (true) {
            System.out.print("\nWould you like to buy another ticket? (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();

            // Ternary operator for yes/no validation
            return input.equals("y") || input.equals("yes") ? true :
                   input.equals("n") || input.equals("no") ? false :
                   askToBuyMoreTickets(); // Recursive call for invalid input
        }
    }

    /**
     * Display ticket summary with category information
     */
    private static void displayTicketSummary(int ticketNumber, int age, boolean isMember,
                                          SeatType seatType, int price, String category) {
        System.out.println("\n✅ TICKET SUMMARY");
        System.out.println("Ticket #" + ticketNumber);
        System.out.println("Age: " + age + " (" + getAgeCategoryName(age) + ")");
        System.out.println("Member: " + (isMember ? "Yes" : "No")); // Ternary operator
        System.out.println("Seat Type: " + seatType);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);

        // Discount indicator using ternary operator
        String discountInfo = isMember ? "✅ Member discount applied" : "💡 Become a member to save $1";
        System.out.println(discountInfo);
    }

    /**
     * Process final order with bulk discount
     */
    private static void processFinalOrder(int numberOfTickets, int subtotal) {
        int finalPrice = calculateBulkDiscount(subtotal, numberOfTickets);

        System.out.println("\n🧾 ORDER SUMMARY");
        System.out.println("=" + "=".repeat(30));
        System.out.println("Total tickets: " + numberOfTickets);
        System.out.println("Subtotal: $" + subtotal);

        // Ternary operator for discount display
        String discountText = (subtotal != finalPrice) ?
            ("Bulk discount: $" + (subtotal - finalPrice)) :
            "No bulk discount applied";
        System.out.println(discountText);

        System.out.println("Final Price: $" + finalPrice);

        // Ternary operator for average calculation
        String averageInfo = (numberOfTickets > 1) ?
            ("Average per ticket: $" + (finalPrice / numberOfTickets)) :
            "Single ticket purchase";
        System.out.println(averageInfo);

        // Update kiosk statistics
        totalTicketsSold += numberOfTickets;
        totalRevenue += finalPrice;

        System.out.println("\n🎉 Purchase successful! Enjoy your movie!");
    }

    /**
     * Show pricing information menu
     */
    private static void showPricingInfo() {
        System.out.println("\n💰 PRICING INFORMATION");
        System.out.println("=" + "=".repeat(30));

        demonstrateAgePricing();
        demonstrateSeatPricing();
        showDiscountInfo();
        showCategoryExamples();
    }

    /**
     * Show category examples using ternary operators
     */
    private static void showCategoryExamples() {
        System.out.println("\n🏷️ CATEGORY EXAMPLES");
        System.out.println("Category format: AGE-MEMBERSHIP-SEAT (LEVEL)");

        // Examples using ternary operators for different scenarios
        String[] examples = {
            "Child Member Premium: " + determineTicketCategory(8, true, SeatType.PREMIUM),
            "Adult Regular Standard: " + determineTicketCategory(25, false, SeatType.REGULAR),
            "Senior Member Luxury: " + determineTicketCategory(65, true, SeatType.RECLINER),
            "Adult Member Premium: " + determineTicketCategory(30, true, SeatType.PREMIUM)
        };

        for (String example : examples) {
            System.out.println("• " + example);
        }
    }

    /**
     * Show discount information
     */
    private static void showDiscountInfo() {
        System.out.println("\n🏷️ DISCOUNTS & OFFERS");
        System.out.println("Member Discount: $1 off per ticket");
        System.out.println("Bulk Discount: $2 off for every 5 tickets purchased");
        System.out.println("Note: Prices cannot go below $0");
    }

    /**
     * Show kiosk statistics using ternary operators for display
     */
    private static void showKioskStats() {
        System.out.println("\n📊 KIOSK STATISTICS");
        System.out.println("=" + "=".repeat(30));
        System.out.println("Total tickets sold today: " + totalTicketsSold);
        System.out.println("Total revenue today: $" + totalRevenue);

        // Ternary operator for average calculation display
        String averageDisplay = (totalTicketsSold > 0) ?
            ("Average ticket price: $" + (totalRevenue / totalTicketsSold)) :
            "No tickets sold yet today";
        System.out.println(averageDisplay);

        // Performance indicator using ternary operators
        String performanceIndicator = totalRevenue > 100 ? "🔥 Great sales day!" :
                                    totalRevenue > 50 ? "📈 Good progress!" :
                                    totalRevenue > 0 ? "🌱 Getting started!" :
                                    "💤 Awaiting first sale...";
        System.out.println("Status: " + performanceIndicator);
    }

    /**
     * Wait for user to press Enter to continue
     */
    private static void waitForUserToContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // ===== PRICING METHODS =====

    /**
     * Calculate individual ticket price
     */
    private static int calculateTicketPrice(int age, boolean isMember, SeatType seatType) {
        int price = calculateBasePriceByAge(age);
        price = applyMemberDiscount(price, isMember);
        price = applySeatSurcharge(price, seatType);
        price = ensureMinimumPrice(price);
        return price;
    }

    /**
     * Age-based pricing using ternary operators
     */
    public static int calculateBasePriceByAge(int age) {
        // Nested ternary operators for age-based pricing
        return age < 3 ? 0 :          // free for toddlers
               age < 12 ? 8 :         // child price
               age < 60 ? 12 :        // adult price
               9;                     // senior price
    }

    /**
     * Member discount application using ternary operator
     */
    public static int applyMemberDiscount(int currentPrice, boolean isMember) {
        // Ternary operator for member discount
        return (isMember && currentPrice > 0) ? currentPrice - 1 : currentPrice;
    }

    /**
     * Seat surcharge using ternary operators
     */
    public static int applySeatSurcharge(int currentPrice, SeatType seatType) {
        // Ternary operators for seat surcharge
        int surcharge = seatType == SeatType.REGULAR ? 0 :
                       seatType == SeatType.PREMIUM ? 3 :
                       5; // RECLINER
        return currentPrice + surcharge;
    }

    /**
     * Ensure minimum price validation using ternary operator
     */
    public static int ensureMinimumPrice(int price) {
        // Ternary operator for minimum price validation
        return price < 0 ? 0 : price;
    }

    /**
     * Calculate bulk discount using ternary operator for discount logic
     */
    public static int calculateBulkDiscount(int totalPrice, int numberOfTickets) {
        // Calculate discount using ternary operator
        int discountGroups = numberOfTickets / 5;
        int discount = discountGroups * 2; // $2 per group of 5 tickets

        // Return final price using ternary operator
        int finalPrice = totalPrice - discount;
        return finalPrice > 0 ? finalPrice : 0;
    }

    /**
     * Demonstrate age pricing with ternary operators
     */
    public static void demonstrateAgePricing() {
        System.out.println("\n👶👧🧑👴 AGE-BASED PRICING");
        int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};

        for (int age : sampleAges) {
            int basePrice = calculateBasePriceByAge(age);
            String category = getAgeCategoryName(age);
            // Ternary operator for price display formatting
            String priceDisplay = basePrice == 0 ? "FREE" : "$" + basePrice;
            System.out.println("Age " + age + " (" + category + "): " + priceDisplay);
        }
    }

    /**
     * Demonstrate seat pricing
     */
    public static void demonstrateSeatPricing() {
        System.out.println("\n🪑 SEAT TYPE SURCHARGES");
        SeatType[] allSeatTypes = SeatType.values();

        for (SeatType seat : allSeatTypes) {
            // Ternary operators for surcharge calculation
            int surcharge = seat == SeatType.REGULAR ? 0 :
                          seat == SeatType.PREMIUM ? 3 :
                          5; // RECLINER

            // Ternary operator for display formatting
            String surchargeText = surcharge == 0 ? "No surcharge" : "+$" + surcharge + " surcharge";
            System.out.println(seat + " seat: " + surchargeText);
        }
    }

    /**
     * Get category name for age groups using ternary operators
     */
    private static String getAgeCategoryName(int age) {
        // Ternary operators for age category naming
        return age < 3 ? "Toddler" :
               age < 12 ? "Child" :
               age < 60 ? "Adult" :
               "Senior";
    }
}
