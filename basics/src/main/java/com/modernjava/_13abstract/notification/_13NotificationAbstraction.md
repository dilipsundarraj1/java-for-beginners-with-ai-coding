# Notification Abstraction Example

This lecture demonstrates the concept of abstraction in Java using a notification sending scenario. Each section introduces a new file and concept, allowing for incremental explanation and discussion.

---

## 1. NotificationSender.java
**Prompt:**

Create an interface named `NotificationSender` with:
- An abstract method: `void sendNotification(String message, String recipient)`
- A default method: `void logNotification(String message, String recipient)` that prints a log message.
- A static method: `boolean isValidRecipient(String recipient)` that validates the recipient string.

---

## 2. EmailNotificationSender.java
**Prompt:**

Create a class named `EmailNotificationSender` that implements `NotificationSender` and sends notifications via email.

---

## 3. SmsNotificationSender.java
**Prompt:**

Create a class named `SmsNotificationSender` that implements `NotificationSender` and sends notifications via SMS.

---

## 4. PushNotificationSender.java
**Prompt:**

Create a class named `PushNotificationSender` that implements `NotificationSender` and sends notifications via push notification.

---

## 5. NotificationType.java (Enum)
**Prompt:**

Create an enum named `NotificationType` with values for each supported notification type:
- `EMAIL`
- `SMS`
- `PUSH`

This enum provides type safety and clarity when specifying notification types in the application.

---

## 6. NotificationSenderService.java
**Prompt:**

Create a class named `NotificationSenderService` that accepts a `NotificationType` and chooses the appropriate sender based on the type of notification. Use a modern switch expression for clarity and maintainability.

- The service should have a method:
  - `void send(NotificationType type, String message, String recipient)`
- Inside this method, use a switch on `type` to select and delegate to the correct sender implementation.

---

## 7. NotificationDemo.java
**Prompt:**

Create a class named `NotificationDemo` with a `main` method that demonstrates the use of `NotificationSenderService`:
- Calls the service with each `NotificationType` and sample data.
- Shows how the abstraction and service layer simplify notification sending.

---

### Note on Interface Default and Static Methods

The `NotificationSender` interface uses both default and static methods. Default methods provide reusable logic for implementers, while static methods offer utility functions accessible without an instance.

---

Use these prompts to guide your lecture, introducing each file and concept step by step for a clear and incremental explanation of abstraction in Java, including the use of enums, service layers, and interface enhancements.

