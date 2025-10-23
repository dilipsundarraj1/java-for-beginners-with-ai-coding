package com.modernjava._10exceptions.customexceptions;



public class CustomExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Custom Exception Demo ---");
        try {
            checkUser("guest");
        } catch (InvalidUserException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
    }

    static void checkUser(String username) throws InvalidUserException {
        if ("guest".equals(username)) {
            throw new InvalidUserException("Guest users are not allowed.");
        }
        System.out.println("Welcome, " + username);
    }
}

