package com.modernjava._13abstract.payment;

public interface FraudCheck {
    boolean isFraudulent(double amount, String details);
}

