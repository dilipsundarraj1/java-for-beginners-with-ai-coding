package com.modernjava._14accessmodifiers;

// Private member example
public class PrivateExample {
    private String privateField = "I am private!";

    private void privateMethod() {
        System.out.println("Private method called");
    }

    // Method to show access to private members within the class
    public void showPrivateAccess() {
        System.out.println(privateField);
        privateMethod();
    }
}

