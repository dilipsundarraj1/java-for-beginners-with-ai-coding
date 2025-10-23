package com.modernjava._11inheritance.bank;

// SavingsAccount extends BankAccount and adds interest
public class SavingsAccount extends BankAccount {
    private double interestRate; // e.g., 0.03 for 3%

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New balance: " + balance);
    }
}

