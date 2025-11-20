# MovieApp Project Structure

This module implements a CLI-based Movie Ticket Kiosk application. Below is the complete project structure for the `apps-final/movieapp` module:

```
apps-final/movieapp/
├── build.gradle.kts
├── IMPLEMENTATION_GUIDE.md
├── PROJECT_STRUCTURE.md
├── PROJECT_STRUCTURE_BENEFITS.md
├── REPLICATION_PROMPT.md
├── prompts.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── app/
│   │           ├── MovieTicketApp.java
│   │           ├── MovieTicketKiosk.java
│   │           ├── domain/
│   │           │   ├── SeatType.java
│   │           │   ├── Ticket.java
│   │           │   ├── PurchaseSummary.java
│   │           │   ├── PurchaseResult.java
│   │           │   └── StatsSnapshot.java
│   │           ├── service/
│   │           │   ├── PricingEngine.java
│   │           │   ├── TicketPurchaseService.java
│   │           │   └── StatisticsService.java
│   │           └── util/
│   │               └── AgeCategoryUtil.java
│   └── test/
│       └── java/
│           └── app/
│               └── PricingEngineTest.java
```

## Structure Overview

### Root Level
- **build.gradle.kts** - Gradle build configuration
- **IMPLEMENTATION_GUIDE.md** - Detailed implementation guide
- **PROJECT_STRUCTURE.md** - This file, describing the project structure
- **PROJECT_STRUCTURE_BENEFITS.md** - Benefits and rationale of the project structure
- **REPLICATION_PROMPT.md** - Prompt for replication and testing
- **prompts.md** - Implementation prompts and guidance

### Source Code Organization

#### **app/** - Entry Points and Orchestrators
- **MovieTicketApp.java** - Main entry point for the application
- **MovieTicketKiosk.java** - Interactive kiosk interface handling user interactions

#### **app/domain/** - Domain Model
- **SeatType.java** - Enum representing seat types (Standard, Premium, VIP)
- **Ticket.java** - Core domain object representing a single ticket
- **PurchaseSummary.java** - Aggregates ticket purchase details and pricing
- **PurchaseResult.java** - Result wrapper for purchase operations (success/failure)
- **StatsSnapshot.java** - Immutable snapshot of current statistics

#### **app/util/** - Utility Classes
- **AgeCategoryUtil.java** - Utility for age categorization and discount calculations

#### **app/service/** - Business Logic Layer
- **PricingEngine.java** - Calculates ticket prices based on seat type and age category
- **TicketPurchaseService.java** - Orchestrates the complete ticket purchase workflow with input validation, ticket creation, summarization, and confirmation
- **StatisticsService.java** - Tracks and calculates sales statistics

#### **test/java/app/** - Unit Tests
- **PricingEngineTest.java** - JUnit 5 tests for the PricingEngine service

---

## Key Components

### Pricing Logic
- Base prices vary by seat type
- Age-based discounts: Children (≤12 years) 25%, Seniors (≥60 years) 30%
- Bulk purchase considerations

### Domain Model
- Immutable domain objects for type safety
- Clean separation between value objects and services
- Result types for error handling

### Service Architecture
- Single unified TicketPurchaseService for all ticket purchase operations
- Pricing calculations isolated in PricingEngine
- Statistics tracking in StatisticsService
- Clean separation of concerns with minimal dependencies

---

## Application Flow Diagram

### Complete Ticket Purchase Flow

