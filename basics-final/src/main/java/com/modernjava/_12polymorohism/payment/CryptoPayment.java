package com.modernjava._12polymorohism.payment;

public class CryptoPayment extends Payment {
    private String walletAddress;
    public CryptoPayment(double amount, String walletAddress) {
        super(amount);
        this.walletAddress = walletAddress;
    }
    @Override
    public void pay() {
        System.out.println("Paid $" + amount + " using Crypto Wallet: " + walletAddress);
    }
}

