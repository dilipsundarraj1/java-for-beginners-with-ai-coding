package com.modernjava._14accessmodifiers.otherpkg;

// Attempt to access package-private class and members from another package
public class DefaultAccessTest {
    static void main(String[] args) {

        System.out.println("Cannot access package-private class or members from another package.");
    }
}

