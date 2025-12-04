package com.calculator.domain;

public enum CalculatorOperation {
    ADD(1, "+", "Add"),
    SUBTRACT(2, "-", "Subtract"),
    MULTIPLY(3, "*", "Multiply"),
    DIVIDE(4, "/", "Divide");

    private final int optionNumber;
    private final String symbol;
    private final String displayName;

    CalculatorOperation(int optionNumber, String symbol, String displayName) {
        this.optionNumber = optionNumber;
        this.symbol = symbol;
        this.displayName = displayName;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Retrieves a CalculatorOperation by its option number.
     *
     * @param option the option number (1-4)
     * @return the corresponding CalculatorOperation, or null if not found
     */
    public static CalculatorOperation fromOptionNumber(int option) {
        for (CalculatorOperation op : values()) {
            if (op.optionNumber == option) {
                return op;
            }
        }
        return null;
    }
}

