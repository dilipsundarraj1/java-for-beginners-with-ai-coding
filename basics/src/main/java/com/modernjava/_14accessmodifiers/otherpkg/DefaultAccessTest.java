package com.modernjava._14accessmodifiers.otherpkg;

// Attempt to access package-private class and members from another package
public class DefaultAccessTest {
    public static void main(String[] args) {
        // The following line will not compile because _3DefaultExample has package-private access
//         com.modernjava._14accessmodifiers.DefaultExample def = new com.modernjava._14accessmodifiers.DefaultExample();
        // System.out.println(def.defaultField); // Not accessible
        // def.defaultMethod(); // Not accessible

        System.out.println("Cannot access package-private class or members from another package.");
    }
}