```mermaid
flowchart TD
    Start([User Starts App]) --> Menu["Display Main Menu<br/>1. Buy Tickets<br/>2. Pricing Info<br/>3. Statistics<br/>4. Exit"]
    Menu --> Choice{User Choice}
    
    Choice -->|Option 1| BuyFlow["buyTicketsFlow()"]
    Choice -->|Option 2| PricingFlow["showPricingInformation()"]
    Choice -->|Option 3| StatsFlow["showStatistics()"]
    Choice -->|Option 4| Exit(["Exit App"])
    
    BuyFlow --> TicketService["TicketPurchaseService.buyTicket()"]
    TicketService --> EnterDetails["Collect Ticket Details<br/>- Age<br/>- Membership<br/>- Seat Type"]
    EnterDetails --> CreateTicket["createTicket()<br/>PricingEngine.calculateTicketPrice()"]
    CreateTicket --> AddTicket["Add Ticket to List<br/>Display: ID, Price, Category"]
    AddTicket --> AddMore{Add Another?}
    
    AddMore -->|Yes| EnterDetails
    AddMore -->|No| CheckTickets{Any Tickets?}
    
    CheckTickets -->|No| NoTickets["Return Empty Result"]
    CheckTickets -->|Yes| Summarize["summarize()<br/>Calculate Subtotal<br/>Apply Bulk Discount<br/>Calculate Final Total"]
    
    Summarize --> PrintSummary["printSummary()<br/>Display Order Details"]
    PrintSummary --> Confirm{Confirm Purchase?}
    
    Confirm -->|Yes| ConfirmPurchase["Return Confirmed Result"]
    Confirm -->|No| CancelPurchase["Return Cancelled Result"]
    
    NoTickets --> BackToMenu["Return to Main Menu"]
    ConfirmPurchase --> RecordStats["statisticsService.snapshot()<br/>Update Total Revenue<br/>Update Ticket Count<br/>Calculate Member %"]
    CancelPurchase --> BackToMenu
    
    RecordStats --> DisplayStats["Display Updated Stats<br/>Tickets Sold / Revenue<br/>Average Price / Member %"]
    DisplayStats --> BackToMenu
    
    PricingFlow --> DisplayPricing["Show Age-Based Pricing<br/>Show Seat Surcharges<br/>Show Discounts<br/>Show Categories"]
    DisplayPricing --> BackToMenu
    
    StatsFlow --> ShowStats["Display Current Statistics"]
    ShowStats --> BackToMenu
    
    BackToMenu --> WaitForEnter["Wait for User Input"]
    WaitForEnter --> Menu
    
    Exit --> End(["Application Terminated"])
    
    style Start fill:#90EE90
    style End fill:#FFB6C6
    style TicketService fill:#87CEEB
    style CreateTicket fill:#87CEEB
    style Summarize fill:#87CEEB
    style RecordStats fill:#87CEEB
    style Menu fill:#FFE4B5
    style Choice fill:#FFE4B5
```

### Service Interaction Diagram

```mermaid
graph LR
    MovieTicketKiosk["MovieTicketKiosk<br/>Main Orchestrator"]
    TicketPurchaseService["TicketPurchaseService<br/>Purchase Workflow"]
    PricingEngine["PricingEngine<br/>Pricing Calculations"]
    StatisticsService["StatisticsService<br/>Stats Tracking"]
    Domain["Domain Objects<br/>Ticket, PurchaseSummary<br/>PurchaseResult"]
    
    MovieTicketKiosk -->|calls buyTicket| TicketPurchaseService
    TicketPurchaseService -->|calls calculateTicketPrice| PricingEngine
    TicketPurchaseService -->|calls calculateBulkDiscount| PricingEngine
    TicketPurchaseService -->|calls determineTicketCategory| PricingEngine
    TicketPurchaseService -->|creates/uses| Domain
    MovieTicketKiosk -->|calls snapshot| StatisticsService
    StatisticsService -->|tracks| Domain
    MovieTicketKiosk -->|calls displayStatistics| StatisticsService
    
    style MovieTicketKiosk fill:#FFE4B5
    style TicketPurchaseService fill:#87CEEB
    style PricingEngine fill:#DDA0DD
    style StatisticsService fill:#F0E68C
    style Domain fill:#90EE90
```

### Data Flow During Purchase

```mermaid
sequenceDiagram
    participant User
    participant Kiosk as MovieTicketKiosk
    participant TPS as TicketPurchaseService
    participant PE as PricingEngine
    participant Stats as StatisticsService
    
    User->>Kiosk: Select "Buy Tickets"
    Kiosk->>TPS: buyTicket(scanner)
    
    loop Add Multiple Tickets
        TPS->>User: Enter age, membership, seat type
        User->>TPS: Provide input
        TPS->>PE: calculateTicketPrice()
        PE-->>TPS: Price calculated
        TPS->>TPS: createTicket()
        TPS->>User: Display ticket added
        TPS->>User: Add another ticket?
    end
    
    TPS->>TPS: summarize()
    TPS->>PE: calculateBulkDiscount()
    PE-->>TPS: Final total with discount
    TPS->>TPS: printSummary()
    TPS->>User: Display order summary
    TPS->>User: Confirm purchase?
    User->>TPS: Confirm/Cancel
    
    alt Purchase Confirmed
        TPS-->>Kiosk: PurchaseResult(confirmed)
        Kiosk->>Stats: snapshot(tickets, amount)
        Stats-->>Kiosk: StatsSnapshot
        Kiosk->>User: Purchase confirmed + updated stats
    else Purchase Cancelled
        TPS-->>Kiosk: PurchaseResult(cancelled)
        Kiosk->>User: Purchase cancelled
    end
```

---

## Getting Started

- Refer to `IMPLEMENTATION_GUIDE.md` for detailed implementation specifications
- Check `PROJECT_STRUCTURE_BENEFITS.md` for the rationale behind this structure
- See `prompts.md` for development guidance
- Use `REPLICATION_PROMPT.md` for testing and replication scenarios
