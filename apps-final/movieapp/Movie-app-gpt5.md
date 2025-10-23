# MovieApp Reconstruction Prompt (GPT-5 Ready)

Use this prompt to fully recreate the Movie Ticket Kiosk project (movieapp module) inside the multi-module Gradle project `modern-java-for-beginners`. It specifies structure, build settings, domain & service layers, behavior, and tests. Avoid adding placeholder duplicates. Keep code clean and consistent.

---
## High-Level Goal
Implement a CLI-based Movie Ticket Kiosk with:
- Purchase flow (multiple tickets per session)
- Pricing engine with age, membership, seat type, and bulk discounts
- Statistics computation (tickets sold, revenue, averages, member %)
- Structured domain and service separation
- JUnit 5 tests for pricing logic
- Clear menu-driven interface

Project layout includes existing sibling modules (`basics`, `apps:calculatorapp`) but focus here is `apps:movieapp`.

---
## Root Project Settings
`settings.gradle.kts` includes:
```
rootProject.name = "modern-java-for-beginners"
include("basics")
include("apps:calculatorapp")
include("apps:movieapp")
```

Java version: 17
Build tool: Gradle Kotlin DSL

---
## Module: apps/movieapp
`build.gradle.kts`:
```
plugins {
    id("java")
    id("application")
}

group = "com.modernjava"
version = "1.0"

repositories { mavenCentral() }

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

application { mainClass.set("app.MovieTicketApp") }

tasks.test { useJUnitPlatform() }
```

---
## Package Structure
```
app/ (only entry points & orchestrator)
  MovieTicketApp.java
  MovieTicketKiosk.java
app/domain/
  SeatType.java
  Ticket.java
  PurchaseSummary.java
  PurchaseResult.java
  StatsSnapshot.java
  AgeCategoryUtil.java
app/service/
  PricingEngine.java
  PurchaseService.java
  TicketPurchaseService.java
  StatisticsService.java
app/test/java/app/
  PricingEngineTest.java
```
No duplicate classes in root `app` that shadow `app.domain` / `app.service`.

---
## Domain Layer Specs
1. `SeatType` enum: REGULAR, PREMIUM, RECLINER + `fromString(String)` (case-insensitive, returns null if invalid)
2. `Ticket`:
   - Fields: `int id (auto-increment)`, `int age`, `boolean member`, `SeatType seatType`, `int price`, `LocalDateTime purchasedAt`
   - Methods: getters, `ageCategory()` (delegates to `AgeCategoryUtil`), `formattedTimestamp()`, `toString()`
3. `PurchaseSummary`:
   - Fields: ticketCount, subtotal, discount, finalTotal
   - Immutable + getters only
4. `PurchaseResult`:
   - Fields: `List<Ticket> tickets` (unmodifiable), `PurchaseSummary summary` (nullable when not confirmed / empty), `boolean confirmed`
5. `StatsSnapshot`:
   - Fields: ticketsSold, totalRevenue, averageTicketPrice (double), memberTickets (long), memberPercentage (int whole %)
6. `AgeCategoryUtil`:
   - `getAgeCategoryName(int age)` => Toddler (<3), Child (3–11), Adult (12–59), Senior (60+)

---
## Pricing & Business Rules
Base price by age:
- age < 3: 0
- 3–11: 8
- 12–59: 12
- 60+: 9

Membership discount:
- If price > 0 and member: subtract $1

Seat surcharges (added after discount):
- REGULAR: +0
- PREMIUM: +3
- RECLINER: +5

Bulk discount per purchase session:
- Every block of 5 tickets => subtract $2 from subtotal (after individual ticket calculations). Multiple blocks allowed.

Category formatting (`determineTicketCategory` in `PricingEngine`):
- Age category: FREE / CHILD / ADULT / SENIOR
- Membership: MEMBER or REGULAR
- Seat: STANDARD (REGULAR), PREMIUM (PREMIUM), LUXURY (RECLINER)
- Tier tag: GOLD if (age 12–59 AND member AND seat != REGULAR), else SILVER if (member AND seat == PREMIUM), else BRONZE
Format example: `CHILD-MEMBER-PREMIUM (SILVER)`

