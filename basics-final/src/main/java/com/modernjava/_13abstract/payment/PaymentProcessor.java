package com.modernjava._13abstract.payment;

//public abstract class PaymentProcessor {
abstract class PaymentProcessor {
    public abstract void processPayment(double amount, String details);

    public void printReceipt(double amount) {
        System.out.println("Payment of $" + amount + " processed successfully.");
    }

    public void printReceiptWithRewards(double amount, double rewards) {
        System.out.println("Payment of $" + amount + " processed successfully, reward dollar earned is $" + rewards);
    }
}

