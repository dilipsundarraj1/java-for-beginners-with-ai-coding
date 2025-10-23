package com.modernjava._14accessmodifiers.otherpkg;

import com.modernjava._14accessmodifiers.ProtectedExample;

// Subclass in a different package to test protected access
public class ProtectedAccessTest extends ProtectedExample {
    public void testProtectedAccess() {
        // Accessing protected field and method from subclass in different package
        System.out.println(protectedField); // Should print: I am protected!
        protectedMethod(); // Should print: Protected method called
    }

    public static void main(String[] args) {

        // Failing scenario: Attempt to access protected members via instance from another package
        ProtectedExample example = new ProtectedExample();
        // The following lines will not compile:
        // System.out.println(example.protectedField); // Error: protectedField has protected access
        // example.protectedMethod(); // Error: protectedMethod() has protected access
        System.out.println("Cannot access protected members via instance from another package.");

        ProtectedAccessTest test = new ProtectedAccessTest();
        test.testProtectedAccess();

    }
}
