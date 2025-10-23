package com.modernjava._12polymorohism.payment;

public class PaymentService {
    public void processPayment(PaymentType type, double amount, String detail) {
        Payment payment = switch (type) {
            case CREDITCARD -> new CreditCardPayment(amount, detail);
            case PAYPAL -> new PayPalPayment(amount, detail);
            case GIFTCARD -> new GiftCardPayment(amount, detail);
            case DEBITCARD -> new DebitCardPayment(amount, detail);
            case CRYPTO -> new CryptoPayment(amount, detail);
        };
        payment.pay();
    }
}
