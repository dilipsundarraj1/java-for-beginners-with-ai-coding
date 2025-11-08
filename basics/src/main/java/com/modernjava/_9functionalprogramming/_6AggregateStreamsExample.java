package com.modernjava._9functionalprogramming;

import com.modernjava.domain.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    static void main(String[] args) {
        System.out.println("=== Java Stream Aggregate Operations ===\n");

        // 1. Basic count operation

        // 2. Reduce operations - the foundation of aggregation

        // 3. Min and Max operations with Optional handling

        // 4. Primitive stream aggregations (sum, average, etc.)

        // 5. Advanced aggregation with collectors

        // 6. Real-world examples combining multiple operations
        demonstrateRealWorldExamples();
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
