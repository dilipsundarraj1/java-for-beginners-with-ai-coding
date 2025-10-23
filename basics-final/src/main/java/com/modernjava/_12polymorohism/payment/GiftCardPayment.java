package com.modernjava._12polymorohism.payment;

public class GiftCardPayment extends Payment {
    private String giftCardCode;
    public GiftCardPayment(double amount, String giftCardCode) {
        super(amount);
        this.giftCardCode = giftCardCode;
    }
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using Gift Card: " + giftCardCode);
    }
}

