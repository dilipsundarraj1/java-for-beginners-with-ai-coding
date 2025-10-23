<!-- TOC -->
* [Interactive Ticket Kiosk System](#interactive-ticket-kiosk-system)
  * [Single Comprehensive Prompt](#single-comprehensive-prompt)
    * [1. Class Structure](#1-class-structure)
    * [2. Main Menu System (While Loop)](#2-main-menu-system-while-loop)
    * [3. Interactive Ticket Buying](#3-interactive-ticket-buying)
    * [4. Input Validation (Critical)](#4-input-validation-critical)
    * [5. Information Display](#5-information-display)
    * [6. Integration with TicketCalculatorV2](#6-integration-with-ticketcalculatorv2)
    * [7. User Experience](#7-user-experience)
    * [8. Key While Loop Patterns to Implement](#8-key-while-loop-patterns-to-implement)
  * [Expected Behavior](#expected-behavior)
  * [Implementation Notes](#implementation-notes)
<!-- TOC -->

# Interactive Ticket Kiosk System

Create a complete interactive cinema ticket kiosk application that demonstrates while loops, menu-driven programming, and input validation.

## Single Comprehensive Prompt

**Task**: Build an interactive cinema ticket kiosk system called `TicketKiosk` that extends the functionality of `TicketCalculatorV2` with a menu-driven interface using while loops.

**Package**: `com.modernjava._4controlstatements`

**Core Requirements**:

### 1. Class Structure
- Create enum `SeatType { REGULAR, PREMIUM, RECLINER }`
- Static variables: `Scanner scanner`, `int totalTicketsSold`, `int totalRevenue`

### 2. Main Menu System (While Loop)
Create a main menu with options:
1. 🎫 Buy Tickets
2. 💰 View Pricing Information  
3. 📊 View Kiosk Statistics
4. 🚪 Exit

Use a while loop that continues until user selects exit.

### 3. Interactive Ticket Buying
- Allow users to buy multiple tickets in one session using while loops
- For each ticket, collect: age (0-120), membership status (y/n), seat type
- Validate all inputs using while loops with error handling
- Calculate individual ticket prices and show summaries
- Apply bulk discounts for multiple tickets
- Display final order summary with total price

### 4. Input Validation (Critical)
All user inputs must be validated using while loops:
- Age: numeric, range 0-120
- Membership: accept y/yes/n/no (case insensitive)
- Seat type: validate against enum values
- Menu choices: numeric, range 1-4

### 5. Information Display
- **Pricing Info**: Show age-based pricing, seat surcharges, and available discounts
- **Statistics**: Display total tickets sold and revenue for the session

### 6. Integration with TicketCalculatorV2
Copy and integrate all pricing methods from TicketCalculatorV2:
- `calculateBasePriceByAge()`
- `applyMemberDiscount()`
- `applySeatSurcharge()`
- `ensureMinimumPrice()`
- `calculateBulkDiscount()`
- `demonstrateAgePricing()`
- `demonstrateSeatPricing()`

### 7. User Experience
- Use emojis and formatted output for professional appearance
- Clear section headers with separator lines
- "Press Enter to continue" prompts between sections
- Friendly welcome and goodbye messages
- Error messages that explain what went wrong

### 8. Key While Loop Patterns to Implement
```java
// Main kiosk loop
while (keepRunning) {
    // Show menu and process choice
}

// Input validation loop
while (true) {
    // Get input, validate, break if valid, re-prompt if invalid
}

// Multi-ticket purchasing loop
while (continueBuying) {
    // Process each ticket purchase
}
```

## Expected Behavior

**Sample Interaction**:
```
🎬 Welcome to CineMax Ticket Kiosk! 🎬
=====================================

========================================
           MAIN MENU
========================================
1. 🎫 Buy Tickets
2. 💰 View Pricing Information
3. 📊 View Kiosk Statistics
4. 🚪 Exit

Please select an option (1-4): 1

🎫 TICKET PURCHASING
==============================

--- Ticket #1 ---
Enter age (0-120): 25
Are you a member? (y/n): y
Select seat type (REGULAR, PREMIUM, RECLINER): PREMIUM

✅ TICKET SUMMARY
Ticket #1
Age: 25 (Adult)
Member: Yes
Seat Type: PREMIUM
Price: $14

Would you like to buy another ticket? (y/n): n

🧾 ORDER SUMMARY
==============================
Total tickets: 1
Final Price: $14

🎉 Purchase successful! Enjoy your movie!

Press Enter to continue...
```

## Implementation Notes

- Handle all edge cases with graceful error recovery
- Use proper exception handling for numeric inputs
- Maintain session state between menu selections
- Close Scanner properly in main method
- Use switch expressions for menu handling where appropriate
- Include comprehensive comments explaining the while loop usage

Create a complete, working application that demonstrates professional-level menu-driven programming with robust input validation using while loops throughout.
