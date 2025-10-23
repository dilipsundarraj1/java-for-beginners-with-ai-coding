package com.modernjava._9functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import com.modernjava.domain.Student;

/**
 * _6AggregateStreamsExample - Comprehensive Guide to Stream Aggregate Operations
 *
 * Demonstrates terminal operations that reduce stream elements to single values:
 * - reduce() - Custom reduction with binary operators
 * - count() - Count elements in the stream
 * - min(), max() - Find minimum/maximum elements (returns Optional)
 * - sum(), average() - Specialized operations for primitive streams
 * - collect() - Flexible aggregation using collectors
 */
public class _6AggregateStreamsExample {

    public static void main(String[] args) {
        System.out.println("=== Java Stream Aggregate Operations ===\n");

        // 1. Basic count operation
        demonstrateCount();

        // 2. Reduce operations - the foundation of aggregation
        demonstrateReduce();

        // 3. Min and Max operations with Optional handling
        demonstrateMinMax();

        // 4. Primitive stream aggregations (sum, average, etc.)
        demonstratePrimitiveStreamAggregation();

        // 5. Advanced aggregation with collectors
        demonstrateCollectors();

        // 6. Real-world examples combining multiple operations
        demonstrateRealWorldExamples();
    }

    /**
     * Demonstrates the count() operation - simplest aggregate function
     */
    private static void demonstrateCount() {
        System.out.println("1. Count Operation:");
        System.out.println("   count() returns the number of elements in the stream as a long\n");

        List<String> words = Arrays.asList("java", "stream", "aggregate", "operations", "count");
        System.out.println("Original list: " + words);

        // Basic count
        long totalWords = words.stream().count();
        System.out.println("Total words: " + totalWords);

        // Count with filtering
        long longWords = words.stream()
                              .filter(word -> word.length() > 5)
                              .count();
        System.out.println("Words longer than 5 characters: " + longWords);

        // Count distinct elements
        List<String> duplicates = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date");
        long distinctFruits = duplicates.stream()
                                       .distinct()
                                       .count();
        System.out.println("Distinct fruits from " + duplicates + ": " + distinctFruits);

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates reduce() operations - the most flexible aggregate operation
     */
    private static void demonstrateReduce() {
        System.out.println("2. Reduce Operations:");
        System.out.println("   reduce() combines stream elements using a binary operator\n");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Numbers: " + numbers);

        // Simple reduction - sum
        System.out.println("\na) Basic reduce with identity:");
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum using reduce: " + sum);

        // Using method reference
        int sumMethodRef = numbers.stream()
                                  .reduce(0, Integer::sum);
        System.out.println("Sum using method reference: " + sumMethodRef);

        // Product using reduce
        int product = numbers.stream()
                             .reduce(1, (a, b) -> a * b);
        System.out.println("Product using reduce: " + product);

        System.out.println("\nb) Reduce without identity (returns Optional):");
        // Without identity - returns Optional
        Optional<Integer> sumOptional = numbers.stream()
                                              .reduce((a, b) -> a + b);
        System.out.println("Sum as Optional: " + sumOptional.orElse(0));

        // Find maximum using reduce
        Optional<Integer> max = numbers.stream()
                                      .reduce(Integer::max);
        System.out.println("Maximum using reduce: " + max.orElse(0));

        System.out.println("\nc) String concatenation with reduce:");
        List<String> words = Arrays.asList("Java", "Stream", "Reduce", "Example");
        System.out.println("Words: " + words);

        String concatenated = words.stream()
                                   .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated: '" + concatenated + "'");

        String spaceSeparated = words.stream()
                                     .reduce("", (a, b) -> a.isEmpty() ? b : a + " " + b);
        System.out.println("Space separated: '" + spaceSeparated + "'");

        System.out.println("\nd) Complex reduction - longest string:");
        Optional<String> longest = words.stream()
                                        .reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2);
        System.out.println("Longest word: " + longest.orElse("none"));

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates min() and max() operations with Optional handling
     */
    private static void demonstrateMinMax() {
        System.out.println("3. Min and Max Operations:");
        System.out.println("   min() and max() return Optional<T> to handle empty streams safely\n");

        List<Integer> numbers = Arrays.asList(15, 3, 8, 21, 7, 12, 4, 19, 6, 10);
        System.out.println("Numbers: " + numbers);

        // Basic min and max
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);

        System.out.println("Minimum: " + min.orElse(0));
        System.out.println("Maximum: " + max.orElse(0));

        // Using natural ordering comparator
        Optional<Integer> minNatural = numbers.stream().min(Comparator.naturalOrder());
        Optional<Integer> maxNatural = numbers.stream().max(Comparator.naturalOrder());

        System.out.println("Min (natural order): " + minNatural.orElse(0));
        System.out.println("Max (natural order): " + maxNatural.orElse(0));

        System.out.println("\nString comparisons:");
        List<String> words = Arrays.asList("elephant", "cat", "butterfly", "dog", "ant");
        System.out.println("Words: " + words);

        // Shortest and longest strings
        Optional<String> shortest = words.stream()
                                         .min(Comparator.comparing(String::length));
        Optional<String> longest = words.stream()
                                        .max(Comparator.comparing(String::length));

        System.out.println("Shortest word: " + shortest.orElse("none"));
        System.out.println("Longest word: " + longest.orElse("none"));

        // Alphabetical ordering
        Optional<String> firstAlpha = words.stream().min(String::compareTo);
        Optional<String> lastAlpha = words.stream().max(String::compareTo);

        System.out.println("First alphabetically: " + firstAlpha.orElse("none"));
        System.out.println("Last alphabetically: " + lastAlpha.orElse("none"));

        System.out.println("\nHandling empty streams:");
        List<Integer> emptyList = Arrays.asList();
        Optional<Integer> emptyMin = emptyList.stream().min(Integer::compareTo);

        System.out.println("Min of empty stream: " + emptyMin.orElse(-1));
        System.out.println("Is empty result present? " + emptyMin.isPresent());

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates primitive stream aggregations (IntStream, LongStream, DoubleStream)
     */
    private static void demonstratePrimitiveStreamAggregation() {
        System.out.println("4. Primitive Stream Aggregations:");
        System.out.println("   Specialized operations for IntStream, LongStream, DoubleStream\n");

        // IntStream aggregations
        System.out.println("a) IntStream operations:");
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array: " + Arrays.toString(intArray));

        IntStream intStream = Arrays.stream(intArray);

        int sum = intStream.sum();
        System.out.println("Sum: " + sum);

        // Note: streams can only be consumed once, so we create new streams
        OptionalDouble average = Arrays.stream(intArray).average();
        System.out.println("Average: " + average.orElse(0.0));

        OptionalInt min = Arrays.stream(intArray).min();
        OptionalInt max = Arrays.stream(intArray).max();
        System.out.println("Min: " + min.orElse(0) + ", Max: " + max.orElse(0));

        long count = Arrays.stream(intArray).count();
        System.out.println("Count: " + count);

        System.out.println("\nb) LongStream operations:");
        long[] longArray = {1000000L, 2000000L, 3000000L, 4000000L, 5000000L};
        System.out.println("Long array: " + Arrays.toString(longArray));

        long longSum = Arrays.stream(longArray).sum();
        System.out.println("Long sum: " + longSum);

        OptionalDouble longAverage = Arrays.stream(longArray).average();
        System.out.println("Long average: " + longAverage.orElse(0.0));

        System.out.println("\nc) DoubleStream operations:");
        double[] doubleArray = {3.14, 2.71, 1.41, 1.73, 0.57};
        System.out.println("Double array: " + Arrays.toString(doubleArray));

        double doubleSum = Arrays.stream(doubleArray).sum();
        System.out.println("Double sum: " + String.format("%.4f", doubleSum));

        OptionalDouble doubleAverage = Arrays.stream(doubleArray).average();
        System.out.println("Double average: " + String.format("%.4f", doubleAverage.orElse(0.0)));

        System.out.println("\nd) Converting to primitive streams:");
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // mapToInt creates IntStream
        int streamSum = numbers.stream()
                               .mapToInt(Integer::intValue)
                               .sum();
        System.out.println("Sum using mapToInt: " + streamSum);

        // Calculate sum of squares
        int sumOfSquares = numbers.stream()
                                  .mapToInt(n -> n * n)
                                  .sum();
        System.out.println("Sum of squares: " + sumOfSquares);

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Demonstrates advanced aggregation using collectors
     */
    private static void demonstrateCollectors() {
        System.out.println("5. Advanced Aggregation with Collectors:");
        System.out.println("   Using collect() with built-in and custom collectors\n");

        List<String> words = Arrays.asList("java", "stream", "collect", "aggregate", "reduce", "map", "filter");
        System.out.println("Words: " + words);

        // Joining strings
        System.out.println("\na) String joining:");
        String joined = words.stream().collect(Collectors.joining());
        System.out.println("Joined: " + joined);

        String commaSeparated = words.stream().collect(Collectors.joining(", "));
        System.out.println("Comma separated: " + commaSeparated);

        String withPrefix = words.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println("With prefix/suffix: " + withPrefix);

        // Grouping
        System.out.println("\nb) Grouping by length:");
        Map<Integer, List<String>> wordsByLength = words.stream()
                                                        .collect(Collectors.groupingBy(String::length));
        wordsByLength.forEach((length, wordList) ->
            System.out.println("Length " + length + ": " + wordList));

        // Counting
        System.out.println("\nc) Counting with collectors:");
        Map<Integer, Long> lengthCounts = words.stream()
                                              .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println("Words count by length: " + lengthCounts);

        // Statistical collectors
        System.out.println("\nd) Statistical collectors:");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        IntSummaryStatistics stats = numbers.stream()
                                           .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Statistics: " + stats);
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Real-world examples combining multiple aggregate operations
     */
    private static void demonstrateRealWorldExamples() {
        System.out.println("6. Real-World Examples:");
        System.out.println("   Combining multiple operations for practical scenarios\n");

        // Sample data - student grades
        List<Student> students = Arrays.asList(
            new Student("Alice", 85, "Math"),
            new Student("Bob", 92, "Physics"),
            new Student("Charlie", 78, "Math"),
            new Student("Diana", 96, "Physics"),
            new Student("Eve", 88, "Chemistry"),
            new Student("Frank", 72, "Math"),
            new Student("Grace", 94, "Chemistry"),
            new Student("Henry", 81, "Physics")
        );

        System.out.println("Student data:");
        students.forEach(System.out::println);

        System.out.println("\na) Overall statistics:");
        // Total students
        long totalStudents = students.stream().count();
        System.out.println("Total students: " + totalStudents);

        // Average grade
        OptionalDouble averageGrade = students.stream()
                                             .mapToInt(Student::getGrade)
                                             .average();
        System.out.println("Average grade: " + String.format("%.2f", averageGrade.orElse(0.0)));

        // Highest and lowest grades
        OptionalInt highestGrade = students.stream()
                                          .mapToInt(Student::getGrade)
                                          .max();
        OptionalInt lowestGrade = students.stream()
                                         .mapToInt(Student::getGrade)
                                         .min();
        System.out.println("Grade range: " + lowestGrade.orElse(0) + " - " + highestGrade.orElse(0));

        System.out.println("\nb) Subject-wise analysis:");
        // Students per subject
        Map<String, Long> subjectCounts = students.stream()
                                                 .collect(Collectors.groupingBy(Student::getSubject, Collectors.counting()));
        System.out.println("Students per subject: " + subjectCounts);

        // Average grade per subject
        Map<String, Double> subjectAverages = students.stream()
                                                     .collect(Collectors.groupingBy(Student::getSubject,
                                                             Collectors.averagingInt(Student::getGrade)));
        System.out.println("Average grades by subject:");
        subjectAverages.forEach((subject, avg) ->
            System.out.println("  " + subject + ": " + String.format("%.2f", avg)));

        // Top student per subject
        Map<String, Optional<Student>> topStudentPerSubject = students.stream()
                .collect(Collectors.groupingBy(Student::getSubject,
                        Collectors.maxBy(Comparator.comparing(Student::getGrade))));

        System.out.println("Top student per subject:");
        topStudentPerSubject.forEach((subject, topStudent) ->
            System.out.println("  " + subject + ": " + topStudent.map(Student::getName).orElse("None") +
                             " (" + topStudent.map(s -> s.getGrade() + "").orElse("0") + ")"));

        System.out.println("\nc) Advanced analysis:");
        // Students with grades above average
        double overallAverage = averageGrade.orElse(0.0);
        long aboveAverage = students.stream()
                                   .mapToInt(Student::getGrade)
                                   .filter(grade -> grade > overallAverage)
                                   .count();
        System.out.println("Students above average (" + String.format("%.2f", overallAverage) + "): " + aboveAverage);

        // Grade distribution
        Map<String, Long> gradeDistribution = students.stream()
                .collect(Collectors.groupingBy(s -> {
                    int grade = s.getGrade();
                    if (grade >= 90) return "A";
                    else if (grade >= 80) return "B";
                    else if (grade >= 70) return "C";
                    else return "D";
                }, Collectors.counting()));

        System.out.println("Grade distribution: " + gradeDistribution);

        System.out.println("─────────────────────────────────────────────────────────\n");
    }

    /**
     * Key Takeaways for Aggregate Operations:
     *
     * 1. TERMINAL OPERATIONS:
     *    - All aggregate operations are terminal (end the stream)
     *    - They trigger the execution of the entire stream pipeline
     *
     * 2. OPTIONAL HANDLING:
     *    - min(), max() return Optional to handle empty streams
     *    - Always use orElse(), orElseGet(), or check isPresent()
     *
     * 3. PRIMITIVE STREAMS:
     *    - IntStream, LongStream, DoubleStream have specialized methods
     *    - sum(), average() available without Optional wrapping
     *    - Use mapToInt(), mapToLong(), mapToDouble() to convert
     *
     * 4. REDUCE FLEXIBILITY:
     *    - Most powerful aggregate operation
     *    - Can implement any other aggregate operation
     *    - Three forms: with identity, without identity, with combiner
     *
     * 5. COLLECTORS:
     *    - Powerful tool for complex aggregations
     *    - Built-in collectors for common operations
     *    - Can create custom collectors for specific needs
     *
     * 6. PERFORMANCE CONSIDERATIONS:
     *    - Aggregate operations can be parallelized
     *    - Consider using parallel streams for large datasets
     *    - Primitive streams are more efficient for numeric operations
     */
}
