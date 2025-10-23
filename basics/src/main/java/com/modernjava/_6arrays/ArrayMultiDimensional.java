package com.modernjava._6arrays;

/**
 * ArrayMultiDimensional - Understanding Multidimensional Arrays
 *
 * This class demonstrates multidimensional arrays in Java:
 * - 2D array creation and structure understanding
 * - Multiple initialization techniques for 2D arrays
 * - Traversal patterns and element access methods
 * - 3D arrays and real-world applications
 * - Memory layout and performance considerations
 *
 * Multidimensional arrays are arrays of arrays, allowing you to
 * represent matrices, tables, cubes, and other structured data.
 *
 * @author Dilip
 */
public class ArrayMultiDimensional {

    public static void main(String[] args) {
        System.out.println("=== Multidimensional Arrays - Advanced Array Concepts ===\n");

        // Demonstrate 2D array creation and structure
        demonstrate2DArrayCreation();

        // Demonstrate jagged arrays separately
        demonstrateJaggedArrays();

        // Demonstrate seating chart example
        demonstrateSeatingChart();

        // Show multiple initialization techniques
        demonstrate2DArrayInitialization();

        // Introduce 3D arrays and applications
        demonstrate3DArraysAndApplications();

        // Demonstrate tic-tac-toe game boards
        demonstrateTicTacToeGames();
    }

    /**
     * Demonstrates different ways to create 2D arrays and understand their structure.
     * Shows rectangular arrays and their basic properties.
     */
    private static void demonstrate2DArrayCreation() {
        System.out.println("--- 2D Array Creation and Structure ---");

        // Create rectangular 2D array - all rows have same length
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns each

        System.out.println("Created rectangular 2D array with dimensions:");
        System.out.println("  Rows: " + matrix.length);
        System.out.println("  Columns: " + matrix[0].length);
        System.out.println("  Total elements: " + (matrix.length * matrix[0].length));

        System.out.println("\nDefault values in rectangular 2D array:");
        print2DArray(matrix);

        // Fill with sample data to show structure
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }

        System.out.println("Rectangular array filled with sequential values:");
        print2DArray(matrix);

        // Show that all rows have the same length
        System.out.println("Verifying rectangular structure:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("  Row " + i + " length: " + matrix[i].length);
        }

