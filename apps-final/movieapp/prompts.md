# Prompt for creating the ticket kiosk app

## 1. Initial Prompt

I want to create a MovieTicketing Kiosk Where the app should do the following:
 - User should have the ability to Buy tickets, View Pricing Information, View Kiosk Statistics and Exit.
 - I want to store the tickets that were sold and total Revenue Generated in the Kiosk.
 - Users should have the ability to store multiple tickets.
 - They Should have the ability to see the ticket priciing information.

Technical Choices:

User a Ticket Class to represent the Ticket. Kiosk class to represent the Kiosk information.
Use List wherever application is dealing with multiple tickets.
Use Functions and classes to separate out the appropriate logic
Use the TickerKioskV1 as an example, But create this project under the movieapp module.


## 2. Refactoring Prompt Question 

What kind of refactoring that can be applied to this code logic to make this code look modular?

MovieTicketKiosk seems to be too big.

Do not make any code changes yet!

## 3. Refactoring Prompt Action

Can you just implement this for now ?
```
StatisticsService (computes totals, averages, member ratios)
PurchaseService (or OrderService) orchestrates multi-ticket purchase + applies discounts
```

## [Not Recommended] 4. Refactor the Structure of the project.

**Note** : Do it manually. Its easier then asking AI to do it for you.

```
1) I want to move the domain classes to 'domain' package.
2) Business Logic classes such as Service, Engine classes to the 'service' package




