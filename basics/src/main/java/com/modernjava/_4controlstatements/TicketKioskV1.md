# TicketKioskV1.java - Interactive Ticket Kiosk with Ternary Operators

## Overview
TicketKioskV1 is an enhanced version of the original TicketKiosk that demonstrates extensive use of ternary operators for conditional logic, categorization, and decision-making throughout the application. This version introduces a comprehensive ticket categorization system while showcasing how ternary operators can replace traditional if-else statements for more concise code.

## Key Features

### 1. **Ticket Categorization System**
- Multi-dimensional categorization based on age, membership, and seat type
- Category levels (BRONZE, SILVER, GOLD) determined by combinations
- Format: `AGE-MEMBERSHIP-SEAT (LEVEL)`
- Example: `ADULT-MEMBER-PREMIUM (GOLD)`

### 2. **Ternary Operator Integration**
- Replaces traditional if-else statements throughout the application
- Demonstrates various ternary patterns: simple, chained, and nested
- Used in validation, calculation, formatting, and display logic

### 3. **Enhanced User Experience**
- Performance indicators based on sales volume
- Detailed category examples and explanations
- Member discount notifications and suggestions

## Code Structure Analysis

### **Main Application Flow**
```java
public static void main(String[] args) {
    System.out.println("🎬 Welcome to CineMax Ticket Kiosk V1! 🎬");
    runKiosk();
    System.out.println("Have a great day! 🍿");
}
```

The main method serves as the entry point, providing welcome messages and calling the core kiosk functionality.

### **Core Menu System**
```java
public static void runKiosk() {
    boolean keepRunning = true;
    
    while (keepRunning) {
        displayMainMenu();
        int choice = getUserChoice();
        
        switch (choice) {
            case 1 -> buyTickets();
            case 2 -> showPricingInfo();
            case 3 -> showKioskStats();
            case 4 -> { keepRunning = false; }
            default -> System.out.println("❌ Invalid option.");
        }
        
        if (keepRunning) waitForUserToContinue();
    }
}
```

Uses a while loop for continuous operation with switch expressions for menu handling.

## Ternary Operator Implementations

### **1. Input Validation with Ternary Operators**

#### Menu Choice Validation
```java
private static int getUserChoice() {
    while (true) {
        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            return (choice >= 1 && choice <= 4) ? choice : -1; // Ternary validation
        } catch (NumberFormatException e) {
            System.out.print("Please enter a valid number: ");
        }
    }
}
```

#### Age Validation
```java
private static int getValidAge() {
    // ...existing code...
    boolean isValidAge = (age >= 0 && age <= 120); // Ternary condition
    if (isValidAge) {
        break;
    }
    // ...existing code...
}
```

#### Membership Status with Recursive Ternary
```java
private static boolean getMembershipStatus() {
    while (true) {
        String input = scanner.nextLine().trim().toLowerCase();
        
        boolean isYes = input.equals("y") || input.equals("yes");
        boolean isNo = input.equals("n") || input.equals("no");
        
        return isYes ? true : 
               isNo ? false : 
               getMembershipStatus(); // Recursive call for invalid input
    }
}
```

### **2. Ticket Categorization Logic**

#### Complex Category Determination
```java
private static String determineTicketCategory(int age, boolean isMember, SeatType seatType) {
    // Age category using chained ternary operators
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
    
    return String.format("%s-%s-%s (%s)", ageCategory, membershipStatus, seatCategory, categoryLevel);
}
```

### **3. Pricing Logic with Ternary Operators**

#### Age-Based Pricing
```java
public static int calculateBasePriceByAge(int age) {
    return age < 3 ? 0 :          // free for toddlers
           age < 12 ? 8 :         // child price
           age < 60 ? 12 :        // adult price
           9;                     // senior price
}
```

#### Member Discount Application
```java
public static int applyMemberDiscount(int currentPrice, boolean isMember) {
    return (isMember && currentPrice > 0) ? currentPrice - 1 : currentPrice;
}
```

#### Seat Surcharge Calculation
```java
public static int applySeatSurcharge(int currentPrice, SeatType seatType) {
    int surcharge = seatType == SeatType.REGULAR ? 0 :
                   seatType == SeatType.PREMIUM ? 3 :
                   5; // RECLINER
    return currentPrice + surcharge;
}
```

### **4. Display Logic with Ternary Operators**

#### Ticket Summary Display
```java
private static void displayTicketSummary(int ticketNumber, int age, boolean isMember, 
                                      SeatType seatType, int price, String category) {
    // ...existing code...
    System.out.println("Member: " + (isMember ? "Yes" : "No")); // Simple ternary
    
    // Discount indicator using ternary operator
    String discountInfo = isMember ? "✅ Member discount applied" : "💡 Become a member to save $1";
    System.out.println(discountInfo);
}
```

