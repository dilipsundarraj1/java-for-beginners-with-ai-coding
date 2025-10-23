package com.modernjava._13abstract.payment;

public class PaymentProcessorService {
    public void process(PaymentType paymentType, double amount, String details) {
        PaymentProcessor processor = switch (paymentType) {
            case CREDIT -> new CreditCardPaymentProcessor();
            case PAYPAL -> new PaypalPaymentProcessor();
            case GIFTCARD -> new GiftCardPaymentProcessor();
        };
        processor.processPayment(amount, details);
    }
}
