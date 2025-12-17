package com.modernjava._10exceptions;

import java.io.IOException;
import java.util.Scanner;

public class _3CheckedVsUnchecked {
    static void main(String[] args) {
        demoUncheckedException();
        demoCheckedException();
    }

    static void demoUncheckedException() {
        // Unchecked Exception Example
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception caught: " + e);
        } finally {
            System.out.println("Finally block for unchecked exception always executes.\n");
        }
    }

    static void demoCheckedException() {
        // Checked Exception Example
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your city: ");
            String city = scanner.nextLine();
            System.out.println("You live in: " + city);

            // Forcing checked exception
            //System.in.close();
            //System.in.read(); // reading again will throw IOException
    }
}
