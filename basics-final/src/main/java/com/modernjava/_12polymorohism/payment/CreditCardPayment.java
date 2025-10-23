package com.modernjava._12polymorohism.payment;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}

