# Movie Ticket Kiosk Application - Replication Prompt

Create a Java console application for a movie ticket kiosk with the following specifications:

## Project Structure
```
apps/movieapp/
├── build.gradle.kts (Java + Application plugin, JUnit 5, main class: app.MovieTicketApp)
└── src/
    ├── main/java/app/
    │   ├── MovieTicketApp.java (entry point)
    │   ├── MovieTicketKiosk.java (interactive menu system)
    │   ├── domain/
    │   │   ├── Ticket.java (immutable with auto-increment ID, age, member, seatType, price, timestamp)
    │   │   ├── SeatType.java (enum: REGULAR, PREMIUM, RECLINER)
    │   │   ├── PurchaseSummary.java (immutable: ticketCount, subtotal, discount, finalTotal)
    │   │   ├── PurchaseResult.java (immutable: tickets list, summary)
    │   │   ├── StatsSnapshot.java (immutable: totalTickets, totalRevenue, averagePrice)
    │   │   └── AgeCategoryUtil.java (static methods for age categorization)
    │   └── service/
    │       ├── PricingEngine.java (static pricing calculations)
    │       ├── TicketPurchaseService.java (manages purchase sessions)
    │       ├── PurchaseService.java (creates tickets)
    │       └── StatisticsService.java (computes stats)
    └── test/java/app/
        └── PricingEngineTest.java (comprehensive unit tests)
```

## Core Features

### 1. Interactive Menu System
- Main menu: Buy tickets, View pricing, View statistics, Exit
- Multi-ticket purchase sessions with cart functionality
- Input validation with re-prompting
- Graceful error handling

### 2. Pricing Logic (PricingEngine)
- **Base prices by age**: Under 3 = $0, 3-11 = $8, 12-59 = $12, 60+ = $9
- **Member discount**: $1 off (if price > $0)
- **Seat surcharges**: Regular +$0, Premium +$3, Recliner +$5
- **Bulk discount**: $2 off total for every 5 tickets
- **Minimum price**: $0 (never negative)

### 3. Domain Objects
- **Ticket**: Auto-incrementing ID, immutable fields, timestamp
- **SeatType**: Enum with fromString() validation
- **PurchaseSummary**: Breakdown of costs and discounts
- **PurchaseResult**: Contains tickets list and summary
- **StatsSnapshot**: Current kiosk statistics

### 4. Services Layer
- **TicketPurchaseService**: Session management, cart operations
- **PurchaseService**: Ticket creation using PricingEngine
- **StatisticsService**: Revenue and ticket analytics
- **PricingEngine**: Pure static pricing functions

### 5. Key Requirements
- Immutable domain objects (unmodifiable collections)
- Defensive programming (input validation, null checks)
- Clean separation of concerns (UI, domain, services)
- Comprehensive test coverage for pricing logic
- Thread-safe ticket ID generation (AtomicInteger)
- Category determination for tickets (age + membership + seat combinations)

### 6. User Experience
- Emoji-enhanced welcome messages
- Clear pricing breakdowns
- Session-based purchasing (add multiple tickets, then finalize)
- Statistics display (total tickets, revenue, average price)
- Graceful exit handling

### 7. Technical Details
- Java application with Scanner input
- JUnit 5 for testing
- Gradle build with application plugin
- Package structure: app, app.domain, app.service
- Static utility methods for reusable logic
- Proper encapsulation and immutability patterns

Create a fully functional movie ticket kiosk that demonstrates clean architecture, proper OOP principles, and comprehensive business logic handling.
