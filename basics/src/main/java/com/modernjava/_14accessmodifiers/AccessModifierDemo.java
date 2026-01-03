package com.modernjava._14accessmodifiers;

// Demonstrates access to various members from other classes in the same package
public class AccessModifierDemo {
    public static void main(String[] args) {
        // Accessing public class and its members
        PublicExample pub = new PublicExample();

        // Accessing protected class and its members
        ProtectedExample prot = new ProtectedExample();

        // Accessing package-private (default) class and its members
        DefaultExample def = new DefaultExample();

        // Accessing private class and its members is not possible
        PrivateExample priv = new PrivateExample();
    }
}

