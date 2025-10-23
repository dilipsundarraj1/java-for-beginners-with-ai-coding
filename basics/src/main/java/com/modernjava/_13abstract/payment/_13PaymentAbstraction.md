# Payment Abstraction Example

This lecture demonstrates the concept of abstraction in Java using a payment processing scenario. Each section introduces a new file and concept, allowing for incremental explanation and discussion.

---

## 1. PaymentProcessor.java
**Prompt:**

Create an abstract class named `PaymentProcessor` with:
- An abstract method: `void processPayment(double amount, String details)`
- A concrete method: `void printReceipt(double amount)` that prints a receipt message.

---

## 2. CreditCardPaymentProcessor.java
**Prompt:**

Create a class named `CreditCardPaymentProcessor` that extends `PaymentProcessor` and implements the `processPayment` method to process credit card payments.

---

## 3. PaypalPaymentProcessor.java
**Prompt:**

Create a class named `PaypalPaymentProcessor` that extends `PaymentProcessor` and implements the `processPayment` method to process PayPal payments.

---

## 4. GiftCardPaymentProcessor.java
**Prompt:**

Create a class named `GiftCardPaymentProcessor` that extends `PaymentProcessor` and implements the `processPayment` method to process gift card payments.

---

## 5. AbstractionDemo.java
**Prompt:**

Create a class named `AbstractionDemo` with a `main` method that:
- Creates instances of each payment processor (`CreditCardPaymentProcessor`, `PaypalPaymentProcessor`, `GiftCardPaymentProcessor`).
- Calls their `processPayment` methods with sample data.

---

## 6. PaymentType.java (Enum)
**Prompt:**

Create an enum named `PaymentType` with values for each supported payment type:
- `CREDIT`
- `PAYPAL`
- `GIFTCARD`

This enum provides type safety and clarity when specifying payment types in the application.

---

## 7. PaymentProcessorService.java
**Prompt:**

Create a class named `PaymentProcessorService` that accepts a `PaymentType` and chooses the appropriate processor based on the type of payment. Use a modern switch expression for clarity and maintainability.

- The service should have a method:
  - `void process(PaymentType paymentType, double amount, String details)`
- Inside this method, use a switch on `paymentType` to select and delegate to the correct processor implementation.

---

## 8. PaymentProcessorServiceDemo.java
**Prompt:**

Create a class named `PaymentProcessorServiceDemo` with a `main` method that demonstrates the use of `PaymentProcessorService`:
- Calls the service with each `PaymentType` and sample data.
- Shows how the abstraction and service layer simplify payment processing.

---

### 9. Combining Payment and Notifications


- Can you create a new version of PaymentProcessorService as PaymentProcessorServiceV2 that accepts the NotificationSenderService as a constructor argument?
- Use the NotificationType also an input to the process function and forward the function call to the NotificationSenderService

### 10. PaymentProcessorServiceV2.java

Make the PaymentProcessorV2 to invoke this function sendV2 by commenting out the call to the send function in the NotificationSenderService


## 11. FraudCheck Interface and Implementation

**Prompt:**

Create an interface named `FraudCheck` with:
- A method: `boolean isFraudulent(double amount, String details)`

Implement a simple version:
- `SimpleFraudCheck` implements `FraudCheck` and returns `true` if the amount is above a certain threshold (e.g., 10,000).

---

## 12. Integrating FraudCheck with CreditCardPaymentProcessor

**Prompt:**

Update `CreditCardPaymentProcessor` to accept a `FraudCheck` instance via implements.  
- oOverride the isFraudulent method to check for fraud before processing the payment. If the transaction is fraudulent, print a message and do not process the payment.

---

## 13. Demo: FraudCheck in Action

**Prompt:**

Update `AbstractionDemo` to:
- Use `SimpleFraudCheck` with `CreditCardPaymentProcessor`.
- Show both a fraudulent and a non-fraudulent transaction.

---

### Note on Modern Switch Expressions

The `PaymentProcessorService` uses the modern Java switch expression (Java 17+) for concise and type-safe selection of payment processors. This approach improves readability and reduces errors compared to traditional switch statements.

---

Use these prompts to guide your lecture, introducing each file and concept step by step for a clear and incremental explanation of abstraction in Java, including the new enum and service-based approach.

