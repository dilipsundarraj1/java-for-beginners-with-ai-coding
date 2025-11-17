<!-- TOC -->
  * [Overview](#overview)
  * [Class Descriptions](#class-descriptions)
    * [Record Classes Benefits](#record-classes-benefits)
  * [Data Model Status](#data-model-status)
* [Phase 1: Pricing Engine Implementation](#phase-1-pricing-engine-implementation)
  * [Prompt 1.1: PricingEngine - Base Price Calculation](#prompt-11-pricingengine---base-price-calculation)
  * [Prompt 1.2: PricingEngine - Member Discount and Seat Surcharge](#prompt-12-pricingengine---member-discount-and-seat-surcharge)
  * [Prompt 1.3: PricingEngine - Bulk Discount Calculation](#prompt-13-pricingengine---bulk-discount-calculation)
  * [Prompt 1.4: PricingEngine - Ticket Category Determination](#prompt-14-pricingengine---ticket-category-determination)
* [Phase 2: Pricing Information Display](#phase-2-pricing-information-display)
  * [Prompt 2.1: Display Pricing Information Menu](#prompt-21-display-pricing-information-menu)
  * [Prompt 2.2: Demonstrate Age-Based Pricing](#prompt-22-demonstrate-age-based-pricing)
  * [Prompt 2.3: Demonstrate Seat Type Surcharges](#prompt-23-demonstrate-seat-type-surcharges)
  * [Prompt 2.4: Show Pricing Examples and Category Information](#prompt-24-show-pricing-examples-and-category-information)
* [Phase 3: Exit Functionality](#phase-3-exit-functionality)
  * [Prompt 3.1: Implement Exit Option with Graceful Shutdown](#prompt-31-implement-exit-option-with-graceful-shutdown)
* [Phase 4: Ticket Kiosk - Buy Tickets Flow](#phase-4-ticket-kiosk---buy-tickets-flow)
  * [Prompt 4.1: TicketPurchaseService - Interactive Ticket Collection](#prompt-41-ticketpurchaseservice---interactive-ticket-collection)
  * [Prompt 4.2: PurchaseService - Ticket Creation and Summarization](#prompt-42-purchaseservice---ticket-creation-and-summarization)
  * [Prompt 4.3: MovieTicketKiosk - Complete Buy Tickets Flow](#prompt-43-movieticketkiosk---complete-buy-tickets-flow)
  * [Prompt 4.4: StatisticsService - Display Updated Stats After Purchase](#prompt-44-statisticsservice---display-updated-stats-after-purchase)
* [Build and Run](#build-and-run)
  * [Building the Project](#building-the-project)
  * [Running the Application](#running-the-application)
* [Testing Checklist](#testing-checklist)
<!-- TOC -->

## Overview

This updated implementation guide follows a **simplified, incremental approach**:

1. **Implement Pricing Engine** - Build the core pricing calculation logic first
2. **Implement Pricing Information** - Display pricing details to users
3. **Implement Exit Functionality** - Allow users to gracefully exit
4. **Implement Ticket Kiosk** - Complete the buy tickets flow with full integration

**Total Implementation Phases**: 4
**Total Prompts**: 12

The data model (domain layer) and presentation layer skeleton are **already implemented** and ready to use.

---

## Class Descriptions

| Class | Purpose | Type |
|-------|---------|------|
| **MovieTicketApp** | Entry point of the application. Initializes services and starts the kiosk. | Class |
| **MovieTicketKiosk** | Main user interface and menu orchestrator. Handles user interactions and routes to appropriate functions. | Class |
| **PricingEngine** | Utility class that handles all pricing calculations (base price, discounts, surcharges, ticket categories). | Final Class |
| **PurchaseService** | Service for creating tickets and generating purchase summaries with bulk discounts. | Class |
| **TicketPurchaseService** | Orchestrates the interactive ticket purchase flow, collecting user input and managing multiple tickets per session. | Class |
| **StatisticsService** | Tracks and maintains cumulative sales statistics (tickets sold, revenue, averages, member percentages). | Class |
| **SeatType** | Enum representing the three seat categories (REGULAR, PREMIUM, RECLINER) with case-insensitive parsing. | Enum |
| **Ticket** | **Record** representing a purchased ticket with auto-incrementing ID, customer details, and price. Provides compact constructor for auto-ID generation and timestamp. | Record |
| **PurchaseSummary** | **Record** holding immutable pricing breakdown (subtotal, discount, final total) for a purchase session. Auto-generates equals(), hashCode(), toString(). | Record |
| **PurchaseResult** | **Record** wrapping the result of a purchase transaction (tickets, summary, confirmation status). Includes compact constructor for unmodifiable list. | Record |
| **StatsSnapshot** | **Record** providing immutable snapshot of kiosk statistics (tickets sold, revenue, averages, member %). | Record |
| **AgeCategoryUtil** | Utility class for determining age categories (Toddler, Child, Adult, Senior) from age values. | Final Class |

### Record Classes Benefits

The domain layer uses **Java Records** (Java 17+) for data classes:
- ✅ **Immutable by default** - All fields are final
- ✅ **Auto-generated methods** - `equals()`, `hashCode()`, `toString()`, constructors
- ✅ **Compact syntax** - Less boilerplate code
- ✅ **Type safety** - Clear data contracts
- ✅ **Accessor methods** - Use field names directly (e.g., `ticket.id()` instead of `ticket.getId()`)

---

## Data Model Status

✅ **Already Implemented** - No action needed:
- `SeatType` enum with case-insensitive parsing
- `Ticket` **record** with auto-incrementing IDs and timestamp generation
- `PurchaseSummary` **record** - immutable pricing summary
- `PurchaseResult` **record** - unmodifiable purchase container
- `StatsSnapshot` **record** - immutable statistics snapshot
- `AgeCategoryUtil` utility class for age categorization
- `MovieTicketApp` entry point
- `MovieTicketKiosk` skeleton with main menu loop

---

# Phase 1: Pricing Engine Implementation

## Prompt 1.1: PricingEngine - Base Price Calculation

**Task**: Implement the first part of PricingEngine - base price calculation by age.

**File**: `apps-final/movieapp/src/main/java/app/service/PricingEngine.java`

**Expected Code Structure**: Class with static utility methods

**Requirements**:

- Create a final class named `PricingEngine`
- Add private constructor to prevent instantiation

- Add a static method `calculateBasePriceByAge(int age)` that:
  - Returns base price based on age category:
    - Age < 3: return 0 (FREE)
    - Age 3-11: return 8 (CHILD)
    - Age 12-59: return 12 (ADULT)
    - Age 60+: return 9 (SENIOR)
  - Use ternary operators or if-else statements

- Add a static method `getAgeCategoryName(int age)` that:
  - Delegates to `AgeCategoryUtil.getAgeCategoryName(age)`
  - Returns: "Toddler", "Child", "Adult", or "Senior"

**Key Points**:
- Base prices are determined solely by age
- Toddlers are free
- These prices are before any discounts or surcharges
- This is the foundation for all pricing calculations

**Test the implementation**:
```java
PricingEngine.calculateBasePriceByAge(2);   // Returns 0
PricingEngine.calculateBasePriceByAge(8);   // Returns 8
PricingEngine.calculateBasePriceByAge(30);  // Returns 12
PricingEngine.calculateBasePriceByAge(70);  // Returns 9
```

---

## Prompt 1.2: PricingEngine - Member Discount and Seat Surcharge

**Task**: Extend PricingEngine with member discount and seat surcharge methods.

**File**: `apps-final/movieapp/src/main/java/app/service/PricingEngine.java`

**Expected Code Structure**: Add two new static methods

**Requirements**:

- Add a static method `applyMemberDiscount(int price, boolean isMember)` that:
  - If isMember AND price > 0: subtract $1
  - Otherwise: return original price
  - Always use `ensureMinimumPrice()` to guarantee non-negative result
  - Examples:
    - `applyMemberDiscount(12, true)` → 11
    - `applyMemberDiscount(0, true)` → 0 (FREE stays FREE)
    - `applyMemberDiscount(12, false)` → 12

- Add a static method `applySeatSurcharge(int price, SeatType seatType)` that:
  - Adds surcharge based on seat type:
    - REGULAR: +$0
    - PREMIUM: +$3
    - RECLINER: +$5
  - Returns new price
  - Examples:
    - `applySeatSurcharge(12, SeatType.REGULAR)` → 12
    - `applySeatSurcharge(12, SeatType.PREMIUM)` → 15
    - `applySeatSurcharge(12, SeatType.RECLINER)` → 17

- Add a static method `ensureMinimumPrice(int price)` that:
  - Returns 0 if price < 0
  - Returns price if price ≥ 0
  - Examples:
    - `ensureMinimumPrice(-5)` → 0
    - `ensureMinimumPrice(10)` → 10

**Key Points**:
- Member discount only applies if price > 0
- Free tickets stay free even for members
- Seat surcharges are added AFTER member discount
- Price can never be negative

---

## Prompt 1.3: PricingEngine - Bulk Discount Calculation

**Task**: Add bulk discount calculation to PricingEngine.

**File**: `apps-final/movieapp/src/main/java/app/service/PricingEngine.java`

**Expected Code Structure**: Add two new static methods

**Requirements**:

- Add a static method `calculateBulkDiscount(int subtotal, int numberOfTickets)` that:
  - Calculates: (numberOfTickets / 5) * 2
  - For every 5 tickets, subtract $2 from subtotal
  - Returns the final total (subtotal - discount)
  - Ensure result is not negative using `ensureMinimumPrice()`
  - Examples:
    - 1-4 tickets: no discount
    - 5 tickets with subtotal $60: return $58 (discount $2)
    - 10 tickets with subtotal $120: return $116 (discount $4)
    - 15 tickets with subtotal $180: return $174 (discount $6)

- Add a static method `calculateTicketPrice(int age, boolean isMember, SeatType seatType)` that:
  - Orchestrates all pricing steps for a single ticket:
    1. Calculate base price by age
    2. Apply member discount
    3. Apply seat surcharge
    4. Ensure minimum price (0)
  - This is the main public API for single ticket pricing
  - Examples:
    - `calculateTicketPrice(8, true, SeatType.PREMIUM)` → 10 (8 - 1 + 3)
    - `calculateTicketPrice(30, false, SeatType.REGULAR)` → 12
    - `calculateTicketPrice(65, true, SeatType.RECLINER)` → 13 (9 - 1 + 5)

**Key Points**:
- Bulk discount is at purchase session level, not per ticket
- $2 off per complete block of 5 tickets
- Order: base → discount → surcharge → minimum
- `calculateTicketPrice()` is the primary public method

---

## Prompt 1.4: PricingEngine - Ticket Category Determination

**Task**: Add ticket category determination method to PricingEngine.

**File**: `apps-final/movieapp/src/main/java/app/service/PricingEngine.java`

**Expected Code Structure**: Add one static method

**Requirements**:

- Add a static method `determineTicketCategory(int age, boolean isMember, SeatType seatType)` that:
  - Returns format: "AGE_CATEGORY-MEMBERSHIP-SEAT_CATEGORY (TIER)"
  - Age category:
    - Age < 3: "TODDLER"
    - Age 3-11: "CHILD"
    - Age 12-59: "ADULT"
    - Age 60+: "SENIOR"
  - Membership:
    - isMember: "MEMBER"
    - !isMember: "REGULAR"
  - Seat category:
    - REGULAR: "STANDARD"
    - PREMIUM: "PREMIUM"
    - RECLINER: "LUXURY"
  - Tier determination:
    - GOLD: Adult (12-59) AND member AND seat ≠ REGULAR
    - SILVER: Member AND seat == PREMIUM (any age)
    - BRONZE: All others
  - Examples:
    - `determineTicketCategory(8, true, SeatType.PREMIUM)` → "CHILD-MEMBER-PREMIUM (SILVER)"
    - `determineTicketCategory(30, true, SeatType.PREMIUM)` → "ADULT-MEMBER-PREMIUM (GOLD)"
    - `determineTicketCategory(30, false, SeatType.REGULAR)` → "ADULT-REGULAR-STANDARD (BRONZE)"

**Key Points**:
- Tier classification helps identify high-value customers
- GOLD = premium adult members
- SILVER = members with premium seats
- BRONZE = everyone else

---

# Phase 2: Pricing Information Display

## Prompt 2.1: Display Pricing Information Menu

**Task**: Implement the pricing information display method in MovieTicketKiosk.

**File**: `apps-final/movieapp/src/main/java/app/MovieTicketKiosk.java`

**Expected Code Structure**: Add one main method and helper methods

**Requirements**:

- Implement the method `showPricingInformation()` to:
  - Print: "\n=== Pricing Information ==="
  - Call `demonstrateAgePricing()` to show age-based prices
  - Call `demonstrateSeatPricing()` to show seat surcharges
  - Print: "Member Discount: $1 off base price (not below $0)"
  - Print: "Bulk Discount: $2 off for every 5 tickets in a single order."
  - Print: "\nCategory Examples:"
  - Show 3 example categories using `PricingEngine.determineTicketCategory()`:
    - Child member with premium seat
    - Adult non-member with regular seat
    - Senior member with recliner seat

**Key Points**:
- This method orchestrates all pricing displays
- Uses PricingEngine methods (which will be implemented in Phase 3)
- Provides comprehensive pricing information to users

---

## Prompt 2.2: Demonstrate Age-Based Pricing

**Task**: Implement age-based pricing demonstration.

**File**: `apps-final/movieapp/src/main/java/app/MovieTicketKiosk.java`

**Expected Code Structure**: Add one private helper method

**Requirements**:

- Add a method `demonstrateAgePricing()` that:
  - Prints: "Age-based pricing:"
  - Tests ages that cover all pricing tiers: {2, 8, 15, 25, 59, 60, 75}
  - For each age:
    - Calculate base price using `PricingEngine.calculateBasePriceByAge()`
    - Get age category using `PricingEngine.getAgeCategoryName()`
    - Print: "Age [age] ([category]): [FREE or $price]"
    - Example output: "Age 2 (Toddler): FREE"
    - Example output: "Age 8 (Child): $8"

**Key Points**:
- Demonstrates all pricing tiers
- Test ages cover boundary conditions
- Price display shows "FREE" for $0, "$X" otherwise

---

## Prompt 2.3: Demonstrate Seat Type Surcharges

**Task**: Implement seat type surcharge demonstration.

**File**: `apps-final/movieapp/src/main/java/app/MovieTicketKiosk.java`

**Expected Code Structure**: Add one private helper method

**Requirements**:

- Add a method `demonstrateSeatPricing()` that:
  - Prints: "\nSeat surcharges:"
  - Iterates through all `SeatType.values()`
  - For each seat type:
    - Use adult base price (age 30) as reference: use `PricingEngine.calculateBasePriceByAge(30)`
    - Apply surcharge using `PricingEngine.applySeatSurcharge()`
    - Print: "[SeatType] seat -> $[price] (including surcharge)"
    - Example: "REGULAR seat -> $12 (including surcharge)"
    - Example: "PREMIUM seat -> $15 (including surcharge)"

**Key Points**:
- Uses PricingEngine methods to calculate surcharges
- Reference price is adult base ($12)
- Shows the final price including surcharge

---

## Prompt 2.4: Show Pricing Examples and Category Information

**Task**: Implement pricing example display with category information.

**File**: `apps-final/movieapp/src/main/java/app/MovieTicketKiosk.java`

**Expected Code Structure**: Already included in Prompt 2.1 method

**Requirements**:

- In the `showPricingInformation()` method, after displaying discount information:
  - Print examples using `PricingEngine.determineTicketCategory()`:
    - Example 1: `determineTicketCategory(8, true, SeatType.PREMIUM)` → "CHILD-MEMBER-PREMIUM (SILVER)"
    - Example 2: `determineTicketCategory(30, false, SeatType.REGULAR)` → "ADULT-REGULAR-STANDARD (BRONZE)"
    - Example 3: `determineTicketCategory(65, true, SeatType.RECLINER)` → "SENIOR-MEMBER-LUXURY (SILVER)"

**Key Points**:
- Shows category classification system
- Examples cover different tier levels (GOLD, SILVER, BRONZE)
- Helps users understand pricing structure

---

# Phase 3: Exit Functionality

## Prompt 3.1: Implement Exit Option with Graceful Shutdown

**Task**: Implement the exit functionality in the main menu loop.

**File**: `apps-final/movieapp/src/main/java/app/MovieTicketKiosk.java`

**Expected Code Structure**: Already implemented in run() method

**Requirements**:

- In the `run()` method switch statement:
  - Option 4 → Set `keepRunning = false` and print "Exiting kiosk... Goodbye!"
  - The loop exits after this
  - No `waitForEnter()` is called (exit immediately)

- The `run()` method loop structure should be:
  ```java
  boolean keepRunning = true;
  while (keepRunning) {
      showMainMenu();
      int choice = readIntInRange("Select option (1-4): ", 1, 4);
      
      switch (choice) {
          case 1 -> buyTicketsFlow();
          case 2 -> showPricingInformation();
          case 3 -> showStatisticsDummy();
          case 4 -> {
              keepRunning = false;
              System.out.println("Exiting kiosk... Goodbye!");
          }
      }
      
      if (keepRunning) waitForEnter();
  }
  ```

**Key Points**:
- Exit is graceful - prints goodbye message
- No `waitForEnter()` on exit
- Loop exits cleanly

---

# Phase 4: Ticket Kiosk - Buy Tickets Flow

## Prompt 4.1: TicketPurchaseService - Interactive Ticket Collection

**Task**: Implement TicketPurchaseService to handle interactive ticket purchase flow.

**File**: `apps-final/movieapp/src/main/java/app/service/TicketPurchaseService.java`

**Expected Code Structure**: Class with interactive user input methods

**Requirements**:

- Create a class named `TicketPurchaseService`
- Add field: `private PurchaseService purchaseService = new PurchaseService()`

- Add a method `run(Scanner scanner)` that:
  - Orchestrates the interactive purchase flow:
    - Loop until user answers "no" to "Add another ticket?"
    - In each iteration:
      - Use `readIntInRange()` to prompt for age (0-120)
      - Use `readYesNo()` to prompt for membership
      - Use `readSeatType()` to prompt for seat type
      - Call `purchaseService.createTicket()` to create ticket
      - Add to list
      - Print: "Ticket added: ID [id], Price $[price], Category: [category]"
    - When loop exits (user says no):
      - If no tickets: return unconfirmed empty result
      - Otherwise: call `purchaseService.summarize()` and return confirmed result
  - Returns `PurchaseResult` with:
    - List of created tickets
    - Purchase summary (null if empty, or calculated summary)
    - Confirmation status (false if empty, true if has tickets)

- Inherit/Add input validation helpers:
  - `readIntInRange(Scanner scanner, String prompt, int min, int max)`
  - `readYesNo(Scanner scanner, String prompt)`
  - `readSeatType(Scanner scanner)`

**Key Points**:
- Input validation is critical
- Each ticket is immediately added to the list with feedback
- Empty purchases return unconfirmed results
- Summary is calculated only if tickets exist

---

## Prompt 4.2: PurchaseService - Ticket Creation and Summarization

**Task**: Implement PurchaseService for ticket creation and purchase summarization.

**File**: `apps-final/movieapp/src/main/java/app/service/PurchaseService.java`

**Expected Code Structure**: Class with ticket creation and summary methods

**Requirements**:

- Create a class named `PurchaseService`

- Add a method `createTicket(int age, boolean isMember, SeatType seatType)` that:
  - Calculates ticket price using `PricingEngine.calculateTicketPrice()`
  - Creates and returns new `Ticket(age, isMember, seatType, price)`

- Add a method `summarize(List<Ticket> tickets)` that:
  - Calculates subtotal: sum of all ticket prices
  - Calculates final total using `PricingEngine.calculateBulkDiscount()`
  - Calculates discount: subtotal - finalTotal
  - Returns new `PurchaseSummary(ticketCount, subtotal, discount, finalTotal)`

**Key Points**:
- PurchaseService is stateless
- Delegates pricing to PricingEngine
- Summarization applies bulk discount at session level

---

## Prompt 4.3: MovieTicketKiosk - Complete Buy Tickets Flow

**Task**: Replace the dummy buyTicketsFlow with complete implementation.

**File**: `apps-final/movieapp/src/main/java/app/MovieTicketKiosk.java`

**Expected Code Structure**: Replace dummy method with full implementation

**Requirements**:

- Replace `buyTicketsFlowDummy()` with `buyTicketsFlow()` that:
  - Calls `ticketPurchaseService.run(scanner)` to get PurchaseResult
  - Displays order summary (already handled by TicketPurchaseService)
  - Asks for confirmation: "Confirm purchase? (y/n): "
  - If confirmed:
    - Calls `statisticsService.snapshot(tickets, finalTotal)` to record purchase
    - Prints: "Purchase completed. Enjoy the show!"
    - Prints updated stats: "Updated Stats -> Tickets Sold: [X] | Revenue: $[Y] | Avg Price: $[Z.ZZ] | Member %: [P]%"
  - If not confirmed:
    - Prints: "Purchase cancelled."

**Key Points**:
- TicketPurchaseService handles most of the flow
- Kiosk handles confirmation and stats recording
- Stats are updated immediately upon confirmation

---

## Prompt 4.4: StatisticsService - Display Updated Stats After Purchase

**Task**: Implement StatisticsService to track and display statistics.

**File**: `apps-final/movieapp/src/main/java/app/service/StatisticsService.java`

**Expected Code Structure**: Service class with statistics tracking

**Requirements**:

- Create a class named `StatisticsService`
- Add fields:
  - `private List<Ticket> soldTickets = new ArrayList<>()`
  - `private int totalRevenue = 0`

- Add a method `snapshot(List<Ticket> sessionTickets, int purchaseAmount)` that:
  - Adds sessionTickets to soldTickets
  - Adds purchaseAmount to totalRevenue
  - Calculates:
    - ticketsSold: total count
    - totalRevenue: cumulative
    - averageTicketPrice: totalRevenue / ticketsSold (as double)
    - memberTickets: count where isMember() is true
    - memberPercentage: (memberTickets / ticketsSold) * 100 (as integer)
  - Returns new `StatsSnapshot(ticketsSold, totalRevenue, averageTicketPrice, memberTickets, memberPercentage)`

- Add a method `getSnapshot()` that:
  - Calculates current statistics without recording new purchases
  - Used for displaying stats without modifying state

- Add a method `displayStatistics()` that:
  - Calls `getSnapshot()` to get current statistics
  - Prints: "=== Kiosk Statistics ==="
  - Prints: "Tickets sold: [count]"
  - Prints: "Total revenue: $[amount]"
  - If tickets exist:
    - Prints: "Average ticket price: $[price]"
    - Prints: "Member tickets: [count] ([percentage]%)"
  - Else:
    - Prints: "No tickets sold yet."

**Key Points**:
- StatisticsService maintains cumulative state
- `snapshot()` both updates state and returns snapshot
- `displayStatistics()` displays without affecting state
- Member percentage should be integer (0-100)

---

# Build and Run

## Building the Project

```bash
cd /Users/Z001QGD/Dilip/code-with-dilip/java-for-beginners-with-ai-coding

# Build the movieapp module
./gradlew :apps-final:movieapp:build

# Or build everything
./gradlew build
```

## Running the Application

```bash
# Run the application
./gradlew :apps-final:movieapp:run

# Or from the distribution
cd apps-final/movieapp/build/distributions
./movieapp
```

---

# Testing Checklist

**Phase 1 - Pricing Engine**:
- [ ] Base prices correct for all age tiers
- [ ] Member discount applies correctly
- [ ] Seat surcharges correct
- [ ] Bulk discounts calculated properly
- [ ] Ticket categories formatted correctly

**Phase 2 - Pricing Information**:
- [ ] Option 2 displays pricing information
- [ ] Age-based pricing shows all 7 test ages
- [ ] Seat surcharges display correctly
- [ ] Category examples display

**Phase 3 - Exit Functionality**:
- [ ] Exit prints goodbye message
- [ ] Application terminates cleanly
- [ ] No error messages

**Phase 4 - Ticket Kiosk**:
- [ ] Can add multiple tickets
- [ ] Summary displays correctly
- [ ] Can confirm purchase
- [ ] Can cancel purchase
- [ ] Statistics update after purchase
- [ ] Statistics display correctly

**Full Integration Test**:
- [ ] Buy multiple tickets with various combinations
- [ ] View pricing information
- [ ] Purchase and confirm
- [ ] Statistics accumulate across multiple purchases
- [ ] Exit gracefully
