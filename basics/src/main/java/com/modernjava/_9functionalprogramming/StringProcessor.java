package com.modernjava._9functionalprogramming;

/**
 * Helper record for demonstrating method references
 */
public record StringProcessor(String prefix) {
    public String addPrefix(String input) {
        return prefix + input;
    }
}
