package com.modernjava._1helloworld;

public class HelloWorld {

   public static void main(String[] args) {
        System.out.println("*****");
        System.out.println("HelloWorld ");
        IO.println("HelloWorld ");
        System.out.println("Welcome to Programming");
        System.out.println("*****");

        // Using printf to format the output
        System.out.printf("%s%n%s", "HelloWorld printf", "Welcome to Programming printf");
        //This is not available in IO class
        //IO.printf("%s%n%s", "HelloWorld printf", "Welcome to Programming printf");

        // Using single print function instead of multiple println calls
        System.out.print("*****\nHelloWorld\nWelcome to Programming\n*****\n");
        IO.print("*****\nHelloWorld\nWelcome to Programming\n*****\n");

        // Escape Sequences Examples
        System.out.println("\n=== Escape Sequences Examples ===");

        // \n : Newline - Position the screen cursor at the beginning of the next line
        System.out.println("Example 1 - \\n (Newline):");
        System.out.println("HelloWorld\nWelcome to Programming");

        // \t : Horizontal tab - Move the screen cursor to the next tab stop
        System.out.println("\nExample 2 - \\t (Horizontal Tab):");
        System.out.println("HelloWorld\tWelcome to Programming");
        System.out.println("Name:\tJohn\tAge:\t25");

        // \\ : Backslash - Print a backslash character
        System.out.println("\nExample 3 - \\\\ (Backslash):");
        System.out.println("File path: C:\\Users\\Documents\\file.txt");
        System.out.println("This is a backslash: \\");

        // \" : Double quote - Print a double-quote character
        System.out.println("\nExample 4 - \\\" (Double Quote):");
        System.out.println("He said, \"HelloWorld\"");
        System.out.println("\"Welcome to Programming\" is our motto");

        // Combining multiple escape sequences
        System.out.println("\nExample 5 - Combining escape sequences:");
        System.out.println("Student: \"John\"\tGrade: \"A\"\nFile: C:\\Users\\John\\grades.txt");
    }
}
