package com.modernjava._7regex;

import java.util.regex.Pattern;

/**
 * Real-World Regular Expression Examples
 *
 * This class demonstrates practical regex applications including:
 * - Phone number masking and formatting
 * - Credit card validation and security masking
 * - Real-world data protection scenarios
 */
public class RegexRealWorldExamples {

    public static void main(String[] args) {
        System.out.println("=== Real-World Regex Examples ===\n");

        // 1. Phone Number Masking with Regex
        maskPhoneNumbers();

        // 2. Credit Card Validation and Masking
        creditCardValidation();

    }

    /**
     * Demonstrates phone number masking and formatting using regex
     */
    private static void maskPhoneNumbers() {
        System.out.println("1. Phone Number Masking with Regex:");

        String text = "My phone numbers are 123-456-7890 and 987-654-3210";

        // Replace all phone numbers with "***-***-****"
        String hiddenPhones = text.replaceAll("\\d{3}-\\d{3}-\\d{4}", "***-***-****");
        System.out.println("Original: " + text);
        System.out.println("Hidden: " + hiddenPhones);

        // Replace with capturing groups - reformatting phone numbers
        String formattedPhones = text.replaceAll("(\\d{3})-(\\d{3})-(\\d{4})", "($1) $2-$3");
        System.out.println("Formatted: " + formattedPhones);

        // Remove extra whitespaces
        String messyText = "This   has    too     many      spaces";
        String cleanText = messyText.replaceAll("\\s+", " ");
        System.out.println("Messy: " + messyText);
        System.out.println("Clean: " + cleanText);

        System.out.println();
    }


    /**
     * Demonstrates credit card validation and masking using regex patterns
     */
    private static void creditCardValidation() {
        System.out.println("2. Credit Card Validation and Masking:");

        // Test credit card numbers
        String[] testCards = {
            "4123456789012345",        // Valid Visa
            "4123 4567 8901 2345",     // Valid Visa with spaces
            "4123-4567-8901-2345",     // Valid Visa with dashes
            "5123456789012345",        // Valid Mastercard
            "5123 4567 8901 2345",     // Valid Mastercard with spaces
            "3123456789012345",        // Invalid - not Visa or Mastercard
            "412345678901234",         // Invalid - wrong length
            "4123-4567-8901-234a"      // Invalid - contains letter
        };

        // Visa pattern: starts with 4, 16 digits total
        String visaPattern = "^4\\d{3}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$";
        Pattern visaCompiled = Pattern.compile(visaPattern);

        // Mastercard pattern: starts with 5[1-5], 16 digits total
        String mastercardPattern = "^5[1-5]\\d{2}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}$";
        Pattern mastercardCompiled = Pattern.compile(mastercardPattern);

        System.out.println("Credit Card Validation Results:");
        for (String card : testCards) {
            boolean isVisa = visaCompiled.matcher(card).matches();
            boolean isMastercard = mastercardCompiled.matcher(card).matches();

            String cardType;
            if (isVisa) {
                cardType = "Visa";
            } else if (isMastercard) {
                cardType = "Mastercard";
            } else {
                cardType = "Invalid";
            }

            System.out.printf("  %-25s: %s%n", card, cardType);
        }

        // Credit card masking for security
        System.out.println("\nCredit Card Masking:");
        String[] cardsToMask = {
            "My Visa card is 4123456789012345",
            "Payment with 5123 4567 8901 2345 (Mastercard)",
            "Cards: 4123-4567-8901-2345 and 5555-4444-3333-2222"
        };

        // Pattern to match any 16-digit credit card with optional separators
        String cardMaskPattern = "\\b\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?\\d{4}\\b";

        for (String text : cardsToMask) {
            System.out.println("Original: " + text);

            // Mask all but last 4 digits
            String masked = text.replaceAll("\\b(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})[\\s-]?(\\d{4})\\b",
                                           "****-****-****-$4");
            System.out.println("Masked:   " + masked);

            // Alternative: Show only first 4 and last 4 digits
            String partialMask = text.replaceAll("\\b(\\d{4})[\\s-]?\\d{4}[\\s-]?\\d{4}[\\s-]?(\\d{4})\\b",
                                               "$1-****-****-$2");
            System.out.println("Partial:  " + partialMask);
            System.out.println();
        }

        System.out.println();
    }

}
