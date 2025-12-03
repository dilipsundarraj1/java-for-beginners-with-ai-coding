package com.calculator.domain;

/**
 * Enum representing all available arithmetic operations
 */
public enum CalculatorOperation {
    ADD("+", "Add"),
    SUBTRACT("-", "Subtract"),
    MULTIPLY("*", "Multiply"),
    DIVIDE("/", "Divide");

    private final String symbol;
    private final String displayName;

    /**
     * Constructor for CalculatorOperation enum
     * @param symbol the mathematical symbol for this operation
     * @param displayName the user-friendly display name
     */
    CalculatorOperation(String symbol, String displayName) {
        this.symbol = symbol;
        this.displayName = displayName;
    }

    /**
     * Gets the mathematical symbol for this operation
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Gets the display name for this operation
     */
    public String getDisplayName() {
        return displayName;
    }
}


