package com.modernjava._10exceptions.customexceptions;


public class BankAccount {
    private double balance = 100;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Balance is too low! Available: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
