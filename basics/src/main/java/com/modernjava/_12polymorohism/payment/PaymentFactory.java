package com.modernjava._12polymorohism.payment;

import com.modernjava._12polymorohism.payment.impl.*;

// Factory class that creates Payment objects based on PaymentType
public class PaymentFactory {

    // Create and return appropriate Payment object based on the payment type
    public static Payment createPayment(PaymentType type, double amount, String detail) {
        return switch (type) {
            case CREDITCARD -> new CreditCardPayment(amount, detail);
            case PAYPAL -> new PayPalPayment(amount, detail);
        };
    }
}

