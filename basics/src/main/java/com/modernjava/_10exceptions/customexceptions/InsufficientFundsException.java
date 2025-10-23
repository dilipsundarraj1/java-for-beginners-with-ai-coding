package com.modernjava._10exceptions.customexceptions;

public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException(String message) {
        super(message);
    }

}
