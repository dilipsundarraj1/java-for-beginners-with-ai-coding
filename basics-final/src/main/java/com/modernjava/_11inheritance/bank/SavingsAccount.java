package com.modernjava._11inheritance.bank;

// SavingsAccount extends BankAccount and adds interest
public class SavingsAccount extends BankAccount {
    private double interestRate; // e.g., 0.03 for 3%

    // Constructor to initialize savings account with account number, initial balance, and interest rate
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Calculate and add interest to the account balance based on interest rate
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New balance: " + balance);
    }
}