#### Order Summary with Conditional Display
```java
private static void processFinalOrder(int numberOfTickets, int subtotal) {
    int finalPrice = calculateBulkDiscount(subtotal, numberOfTickets);
    
    // Ternary operator for discount display
    String discountText = (subtotal != finalPrice) ? 
        ("Bulk discount: $" + (subtotal - finalPrice)) : 
        "No bulk discount applied";
    System.out.println(discountText);
    
    // Ternary operator for average calculation
    String averageInfo = (numberOfTickets > 1) ? 
        ("Average per ticket: $" + (finalPrice / numberOfTickets)) : 
        "Single ticket purchase";
    System.out.println(averageInfo);
}
```

### **5. Statistics with Performance Indicators**

#### Dynamic Performance Indicators
```java
private static void showKioskStats() {
    // ...existing code...
    
    // Ternary operator for average calculation display
    String averageDisplay = (totalTicketsSold > 0) ? 
        ("Average ticket price: $" + (totalRevenue / totalTicketsSold)) : 
        "No tickets sold yet today";
    System.out.println(averageDisplay);
    
    // Performance indicator using chained ternary operators
    String performanceIndicator = totalRevenue > 100 ? "🔥 Great sales day!" :
                                totalRevenue > 50 ? "📈 Good progress!" :
                                totalRevenue > 0 ? "🌱 Getting started!" :
                                "💤 Awaiting first sale...";
    System.out.println("Status: " + performanceIndicator);
}
```

## Ternary Operator Patterns Demonstrated

### **1. Simple Ternary**
```java
// Basic true/false evaluation
boolean result = condition ? trueValue : falseValue;

// Examples from code:
String memberStatus = isMember ? "Yes" : "No";
int minPrice = price < 0 ? 0 : price;
```

### **2. Chained Ternary**
```java
// Multiple conditions in sequence
String result = condition1 ? value1 : 
               condition2 ? value2 : 
               condition3 ? value3 : 
               defaultValue;

// Examples from code:
String ageCategory = age < 3 ? "FREE" : 
                   age < 12 ? "CHILD" : 
                   age >= 60 ? "SENIOR" : "ADULT";
```

### **3. Nested Ternary**
```java
// Complex conditional logic
String result = outerCondition ? 
    (innerCondition ? value1 : value2) : 
    (anotherCondition ? value3 : value4);

// Examples from code:
String categoryLevel = isPremiumCategory ? "GOLD" : 
                     (isMember && seatType == SeatType.PREMIUM) ? "SILVER" : 
                     "BRONZE";
```

### **4. Ternary in Method Calls**
```java
// Using ternary results directly in method parameters
System.out.println("Status: " + (isActive ? "Active" : "Inactive"));
methodCall(condition ? param1 : param2);

// Examples from code:
return askToBuyMoreTickets(); // Recursive ternary call
```

## Category System Logic

### **Category Components**
1. **Age Category**: FREE, CHILD, ADULT, SENIOR
2. **Membership Status**: MEMBER, REGULAR  
3. **Seat Category**: STANDARD, PREMIUM, LUXURY
4. **Level**: BRONZE, SILVER, GOLD

### **Category Level Determination**
- **GOLD**: Adults (12-59) with membership and non-regular seats
- **SILVER**: Members with premium seats
- **BRONZE**: All other combinations

### **Example Categories**
- `CHILD-MEMBER-PREMIUM (SILVER)`: 8-year-old member with premium seat
- `ADULT-REGULAR-STANDARD (BRONZE)`: 25-year-old non-member with regular seat
- `SENIOR-MEMBER-LUXURY (GOLD)`: 65-year-old member with recliner seat

## Educational Value

### **Ternary Operator Benefits**
1. **Conciseness**: Reduces verbose if-else statements
2. **Readability**: Clear conditional expressions for simple logic
3. **Functional Style**: Enables more functional programming patterns
4. **Performance**: Slightly more efficient than if-else in some cases

### **When to Use Ternary Operators**
- ✅ Simple true/false conditions
- ✅ Value assignment based on conditions
- ✅ Method parameter selection
- ✅ Display text formatting

### **When to Avoid Ternary Operators**
- ❌ Complex logic requiring multiple statements
- ❌ Deeply nested conditions (readability issues)
- ❌ When if-else would be clearer
- ❌ Side effects or complex operations

## Running the Application

### **Menu Options**
1. **Buy Tickets**: Interactive multi-ticket purchasing with categorization
2. **View Pricing**: Complete pricing breakdown with examples
3. **View Statistics**: Sales performance with dynamic indicators
4. **Exit**: Graceful application termination

### **Sample Interaction Flow**
1. User selects "Buy Tickets"
2. Enters age, membership status, seat type
3. System calculates price and determines category using ternary operators
4. Displays detailed ticket summary with category information
5. Offers additional ticket purchases
6. Processes final order with bulk discounts

## Code Quality Features

### **Error Handling**
- Input validation with ternary operators for quick checks
- Graceful handling of invalid input with recursive calls
- Exception handling for numeric input parsing

### **User Experience**
- Clear visual formatting with emojis and separators
- Helpful suggestions (membership benefits, etc.)
- Performance feedback and encouragement

### **Maintainability**
- Consistent use of ternary operators throughout
- Clear method naming and documentation
- Modular design with focused responsibilities

This implementation demonstrates how ternary operators can be effectively integrated throughout an application while maintaining code clarity and functionality, providing an excellent example of conditional logic patterns in Java.
