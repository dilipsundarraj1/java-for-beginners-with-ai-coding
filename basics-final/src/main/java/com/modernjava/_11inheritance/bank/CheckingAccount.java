package com.modernjava._11inheritance.bank;

// CheckingAccount extends BankAccount and adds overdraft feature
public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
            return true;
        }
        System.out.println("Withdrawal failed. Exceeds overdraft limit.");
        return false;
    }
}

