package com.modernjava._10exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RealWorldExamples {
    public static void main(String[] args) {
        System.out.println("--- Real-World Exception Handling Examples ---");
        // Example 1: File Reading
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = br.readLine();
            System.out.println("File content: " + line);
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        // Example 2: User Input Validation
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
        }
    }
}

