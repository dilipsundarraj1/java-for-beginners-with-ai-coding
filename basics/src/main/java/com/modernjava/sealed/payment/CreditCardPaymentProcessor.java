package com.modernjava.sealed.payment;

import com.modernjava._13abstract.pricingstrategy.RewardsStrategy;
//public class CreditCardPaymentProcessor extends PaymentProcessor  {
//public class CreditCardPaymentProcessor extends PaymentProcessor implements RewardsStrategy  {
public final class CreditCardPaymentProcessor extends PaymentProcessor implements RewardsStrategy {

    @Override
    public void processPayment(double amount, String details) {
        if (isFraudulent(amount, details)) {
            System.out.println("Transaction flagged as fraudulent. Payment not processed.");
            return;
        }
        var rewardDollars = calculateRewards(amount);
        System.out.println("Processing credit card payment of $" + amount + " for card: " + details);
        //printReceipt(amount);
        printReceiptWithRewards(amount, rewardDollars);
    }

    @Override
    public double calculateRewards(double basePrice) {

        return basePrice*0.02;
    }

//    @Override
    public boolean isFraudulent(double amount, String details) {
        // Simple demo logic: flag as fraudulent if amount > $10,000
        return amount > 10000;
    }
}
