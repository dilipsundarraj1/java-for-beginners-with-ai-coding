package com.modernjava._11inheritance.bank;

// Base class for bank accounts
public class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
            return true;
        }
        System.out.println("Withdrawal failed. Insufficient funds.");
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

