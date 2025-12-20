# Payment Package Flow Diagram

## 1. Architecture Overview

```
┌─────────────────────────────────────────────────────────────────┐
│                     PAYMENT PACKAGE ARCHITECTURE                 │
└─────────────────────────────────────────────────────────────────┘

┌─────────────────────────────────────────────────────────────────┐
│                         USER INTERFACE LAYER                     │
│                        (ui package)                              │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │              PaymentCLI                                   │  │
│  │  - displayMenu()                                          │  │
│  │  - getPaymentType()                                       │  │
│  │  - getPaymentAmount()                                     │  │
│  │  - getPaymentDetails()                                    │  │
│  │  - start()                                                │  │
│  │  - main()                                                 │  │
│  └──────────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
                              │
                              │ uses
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                      SERVICE LAYER                               │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │           PaymentService                                 │  │
│  │  - processPayment(PaymentType, double, String)           │  │
│  │    • Delegates to PaymentFactory                         │  │
│  │    • Calls pay() on returned Payment object              │  │
│  └──────────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
                              │
                              │ uses
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                    FACTORY PATTERN LAYER                         │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │           PaymentFactory                                 │  │
│  │  - createPayment(PaymentType, double, String)            │  │
│  │    • CREDITCARD  → CreditCardPayment                     │  │
│  │    • PAYPAL      → PayPalPayment                         │  │
│  │    • GIFTCARD    → GiftCardPayment                       │  │
│  │    • DEBITCARD   → DebitCardPayment                      │  │
│  │    • CRYPTO      → CryptoPayment                         │  │
│  └──────────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
                              │
                              │ creates
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│                   CORE ABSTRACTION LAYER                         │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │  PaymentType (enum)                                       │  │
│  │  - CREDITCARD                                             │  │
│  │  - PAYPAL                                                 │  │
│  │  - GIFTCARD                                               │  │
│  │  - DEBITCARD                                              │  │
│  │  - CRYPTO                                                 │  │
│  └──────────────────────────────────────────────────────────┘  │
│                                                                   │
│  ┌──────────────────────────────────────────────────────────┐  │
│  │  Payment (abstract class)                                 │  │
│  │  - amount: double                                         │  │
│  │  - pay(): void (abstract)                                │  │
│  └──────────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────────┘
                              │
                              │ extends
                              ▼
┌─────────────────────────────────────────────────────────────────┐
│              IMPLEMENTATION LAYER (impl package)                 │
│                                                                   │
│  ┌──────────────────┐  ┌──────────────────┐  ┌──────────────┐  │
│  │CreditCardPayment │  │ PayPalPayment    │  │GiftCardPayment
│  │- cardNumber      │  │ - email          │  │- giftCardCode
│  │- pay()           │  │ - pay()          │  │- pay()       │  │
│  └──────────────────┘  └──────────────────┘  └──────────────┘  │
│                                                                   │
│  ┌──────────────────┐  ┌──────────────────┐                    │
│  │DebitCardPayment  │  │ CryptoPayment    │                    │
│  │- debitCardNumber │  │ - walletAddress  │                    │
│  │- pay()           │  │ - pay()          │                    │
│  └──────────────────┘  └──────────────────┘                    │
└─────────────────────────────────────────────────────────────────┘
```

## 2. User Interaction Flow Diagram

```
┌────────────────────────────────────────────────��────────────────┐
│                    USER INTERACTION FLOW                         │
└──────────────────���──────────────────────────────────────────────┘

                            START
                              │
                              ▼
                    ┌──────────────────┐
                    │  Display Menu    │
                    │  1. Credit Card  │
                    │  2. PayPal       │
                    │  0. Exit         │
                    └──────────────────┘
                              │
                              ▼
                    ┌──────────────────┐
              ┌─────│ Get User Choice  │─────┐
              │     └──────────────────┘     │
              │                              │
        Choice = 0?                    Choice != 0?
              │                              │
              ▼                              ▼
        ┌──────────┐              ┌───────────────────┐
        │  Exit    │              │ Validate Choice   │
        │ Program  │              │ (1-5 valid)       │
        └──────────┘              └───────────────────┘
                                        │
                          ┌─────────────┴─────────────┐
                          │                           │
                    Invalid?                     Valid?
                          │                           │
                          ▼                           ▼
                   ┌──────────────┐      ┌────────────────────┐
                   │ Show Error   │      │ Get Payment Amount  │
                   │ Try Again    │      │ (validate input)    │
                   └──────────────┘      └────────────────────┘
                          │                           │
                          └───────────────────┬───────┘
                                              ▼
                              ┌────────────────────────────┐
                              │ Get Payment Details        │
                              │ (account, email, etc)      │
                              └────────────────────────────┘
                                              │
                                              ▼
                              ┌────────────────────────────┐
                              │ Call PaymentService        │
                              │ processPayment()           │
                              └────────────────────────────┘
                                              │
                                              ▼
                              ┌────────────────────────────┐
                              │ PaymentFactory             │
                              │ createPayment()            │
                              │ (returns Payment impl)     │
                              └────────────────────────────┘
                                              │
                                              ▼
                              ┌────────────────────────────┐
                              │ Call pay() on Payment      │
                              │ (CreditCard, PayPal, etc)  │
                              └────────────────────────────┘
                                              │
                                              ▼
                              ┌────────────────────────────┐
                              │ Display Payment Result     │
                              │ "Paid $X using [method]"   │
                              └────────────────────────────┘
                                              │
                                              ▼
                                    ┌─────────────────┐
                                    │ Loop Back to    │
                                    │ Display Menu    │
                                    └─────────────────┘
```



## 3. Package Structure Tree

```
payment/
│
├── PaymentType.java (enum)
│   ├── CREDITCARD
│   ├── PAYPAL
│   ├── GIFTCARD
│   ├── DEBITCARD
│   └── CRYPTO
│
├── Payment.java (abstract class)
│   ├── amount: double
│   └── pay(): void
│
├── PaymentFactory.java
│   └── createPayment(PaymentType, double, String): Payment
│
├── PaymentService.java
│   └── processPayment(PaymentType, double, String): void
│
├── PaymentDemo.java
│   └── main(String[]): void
│
├── REFACTORING_SUMMARY.md
│
├── impl/
│   ├── CreditCardPayment.java (extends Payment)
│   ├── PayPalPayment.java (extends Payment)
│   ├── DebitCardPayment.java (extends Payment)
│   ├── GiftCardPayment.java (extends Payment)
│   └── CryptoPayment.java (extends Payment)
│
└── ui/
    └── PaymentCLI.java
        ├── displayMenu(): void
        ├── getPaymentType(int): PaymentType
        ├── getPaymentAmount(Scanner): double
        ├── getPaymentDetails(Scanner): String
        ├── start(): void
        └── main(String[]): void
```

---

## Summary

The payment package follows a **layered architecture** with clear separation of concerns:

1. **UI Layer** (`ui/`) - Handles user interaction
2. **Service Layer** - Business logic and orchestration
3. **Factory Layer** - Object creation
4. **Abstraction Layer** - Core interfaces and enums
5. **Implementation Layer** (`impl/`) - Concrete payment implementations

This design makes the system **scalable**, **maintainable**, and **testable**.

