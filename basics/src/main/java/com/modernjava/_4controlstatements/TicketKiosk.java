package com.modernjava._4controlstatements;

import java.util.Scanner;

/**
 * Interactive Ticket Kiosk System demonstrating while loops and menu-driven programming
 * Extends functionality from TicketCalculatorV2 with interactive user interface
 */
public class TicketKiosk {

    enum SeatType { REGULAR, PREMIUM, RECLINER }

    private static Scanner scanner = new Scanner(System.in);
    private static int totalTicketsSold = 0;
    private static int totalRevenue = 0;

    public static void main(String[] args) {
        System.out.println("🎬 Welcome to CineMax Ticket Kiosk! 🎬");
        System.out.println("=====================================");

        runKiosk();

        System.out.println("\nThank you for using CineMax Ticket Kiosk!");
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
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.print("Please enter a number between 1 and 4: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
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

            // Calculate price
            int ticketPrice = calculateTicketPrice(age, isMember, seatType);

            // Display ticket details
            displayTicketSummary(sessionTickets + 1, age, isMember, seatType, ticketPrice);

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
     * Get valid age input with while loop validation
     */
    private static int getValidAge() {
        int age;
        while (true) {
            System.out.print("Enter age (0-120): ");
            try {
                age = Integer.parseInt(scanner.nextLine().trim());
                if (age >= 0 && age <= 120) {
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
     * Get membership status with input validation
     */
    private static boolean getMembershipStatus() {
        while (true) {
            System.out.print("Are you a member? (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                return true;
            } else if (input.equals("n") || input.equals("no")) {
                return false;
            } else {
                System.out.println("❌ Please enter 'y' for yes or 'n' for no.");
            }
        }
    }

    /**
     * Get seat type with validation using while loop and enhanced for loop
     */
    private static SeatType getSeatTypeWithValidation() {
        SeatType[] validTypes = SeatType.values();

        while (true) {
            System.out.print("Select seat type (");

            // Enhanced for loop to display options
            for (int i = 0; i < validTypes.length; i++) {
                System.out.print(validTypes[i]);
                if (i < validTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("): ");

            String input = scanner.nextLine().trim().toUpperCase();

            // Enhanced for loop to validate input
            for (SeatType type : validTypes) {
                if (type.name().equals(input)) {
                    return type;
                }
            }

            System.out.println("❌ Invalid seat type. Please try again.");
        }
    }

    /**
     * Ask user if they want to buy more tickets
     */
    private static boolean askToBuyMoreTickets() {
        while (true) {
            System.out.print("\nWould you like to buy another ticket? (y/n): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                return true;
            } else if (input.equals("n") || input.equals("no")) {
                return false;
            } else {
                System.out.println("❌ Please enter 'y' for yes or 'n' for no.");
            }
        }
    }

    /**
     * Calculate individual ticket price (from TicketCalculatorV2)
     */
    private static int calculateTicketPrice(int age, boolean isMember, SeatType seatType) {
        int price = calculateBasePriceByAge(age);
        price = applyMemberDiscount(price, isMember);
        price = applySeatSurcharge(price, seatType);
        price = ensureMinimumPrice(price);
        return price;
    }

    /**
     * Display ticket summary
     */
    private static void displayTicketSummary(int ticketNumber, int age, boolean isMember,
                                          SeatType seatType, int price) {
        System.out.println("\n✅ TICKET SUMMARY");
        System.out.println("Ticket #" + ticketNumber);
        System.out.println("Age: " + age + " (" + getCategoryName(age) + ")");
        System.out.println("Member: " + (isMember ? "Yes" : "No"));
        System.out.println("Seat Type: " + seatType);
        System.out.println("Price: $" + price);
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

        if (subtotal != finalPrice) {
            System.out.println("Bulk discount: $" + (subtotal - finalPrice));
        }

        System.out.println("Final Price: $" + finalPrice);

        if (numberOfTickets > 1) {
            System.out.println("Average per ticket: $" + (finalPrice / numberOfTickets));
        }

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
     * Show kiosk statistics
     */
    private static void showKioskStats() {
        System.out.println("\n📊 KIOSK STATISTICS");
        System.out.println("=" + "=".repeat(30));
        System.out.println("Total tickets sold today: " + totalTicketsSold);
        System.out.println("Total revenue today: $" + totalRevenue);

        if (totalTicketsSold > 0) {
            System.out.println("Average ticket price: $" + (totalRevenue / totalTicketsSold));
        }
    }

    /**
     * Wait for user to press Enter to continue
     */
    private static void waitForUserToContinue() {
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
    }

    // ===== METHODS FROM TICKETCALCULATORV2 =====

    /**
     * Age-based pricing with if/else chain
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
     * Member discount application
     */
    public static int applyMemberDiscount(int currentPrice, boolean isMember) {
        if (isMember && currentPrice > 0) {
            currentPrice -= 1;  // subtract $1 for members
        }
        return currentPrice;
    }

    /**
     * Seat surcharge using switch expression
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
     * Ensure minimum price validation
     */
    public static int ensureMinimumPrice(int price) {
        if (price < 0) {
            price = 0;  // price cannot be negative
        }
        return price;
    }

    /**
     * Calculate bulk discount with for loop
     */
    public static int calculateBulkDiscount(int totalPrice, int numberOfTickets) {
        int discount = 0;

        // Apply progressive bulk discount for every 5 tickets
        for (int i = 5; i <= numberOfTickets; i += 5) {
            discount += 2; // $2 discount for every group of 5 tickets
        }

        return Math.max(0, totalPrice - discount);
    }

    /**
     * Demonstrate age pricing with for loop
     */
    public static void demonstrateAgePricing() {
        System.out.println("\n👶👧🧑👴 AGE-BASED PRICING");
        int[] sampleAges = {2, 8, 15, 25, 35, 45, 55, 65, 75};

        for (int i = 0; i < sampleAges.length; i++) {
            int age = sampleAges[i];
            int basePrice = calculateBasePriceByAge(age);
            String category = getCategoryName(age);
            System.out.println("Age " + age + " (" + category + "): $" + basePrice);
        }
    }

    /**
     * Demonstrate seat pricing with enhanced for loop
     */
    public static void demonstrateSeatPricing() {
        System.out.println("\n🪑 SEAT TYPE SURCHARGES");
        SeatType[] allSeatTypes = SeatType.values();

        for (SeatType seat : allSeatTypes) {
            int surcharge = switch (seat) {
                case REGULAR -> 0;
                case PREMIUM -> 3;
                case RECLINER -> 5;
            };
            System.out.println(seat + " seat: +$" + surcharge + " surcharge");
        }
    }

    /**
     * Get category name for age groups
     */
    private static String getCategoryName(int age) {
        if (age < 3) return "Toddler";
        else if (age < 12) return "Child";
        else if (age < 60) return "Adult";
        else return "Senior";
    }
}
