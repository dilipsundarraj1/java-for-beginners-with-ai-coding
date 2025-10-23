# PaymentPolymorphism.md

## Payment Polymorphism in Java

This file demonstrates polymorphism using a payment system. The base class `Payment` is extended by `CreditCardPayment` and `PayPalPayment`, each adding or overriding behaviors to model real-world payment features. A `PaymentService` class processes payments using the correct payment type at runtime.

## Prompts for Replication

### Prompt 1: Payment and CreditCardPayment
**Task**: Create a base class `Payment` and a subclass `CreditCardPayment` that overrides the `pay()` method to add credit card-specific logic.

**Expected Function Signature**: `class Payment`, `class CreditCardPayment extends Payment`

**Requirements**:
- Print section header: "Payment/CreditCardPayment Polymorphism Demo"
- Show payment processing and credit card-specific logic in `pay()`

### Prompt 2: PayPalPayment Subclass
**Task**: Create a subclass `PayPalPayment` that overrides the `pay()` method to add PayPal-specific logic.

**Expected Function Signature**: `class PayPalPayment extends Payment`

**Requirements**:
- Print section header: "PayPalPayment Polymorphism Demo"
- Show PayPal-specific logic in `pay()`

### Prompt 3: PaymentService Usage
**Task**: Implement a `PaymentService` that takes a `PaymentType` and processes the correct payment type using polymorphism.

**Expected Function Signature**: `class PaymentService`

**Requirements**:
- Use a method that accepts `PaymentType`, amount, and detail
- Instantiate the correct payment subclass and call `pay()`
- Demonstrate with a main method or test
