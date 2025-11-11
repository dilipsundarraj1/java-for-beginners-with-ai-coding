# TicketKiosk - Interactive Ticket System Documentation

<!-- TOC -->
* [TicketKiosk - Interactive Ticket System Documentation](#ticketkiosk---interactive-ticket-system-documentation)
  * [High-Level Logical Flow](#high-level-logical-flow)
  * [Prompts for Replication](#prompts-for-replication)
    * [Prompt 1: Display Main Menu](#prompt-1-display-main-menu)
    * [Prompt 2: Get User Choice with Validation](#prompt-2-get-user-choice-with-validation)
    * [Prompt 3: Main Menu While Loop](#prompt-3-main-menu-while-loop)
    * [Prompt 4: Buy Tickets - Get Valid Age](#prompt-4-buy-tickets---get-valid-age)
    * [Prompt 5: Get Membership Status](#prompt-5-get-membership-status)
    * [Prompt 6: Get Seat Type with Validation](#prompt-6-get-seat-type-with-validation)
    * [Prompt 7: Calculate Ticket Price (Reuse from TicketCalculatorV2)](#prompt-7-calculate-ticket-price-reuse-from-ticketcalculatorv2)
    * [Prompt 8: Display Ticket Summary](#prompt-8-display-ticket-summary)
    * [Prompt 9: Ask To Buy More Tickets](#prompt-9-ask-to-buy-more-tickets)
    * [Prompt 10: Buy Tickets While Loop](#prompt-10-buy-tickets-while-loop)
    * [Prompt 11: Show Kiosk Statistics](#prompt-11-show-kiosk-statistics)
    * [Prompt 12: Process Final Order](#prompt-12-process-final-order)
    * [Prompt 13: Main Method Integration](#prompt-13-main-method-integration)
<!-- /TOC -->

## Prompts for Replication

### Prompt 1: Display Main Menu
**Task**: Create a function that displays the main menu options for the kiosk.

**Expected Function Signature**: `private static void displayMainMenu()`

**Requirements**:
- Print a formatted menu with separator lines using `"=".repeat(40)`
- Display title: "MAIN MENU"
- Display 3 options:
  - 1. 🎫 Buy Tickets
  - 2. 📊 View Kiosk Statistics
  - 3. 🚪 Exit
- Print prompt: "Please select an option (1-3): "

**Hints**:
- Use `System.out.println()` for printing
- Use `"=".repeat(n)` to create separator lines
- No return value needed

---

### Prompt 2: Get User Choice with Validation
**Task**: Create a function that gets and validates the user's menu choice using a while loop.

**Expected Function Signature**: `private static int getUserChoice()`

**Requirements**:
- Use `while (true)` loop
- Inside loop:
  - Try to parse user input as integer using `Integer.parseInt(scanner.nextLine().trim())`
  - Check if choice is between 1 and 3 (inclusive)
  - If valid: `return choice`
  - If invalid range: print "Please enter a number between 1 and 3: " and continue
- Catch `NumberFormatException` and print "Please enter a valid number: " and loop back
- The loop exits only when valid input is received

**Hints**:
- Use try/catch for exception handling
- Use `scanner.nextLine().trim()` to get and clean input
- `Integer.parseInt()` throws NumberFormatException for non-numeric input

---

### Prompt 3: Main Menu While Loop
**Task**: Create the main kiosk loop that runs the menu system until user exits.

**Expected Function Signature**: `public static void runKiosk()`

**Requirements**:
- Create boolean variable: `boolean keepRunning = true`
- Use `while (keepRunning)` loop
- Inside loop:
  - Call `displayMainMenu()`
  - Get choice using `getUserChoice()`
  - Use switch statement with cases 1, 2, 3:
    - case 1: Call `buyTickets()` (stub method for now)
    - case 2: Call `showKioskStats()` (stub method for now)
    - case 3: Set `keepRunning = false` and print "Exiting kiosk..."
    - default: Print "❌ Invalid option. Please try again."
  - After switch: if `keepRunning` is still true, call `waitForUserToContinue()` (stub method)

**Key Pattern**: This is the **main menu while loop** pattern from WhileDemo

**Hints**:
- Use switch with arrow notation: `case 1 -> ...`
- The loop continues until user chooses to exit

---

### Prompt 4: Buy Tickets - Get Valid Age
**Task**: Create a function to get and validate age input from user (0-120).

**Expected Function Signature**: `private static int getValidAge()`

**Requirements**:
- Declare `int age`
- Use `while (true)` loop
- Inside loop:
  - Print prompt: "Enter age (0-120): "
  - Try to parse input as integer
  - If age >= 0 AND age <= 120: `break` from loop
  - Else: Print "❌ Age must be between 0 and 120."
- Catch `NumberFormatException` and print "❌ Please enter a valid number."
- After loop: `return age`

**Key Pattern**: This is an **input validation while loop** pattern from WhileDemo

**Hints**:
- Use try/catch with Integer.parseInt()
- Use `break` to exit the loop when valid input received

---

### Prompt 5: Get Membership Status
**Task**: Create a function to get membership status (yes/no) from user.

**Expected Function Signature**: `private static boolean getMembershipStatus()`

**Requirements**:
- Use `while (true)` loop
- Inside loop:
  - Print prompt: "Are you a member? (y/n): "
  - Get input, trim and convert to lowercase
  - If input equals "y" or "yes": `return true`
  - Else if input equals "n" or "no": `return false`
  - Else: Print "❌ Please enter 'y' for yes or 'n' for no."

**Key Pattern**: This is a **yes/no validation while loop** pattern

**Hints**:
- Use `.trim()` to remove whitespace
- Use `.toLowerCase()` to handle case-insensitive input
- Use `.equals()` for string comparison

---

### Prompt 6: Get Seat Type with Validation
**Task**: Create a function to get and validate seat type from user (REGULAR, PREMIUM, RECLINER).

**Expected Function Signature**: `private static SeatType getSeatTypeWithValidation()`

**Requires Enum**: 
```java
enum SeatType { REGULAR, PREMIUM, RECLINER }
```

**Requirements**:
- Get all valid types: `SeatType[] validTypes = SeatType.values()`
- Use `while (true)` loop
- Display valid options using for loop:
  - Print "Select seat type ("
  - For each seat type with index i (from 0 to validTypes.length-1):
    - Print the seat type name
    - If not the last one, print ", "
  - Print "): "
- Get user input, trim and convert to uppercase
- Validate using enhanced for loop:
  - For each SeatType in validTypes:
    - If `type.name().equals(input)`: `return type`
- If no match: Print "❌ Invalid seat type. Please try again." and loop

**Key Pattern**: This is an **enum validation while loop** pattern using for loops

**Hints**:
- `SeatType.values()` returns all enum values as array
- `.name()` gets the string representation of enum value
- Use nested loops: for loop to display, then for loop to validate

---

### Prompt 7: Calculate Ticket Price (Reuse from TicketCalculatorV2)
**Task**: Create a function that calculates ticket price using the pricing pipeline.

**Expected Function Signature**: `private static int calculateTicketPrice(int age, boolean isMember, SeatType seatType)`

**Requirements**:
- Step 1: Calculate base price by age:
  - if age < 3: price = 0
  - else if age < 12: price = 8
  - else if age < 60: price = 12
  - else: price = 9

- Step 2: Apply member discount:
  - if isMember AND price > 0: price -= 1

- Step 3: Apply seat surcharge:
  - switch (seatType):
    - case REGULAR -> 0
    - case PREMIUM -> 3
    - case RECLINER -> 5
  - price += surcharge

- Step 4: Ensure minimum price:
  - if price < 0: price = 0

- Return final price

**Key Pattern**: **Function composition / Pipeline pattern** - each step builds on previous

**Hints**:
- Use if/else if/else chain for age
- Use switch expression for seat type
- Each step modifies the price variable

---

### Prompt 8: Display Ticket Summary
**Task**: Create a function to display a ticket purchase summary.

**Expected Function Signature**: `private static void displayTicketSummary(int ticketNumber, int age, boolean isMember, SeatType seatType, int price)`

**Requires Helper Method**:
- Create helper: `private static String getCategoryName(int age)`
  - if age < 3: return "Toddler"
  - else if age < 12: return "Child"
  - else if age < 60: return "Adult"
  - else: return "Senior"

**Requirements**:
- Print "✅ TICKET SUMMARY"
- Print "Ticket #" + ticketNumber
- Print "Age: " + age + " (" + getCategoryName(age) + ")"
- Print "Member: " + (isMember ? "Yes" : "No")
- Print "Seat Type: " + seatType
- Print "Price: $" + price

**Hints**:
- Use ternary operator for member display
- Call helper method to get category name

---

### Prompt 9: Ask To Buy More Tickets
**Task**: Create a function that asks user if they want to buy another ticket.

**Expected Function Signature**: `private static boolean askToBuyMoreTickets()`

**Requirements**:
- Use `while (true)` loop
- Inside loop:
  - Print prompt: "Would you like to buy another ticket? (y/n): "
  - Get input, trim and convert to lowercase
  - If input equals "y" or "yes": `return true`
  - Else if input equals "n" or "no": `return false`
  - Else: Print "❌ Please enter 'y' for yes or 'n' for no."

**Key Pattern**: This is a **yes/no confirmation while loop** pattern (same as Prompt 5)

---

### Prompt 10: Buy Tickets While Loop
**Task**: Create the main ticket purchasing loop that processes multiple tickets.

**Expected Function Signature**: `private static void buyTickets()`

**Requirements**:
- Print "🎫 TICKET PURCHASING"
- Print separator line: "=" + "=".repeat(30)
- Initialize: `boolean continueBuying = true`, `int sessionTickets = 0`, `int sessionTotal = 0`
- Use `while (continueBuying)` loop
- Inside loop:
  - Print "--- Ticket #" + (sessionTickets + 1) + " ---"
  - Call `getValidAge()` to get age
  - Call `getMembershipStatus()` to get member status
  - Call `getSeatTypeWithValidation()` to get seat type
  - Call `calculateTicketPrice(age, isMember, seatType)` to get price
  - Call `displayTicketSummary(sessionTickets + 1, age, isMember, seatType, ticketPrice)`
  - Increment: `sessionTickets++`
  - Accumulate: `sessionTotal += ticketPrice`
  - Call `askToBuyMoreTickets()` and set `continueBuying` to result
- After loop: if sessionTickets > 0, call `processFinalOrder(sessionTickets, sessionTotal)`

**Key Pattern**: This is the **ticket purchase while loop** - multiple transactions with accumulation

**Hints**:
- Use accumulators: sessionTickets and sessionTotal
- Session data only exists within this method
- Final processing happens after loop exits

---

### Prompt 11: Show Kiosk Statistics
**Task**: Create a function to display overall kiosk statistics.

**Expected Function Signature**: `private static void showKioskStats()`

**Requires Global Variables**:
```java
private static int totalTicketsSold = 0;
private static int totalRevenue = 0;
```

**Requirements**:
- Print "📊 KIOSK STATISTICS"
- Print separator line: "=" + "=".repeat(30)
- Print "Total tickets sold today: " + totalTicketsSold
- Print "Total revenue today: $" + totalRevenue
- If totalTicketsSold > 0:
  - Print "Average ticket price: $" + (totalRevenue / totalTicketsSold)

**Key Pattern**: This displays **accumulated state** from multiple sessions

**Hints**:
- These are static class variables shared across all method calls
- Updated in processFinalOrder()
- Integer division for average price

---

### Prompt 12: Process Final Order
**Task**: Create a function to process the final order, apply bulk discount, update statistics.

**Expected Function Signature**: `private static void processFinalOrder(int numberOfTickets, int subtotal)`

**Requires Method**: 
- `calculateBulkDiscount(int totalPrice, int numberOfTickets)` (from TicketCalculatorV2)
  - FOR LOOP: for (int i = 5; i <= numberOfTickets; i += 5)
    - discount += 2 (for every 5 tickets)
  - return Math.max(0, totalPrice - discount)

**Requirements**:
- Call `calculateBulkDiscount(subtotal, numberOfTickets)` to get finalPrice
- Print "🧾 ORDER SUMMARY"
- Print separator: "=" + "=".repeat(30)
- Print "Total tickets: " + numberOfTickets
- Print "Subtotal: $" + subtotal
- If subtotal != finalPrice:
  - Print "Bulk discount: $" + (subtotal - finalPrice)
- Print "Final Price: $" + finalPrice
- If numberOfTickets > 1:
  - Print "Average per ticket: $" + (finalPrice / numberOfTickets)
- Update global statistics:
  - `totalTicketsSold += numberOfTickets`
  - `totalRevenue += finalPrice`
- Print "🎉 Purchase successful! Enjoy your movie!"

**Key Pattern**: **Order processing** - applies business logic, updates global state

---

### Prompt 13: Main Method Integration
**Task**: Create a main method that initializes and runs the entire kiosk.

**Expected Function Signature**: `static void main(String[] args)`

**Requirements**:
- Print "🎬 Welcome to CineMax Ticket Kiosk! 🎬"
- Print "====================================="
- Call `runKiosk()` - this starts the main menu loop
- After runKiosk() returns (user chose to exit):
  - Print "\nThank you for using CineMax Ticket Kiosk!"
  - Print "Have a great day! 🍿"
  - Call `scanner.close()`

**Helper Methods Needed**:
- `private static void waitForUserToContinue()`
  - Print "Press Enter to continue..."
  - Call `scanner.nextLine()`

**Hints**:
- This is the entry point
- After kiosk loop ends, show goodbye message
- Always close Scanner resource

---

## How to Replicate (Step-by-Step Coding)

1. **Create the Java file**: Create a new file named `TicketKiosk.java` in the package `com.modernjava._4controlstatements`

2. **Add package and imports**:
   ```java
   package com.modernjava._4controlstatements;
   
   import java.util.Scanner;
   ```

3. **Add class and enum**:
   ```java
   public class TicketKiosk {
       enum SeatType { REGULAR, PREMIUM, RECLINER }
       
       private static Scanner scanner = new Scanner(System.in);
       private static int totalTicketsSold = 0;
       private static int totalRevenue = 0;
       
       // Methods go here
   }
   ```

4. **Code in order**:
   - Prompt 1: `displayMainMenu()`
   - Prompt 2: `getUserChoice()`
   - Prompt 3: `runKiosk()`
   - Prompt 4: `getValidAge()`
   - Prompt 5: `getMembershipStatus()`
   - Prompt 6: `getSeatTypeWithValidation()`
   - Prompt 7: `calculateTicketPrice()`
   - Prompt 8: `displayTicketSummary()` and `getCategoryName()`
   - Prompt 9: `askToBuyMoreTickets()`
   - Prompt 10: `buyTickets()`
   - Prompt 11: `showKioskStats()`
   - Prompt 12: `processFinalOrder()` and `calculateBulkDiscount()`
   - Prompt 13: `main()` and `waitForUserToContinue()`

5. **Run the program** and test all menu options

---

## Expected Output Example

```
🎬 Welcome to CineMax Ticket Kiosk! 🎬
=====================================

========================================
           MAIN MENU
========================================
1. 🎫 Buy Tickets
2. 📊 View Kiosk Statistics
3. 🚪 Exit

Please select an option (1-3): 1

🎫 TICKET PURCHASING
===============================

--- Ticket #1 ---
Enter age (0-120): 28
Are you a member? (y/n): y
Select seat type (REGULAR, PREMIUM, RECLINER): PREMIUM

✅ TICKET SUMMARY
Ticket #1
Age: 28 (Adult)
Member: Yes
Seat Type: PREMIUM
Price: $14

Would you like to buy another ticket? (y/n): n

🧾 ORDER SUMMARY
===============================
Total tickets: 1
Subtotal: $14
Final Price: $14

🎉 Purchase successful! Enjoy your movie!

Press Enter to continue...
```

---

## High-Level Logical Flow

```
┌─────────────────────────────────────────────────────────────┐
│                 TICKETKIOSK APPLICATION                    │
│                                                              │
│         WELCOME MESSAGE + START MAIN LOOP                   │
└─────────────────────────────────────────────────────────────┘
                            ↓
┌─────────────────────────────────────────────────────────────┐
│   WHILE LOOP: keepRunning = true                            │
│                                                              │
│   ┌──────────────────────────────────────────────────────┐  │
│   │ 1. DISPLAY MAIN MENU                                │  │
│   │    ├─ Option 1: Buy Tickets                         │  │
│   │    ├─ Option 2: View Kiosk Statistics               │  │
│   │    └─ Option 3: Exit                                │  │
│   └──────────────────────────────────────────────────────��  │
│                            ↓                                 │
│   ┌──────────────────────────────────────────────────────┐  │
│   │ 2. GET USER CHOICE (With Validation Loop)           │  │
│   │    WHILE input is invalid                           │  │
│   │    ├─ Try to parse as integer                       │  │
│   │    └─ Validate range (1-3)                          │  │
│   └──────────────────────────────────────────────────────┘  │
│                            ↓                                 │
│   ┌──────────────────────────────────────────────────────┐  │
│   │ 3. PROCESS CHOICE (Switch Statement)                │  │
│   │                                                       │  │
│   │    Choice 1 → buyTickets()                          │  │
│   │    ├─ WHILE continueBuying = true                   │  │
│   │    │  ├─ Get age (validate 0-120)                   │  │
│   │    │  ├─ Get membership status (y/n)                │  │
│   │    │  ├─ Get seat type (REGULAR/PREMIUM/RECLINER)  │  │
│   │    │  ├─ Calculate price through pipeline           │  │
│   │    │  ├─ Display ticket summary                     │  │
│   │    │  └─ Ask to buy more tickets                    │  │
│   │    └─ Process final order with bulk discount        │  │
│   │                                                       │  │
│   │    Choice 2 → showKioskStats()                      │  │
│   │    ├─ Show total tickets sold                       │  │
│   │    ├─ Show total revenue                            │  │
│   │    └─ Show average ticket price                     │  │
│   │                                                       │  │
│   │    Choice 3 → Exit (set keepRunning = false)        │  │
│   └──────────────────────────────────────────────────────┘  │
│                            ↓                                 │
│   ┌──────────────────────────────────────────────────────┐  │
│   │ 4. LOOP BACK or EXIT                                │  │
│   │    if (keepRunning) → Wait for user to continue     │  │
│   │    else → Exit while loop                           │  │
│   └──────────────────────────────────────────────────────┘  │
│                                                              │
└─────────────────────────────────────────────────────────────┘
                            ↓
┌─────────────────────────────────────────────────────────────┐
│         THANK YOU MESSAGE + CLOSE SCANNER                   │
└─────────────────────────────────────────────────────────────┘
```

