

### Prompt

```

1. Have a main method with these variables:
   - int age = 34
   - boolean isMember = true  
   - String seatType = "PREMIUM"

2. Create separate functions to demonstrate different if-statement concepts:

   a) calculateBasePriceByAge(int age) - demonstrates if/else if/else chain:
      - if age < 3: price = 0 (free for toddlers)
      - else if age < 12: price = 8 (child price)
      - else if age < 60: price = 12 (adult price)
      - else: price = 9 (senior price)

   b) applyMemberDiscount(int currentPrice, boolean isMember) - demonstrates simple if with boolean:
      - if isMember && currentPrice > 0: subtract $1

   c) applyPremiumSurcharge(int currentPrice, String seatType) - demonstrates if with string comparison:
      - if "PREMIUM".equalsIgnoreCase(seatType): add $3

   d) ensureMinimumPrice(int price) - demonstrates simple validation if:
      - if price < 0: set price = 0

3. The main method should call these functions in sequence and print "Final Ticket Price: $" + price

4. Add JavaDoc comments explaining what each function demonstrates

```

### Scanner Integration

```kotlin
Create a V1 version of the TicketCalculator using Scanner class.
I just need it to get these inputs.
 int age = 34;
  boolean isMember = true;
String seatType = "PREMIUM";

Do not use while loop yet. 
```