---
## Service Layer Specs
1. `PricingEngine` (all static):
   - `calculateTicketPrice(int age, boolean member, SeatType seatType)` orchestrates base + member discount + seat surcharge
   - `calculateBasePriceByAge`, `applyMemberDiscount`, `applySeatSurcharge`, `ensureMinimumPrice`
   - `calculateBulkDiscount(int totalPrice, int numberOfTickets)` => subtract $2 * (count/5)
   - `getAgeCategoryName(int age)` (can mirror AgeCategoryUtil) 
   - `determineTicketCategory(int age, boolean member, SeatType seatType)` (string per rules)

2. `PurchaseService`:
   - `Ticket createTicket(age, member, seatType)`
   - `PurchaseSummary summarize(List<Ticket>)` (sum individual ticket prices, apply bulk discount)

3. `TicketPurchaseService`:
   - `PurchaseResult run(Scanner scanner, PurchaseService purchaseService)` interactive:
     - Loop: collect age (0–120), membership (y/n), seat type (valid enum)
     - Stop when user answers no to more tickets
     - If no tickets => return unconfirmed result
     - Build summary and return confirmed result (actual confirmation handled by kiosk)

4. `StatisticsService`:
   - `StatsSnapshot snapshot(List<Ticket> tickets, int totalRevenue)`
   - average = mean of ticket prices (not revenue / count, since revenue might have bulk discount) – or keep consistent with current design: use ticket prices directly.

---
## Orchestrator: MovieTicketKiosk
Responsibilities:
- Display main menu
- Delegate purchase logic to `TicketPurchaseService`
- Maintain `soldTickets` and `totalRevenue`
- Use `StatisticsService` for stats
- Show pricing info & examples
- After a confirmed purchase, immediately print:
  `Updated Stats -> Tickets Sold: X | Revenue: $Y | Avg Price: Z.ZZ | Member %: P%`

Menu:
1. Buy Tickets
2. View Pricing Information
3. View Kiosk Statistics
4. Exit

Input helpers (private):
- `readIntInRange(prompt, min, max)`
- `readYesNo(prompt)`
- `readSeatType()` (re-prompts until valid)

`showPricingInformation()` prints:
- Age-based pricing table (sample ages: 2, 8, 15, 25, 59, 60, 75)
- Seat surcharges (assuming adult base)
- Member discount + bulk discount explanation
- 3 category examples (child/member/premium, adult/regular/standard, senior/member/recliner)

`showStatistics()` uses `statisticsService.snapshot(...)` and prints summary (tickets sold, revenue, average, member %).

---
## Entry Point: MovieTicketApp
```
public class MovieTicketApp {
    public static void main(String[] args) {
        var kiosk = new MovieTicketKiosk(
            new TicketPurchaseService(),
            new StatisticsService()
        );
        kiosk.run();
    }
}
```

---
## Tests (JUnit 5)
`PricingEngineTest`:
- `testBasePriceByAge()` – asserts 0,8,12,9 for toddler/child/adult/senior
- `testMemberDiscount()` – ensures $1 reduction and non-negative
- `testSeatSurcharge()` – REGULAR=0, PREMIUM=+3, RECLINER=+5
- `testEnsureMinimumPrice()` – clamps negatives to 0
- `testBulkDiscount()` – examples for 4 (no discount), 5 (2 off), 10 (4 off)
- `testDetermineTicketCategory()` – verify prefix patterns for representative tickets

---
## Non-Functional Guidelines
- Java 17 only features (no preview required)
- Immutable domain objects where reasonable
- Avoid static mutable state except Ticket ID counter (atomic)
- All user-facing lines are concise and consistent
- No duplicate placeholder classes

---
## Edge Cases
- Age boundary values: 2,3,11,12,59,60
- Empty purchase session should not mutate state
- Cancel confirmation loses session tickets
- Bulk discount correctly stacks (10 tickets -> $4 off)
- Member discount never reduces a free ticket below 0

---
## Success Criteria
- Gradle build passes
- `:apps:movieapp:run` launches interactive kiosk
- Tests green
- After purchase, updated stats line prints
- No duplicate class definitions or ambiguous packages

---
## Optional Enhancements (Not required, do not implement here)
- Persistence layer abstraction
- Additional discount strategies (time-based, weekday)
- ConsoleIO abstraction for testable I/O
- JSON export of stats

---
## Deliverables
Generate all described source files and tests exactly in the specified paths. Ensure compilation and test success.

END OF PROMPT