        System.out.println();
    }

    /**
     * Demonstrates jagged arrays where rows can have different lengths.
     * Shows real-world applications and memory efficiency benefits.
     */
    private static void demonstrateJaggedArrays() {
        System.out.println("--- Jagged Arrays - Different Row Lengths ---");

        // Create jagged array - rows can have different lengths
        int[][] jaggedArray = new int[3][]; // Only specify number of rows
        jaggedArray[0] = new int[2];         // First row: 2 elements
        jaggedArray[1] = new int[4];         // Second row: 4 elements
        jaggedArray[2] = new int[3];         // Third row: 3 elements

        System.out.println("Jagged array with different row lengths:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("  Row " + i + " length: " + jaggedArray[i].length);
        }

        // Fill jagged array with sample data
        jaggedArray[0][0] = 10; jaggedArray[0][1] = 20;
        jaggedArray[1][0] = 30; jaggedArray[1][1] = 40; jaggedArray[1][2] = 50; jaggedArray[1][3] = 60;
        jaggedArray[2][0] = 70; jaggedArray[2][1] = 80; jaggedArray[2][2] = 90;

        System.out.println("\nJagged array with data:");
        print2DArray(jaggedArray);

        // Real-world jagged array example: Monthly Days in a Calendar
        System.out.println("Real-world example: Monthly Days in a Calendar");
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                              "July", "August", "September", "October", "November", "December"};

        // Create jagged array for full year calendar - each month has different number of days
        int[][] calendar = new int[12][];  // 12 months
        calendar[0] = new int[31];   // January - 31 days
        calendar[1] = new int[28];   // February - 28 days (non-leap year)
        calendar[2] = new int[31];   // March - 31 days
        calendar[3] = new int[30];   // April - 30 days
        calendar[4] = new int[31];   // May - 31 days
        calendar[5] = new int[30];   // June - 30 days
        calendar[6] = new int[31];   // July - 31 days
        calendar[7] = new int[31];   // August - 31 days
        calendar[8] = new int[30];   // September - 30 days
        calendar[9] = new int[31];   // October - 31 days
        calendar[10] = new int[30];  // November - 30 days
        calendar[11] = new int[31];  // December - 31 days

        // Display calendar structure
        System.out.println("Calendar structure (month lengths):");
        for (int month = 0; month < calendar.length; month++) {
            System.out.printf("%-12s: %2d days%n", monthNames[month], calendar[month].length);
        }

        // Fill some sample days with temperature data (just for demonstration)
        calendar[0][0] = 15;  // January 1st: 15°C
        calendar[0][14] = 18; // January 15th: 18°C
        calendar[0][30] = 22; // January 31st: 22°C
        calendar[1][13] = 25; // February 14th (Valentine's): 25°C
        calendar[11][24] = 5; // December 25th (Christmas): 5°C

        System.out.println("\nSample temperature readings:");
        System.out.println("January 1st: " + calendar[0][0] + "°C");
        System.out.println("January 15th: " + calendar[0][14] + "°C");
        System.out.println("January 31st: " + calendar[0][30] + "°C");
        System.out.println("February 14th: " + calendar[1][13] + "°C");
        System.out.println("December 25th: " + calendar[11][24] + "°C");

        // Calculate total days in the year
        int totalDays = 0;
        for (int month = 0; month < calendar.length; month++) {
            totalDays += calendar[month].length;
        }
        System.out.println("Total days in year: " + totalDays + " days");

        // Show why jagged arrays are perfect for this scenario
        System.out.println("\nWhy jagged arrays are ideal:");
        System.out.println("- Memory efficient: Only allocates needed space for each month");
        System.out.println("- Natural representation: Months actually have different lengths");
        System.out.println("- Prevents errors: Cannot access February 30th (doesn't exist!)");

        System.out.println();
    }

    /**
     * Demonstrates multiple ways to initialize 2D arrays with values.
     * Shows direct initialization, loop-based, and individual assignment.
     */
    private static void demonstrate2DArrayInitialization() {
        System.out.println("--- 2D Array Initialization Techniques ---");

        // Method 1: Direct initialization with nested braces
        int[][] grades = {
            {85, 90, 78},    // Student 1's grades in 3 subjects
            {92, 88, 95},    // Student 2's grades in 3 subjects
            {76, 82, 89}     // Student 3's grades in 3 subjects
        };

        System.out.println("Student grades matrix:");
        print2DArray(grades);

        // String 2D array example
        String[][] studentData = {
            {"Alice", "Math"},
            {"Bob", "Science"},
            {"Carol", "History"}
        };

        System.out.println("Student data table:");
        printStringMatrix(studentData);

        // Method 2: Loop-based initialization (multiplication table)
        int[][] multiplicationTable = new int[5][5];
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Multiplication table (5x5):");
        print2DArray(multiplicationTable);

        // Method 3: Individual element assignment (identity matrix)
        int[][] identityMatrix = new int[4][4];

        // Initialize all elements to 0 (already default, but shown for clarity)
        for (int i = 0; i < identityMatrix.length; i++) {
            for (int j = 0; j < identityMatrix[i].length; j++) {
                identityMatrix[i][j] = 0;
            }
        }

        // Set diagonal elements to 1 to create identity matrix
        for (int i = 0; i < identityMatrix.length; i++) {
            identityMatrix[i][i] = 1;
        }

        System.out.println("Identity matrix (4x4):");
        print2DArray(identityMatrix);

        System.out.println();
    }

    /**
     * Demonstrates 3D arrays and their real-world applications.
     * Shows creation, initialization, and practical use cases.
     */
    private static void demonstrate3DArraysAndApplications() {
        System.out.println("--- 3D Arrays and Applications ---");

        // Create 3D array: [depth][height][width]
        int[][][] cube = new int[2][3][4];

        System.out.println("3D array dimensions:");
        System.out.println("  Depth: " + cube.length);
        System.out.println("  Height: " + cube[0].length);
        System.out.println("  Width: " + cube[0][0].length);
        System.out.println("  Total elements: " + (cube.length * cube[0].length * cube[0][0].length));

        // Building floors example - practical application
        String[][][] buildingRooms = new String[3][2][3]; // 3 floors, 2 rows, 3 rooms per row

        // Initialize room numbers
        for (int floor = 0; floor < buildingRooms.length; floor++) {
            for (int row = 0; row < buildingRooms[floor].length; row++) {
                for (int room = 0; room < buildingRooms[floor][row].length; room++) {
                    int roomNumber = (floor + 1) * 100 + row * 10 + (room + 1);
                    buildingRooms[floor][row][room] = String.valueOf(roomNumber);
                }
            }
        }

        System.out.println("\nBuilding layout (3 floors, 2 rows, 3 rooms per row):");
        print3DStringArray(buildingRooms);

        System.out.println();
    }

    /**
     * Demonstrates 3D arrays for game applications: multiple tic-tac-toe game boards.
     * Shows how 3D arrays can represent collections of 2D game states.
     */
    private static void demonstrateTicTacToeGames() {
        System.out.println("--- 3D Arrays for Game Applications: Tic-Tac-Toe Games ---");

        // Tic-tac-toe game boards - multiple games stored in 3D array
        char[][][] ticTacToeGames = new char[3][3][3]; // 3 games, 3x3 boards each

        System.out.println("Creating 3D array for multiple game boards:");
        System.out.println("  Games: " + ticTacToeGames.length);
        System.out.println("  Rows per game: " + ticTacToeGames[0].length);
        System.out.println("  Columns per game: " + ticTacToeGames[0][0].length);

        // Game 1: X wins
        ticTacToeGames[0] = new char[][]{
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'O', 'X', 'X'}
        };

        // Game 2: O wins
        ticTacToeGames[1] = new char[][]{
            {'O', 'X', 'X'},
            {'X', 'O', 'X'},
            {'X', 'X', 'O'}
        };

        // Game 3: Draw
        ticTacToeGames[2] = new char[][]{
            {'X', 'O', 'X'},
            {'O', 'O', 'X'},
            {'O', 'X', 'O'}
        };

        System.out.println("\nStored game results:");
        String[] gameResults = {"X wins", "O wins", "Draw"};
        
        for (int game = 0; game < ticTacToeGames.length; game++) {
            System.out.println("Game " + (game + 1) + " (" + gameResults[game] + "):");
            for (int row = 0; row < ticTacToeGames[game].length; row++) {
                for (int col = 0; col < ticTacToeGames[game][row].length; col++) {
                    System.out.print(ticTacToeGames[game][row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Demonstrate practical usage: analyzing game statistics
        int xWins = 0, oWins = 0, draws = 0;
        for (int game = 0; game < ticTacToeGames.length; game++) {
            if (gameResults[game].equals("X wins")) xWins++;
            else if (gameResults[game].equals("O wins")) oWins++;
            else draws++;
        }

        System.out.println("Game Statistics:");
        System.out.println("  X wins: " + xWins);
        System.out.println("  O wins: " + oWins);
        System.out.println("  Draws: " + draws);
        System.out.println("  Total games: " + ticTacToeGames.length);

        System.out.println();
    }

    /**
     * Demonstrates a practical 2D array application: seating chart for a theater.
     * Shows boolean array usage and visual representation of seat availability.
     */
    private static void demonstrateSeatingChart() {
        System.out.println("--- 2D Array Application: Theater Seating Chart ---");

        // 2D array representing a seating chart (5 rows, 6 seats each)
        boolean[][] seats = new boolean[5][6];
        // false = available, true = booked

        System.out.println("Initial seating chart (all seats available):");
        displaySeatingChart(seats);

        // Book a few seats
        seats[0][2] = true; // Row 0, Seat 2 is booked
        seats[1][1] = true; // Row 1, Seat 1 is booked
        seats[3][4] = true; // Row 3, Seat 4 is booked
        seats[4][0] = true; // Row 4, Seat 0 is booked
        seats[4][5] = true; // Row 4, Seat 5 is booked

        System.out.println("\nSeating chart after booking some seats:");
        displaySeatingChart(seats);

        // Count available and booked seats
        int availableSeats = 0;
        int bookedSeats = 0;

        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col]) {
                    bookedSeats++;
                } else {
                    availableSeats++;
                }
            }
        }

        System.out.println("\nSeating Summary:");
        System.out.println("Total seats: " + (seats.length * seats[0].length));
        System.out.println("Available seats: " + availableSeats);
        System.out.println("Booked seats: " + bookedSeats);
        System.out.println("Occupancy rate: " + String.format("%.1f%%", (double)bookedSeats / (seats.length * seats[0].length) * 100));

        System.out.println();
    }

    /**
     * Helper method to display the seating chart in a visual format
     */
    private static void displaySeatingChart(boolean[][] seats) {
        System.out.println("    S1  S2  S3  S4  S5  S6"); // Seat numbers header
        for (int row = 0; row < seats.length; row++) {
            System.out.print("R" + (row + 1) + ": ");
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col]) {
                    System.out.print("[X] "); // Booked seat
                } else {
                    System.out.print("[ ] "); // Available seat
                }
            }
            System.out.println();
        }
    }

    // Helper Methods

    /**
     * Prints a 2D integer array in matrix format
     */
    private static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.printf("%2d", row[j]);
                if (j < row.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    /**
     * Prints a 2D string array in table format
     */
    private static void printStringMatrix(String[][] array) {
        for (String[] row : array) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    /**
     * Prints a 3D string array showing each 2D slice
     */
    private static void print3DStringArray(String[][][] array) {
        for (int depth = 0; depth < array.length; depth++) {
            System.out.println("Floor " + depth + ":");
            for (String[] row : array[depth]) {
                System.out.print("[");
                for (int j = 0; j < row.length; j++) {
                    System.out.print(row[j]);
                    if (j < row.length - 1) System.out.print(", ");
                }
                System.out.println("]");
            }
            System.out.println();
        }
    }
}
