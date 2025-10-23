package com.modernjava._9functionalprogramming;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * _6ParallelStreams - Understanding Parallel Streams in Java
 *
 * Demonstrates:
 * - How parallel streams work under the hood (Fork-Join Framework)
 * - When to use parallel streams vs sequential streams
 * - Performance considerations and trade-offs
 * - Best practices and common pitfalls
 * - Practical use cases where parallel streams shine
 */
public class _6ParallelStreams {

    public static void main(String[] args) {
        System.out.println("=== Java Parallel Streams Deep Dive ===\n");

        // 1. Understanding the basics
        demonstrateBasicParallelStreams();

        // 2. Fork-Join Framework under the hood
        demonstrateForkJoinFramework();

        // 3. Performance comparison
        demonstratePerformanceComparison();

        // 4. When NOT to use parallel streams
        demonstrateWhenNotToUseParallel();

        // 5. Best practices and use cases
        demonstrateBestPractices();

        // 6. Thread safety considerations
        demonstrateThreadSafety();
    }

    /**
     * Basic introduction to parallel streams
     */
    private static void demonstrateBasicParallelStreams() {
        System.out.println("1. Basic Parallel Streams:");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original list: " + numbers);

        // Sequential stream
        System.out.println("\nSequential stream processing:");
        numbers.stream()
                .map(n -> {
                    System.out.println("Processing " + n + " on thread: " +
                                     Thread.currentThread().getName());
                    return n * n;
                })
                .forEach(result -> System.out.println("Result: " + result));

        System.out.println("\n" + "=".repeat(50));

        // Parallel stream
        System.out.println("Parallel stream processing:");
        numbers.parallelStream()
                .map(n -> {
                    System.out.println("Processing " + n + " on thread: " +
                                     Thread.currentThread().getName());
                    return n * n;
                })
                .forEach(result -> System.out.println("Result: " + result));

        System.out.println("\n" + "=".repeat(80) + "\n");
    }

    /**
     * Understanding the Fork-Join Framework that powers parallel streams
     */
    private static void demonstrateForkJoinFramework() {
        System.out.println("2. Fork-Join Framework Under the Hood:");

        // Get information about the common ForkJoinPool
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        System.out.println("Common ForkJoinPool details:");
        System.out.println("- Parallelism level: " + commonPool.getParallelism());
        System.out.println("- Available processors: " + Runtime.getRuntime().availableProcessors());
        System.out.println("- Pool size: " + commonPool.getPoolSize());

        System.out.println("\nHow parallel streams split work:");

        // Create a larger dataset to see splitting in action
        List<Integer> largeList = IntStream.rangeClosed(1, 1000)
                                          .boxed()
                                          .collect(Collectors.toList());

        System.out.println("Processing " + largeList.size() + " elements...");

        // Track which threads are used
        Set<String> threadsUsed = Collections.synchronizedSet(new HashSet<>());

        largeList.parallelStream()
                 .map(n -> {
                     threadsUsed.add(Thread.currentThread().getName());
                     return n * 2;
                 })
                 .reduce(0, Integer::sum);

        System.out.println("Threads used in parallel processing: " + threadsUsed.size());
        threadsUsed.forEach(thread -> System.out.println("- " + thread));

        System.out.println("\n" + "=".repeat(80) + "\n");
    }

    /**
     * Performance comparison between sequential and parallel streams
     */
    private static void demonstratePerformanceComparison() {
        System.out.println("3. Performance Comparison:");

        // Test with different sizes
        int[] sizes = {1_000, 10_000, 100_000, 1_000_000};

        for (int size : sizes) {
            System.out.println("\nTesting with " + size + " elements:");

            List<Integer> data = IntStream.rangeClosed(1, size)
                                         .boxed()
                                         .collect(Collectors.toList());

            // Sequential processing
            long startTime = System.nanoTime();
            long sequentialResult = data.stream()
                                      .mapToLong(n -> expensiveOperation(n))
                                      .sum();
            long sequentialTime = System.nanoTime() - startTime;

            // Parallel processing
            startTime = System.nanoTime();
            long parallelResult = data.parallelStream()
                                    .mapToLong(n -> expensiveOperation(n))
                                    .sum();
            long parallelTime = System.nanoTime() - startTime;

            System.out.println("Sequential time: " + (sequentialTime / 1_000_000) + " ms");
            System.out.println("Parallel time: " + (parallelTime / 1_000_000) + " ms");
            System.out.println("Speedup: " + String.format("%.2fx",
                             (double) sequentialTime / parallelTime));
            System.out.println("Results match: " + (sequentialResult == parallelResult));
        }

        System.out.println("\n" + "=".repeat(80) + "\n");
    }

    /**
     * Simulate an expensive CPU-bound operation
     */
    private static long expensiveOperation(int n) {
        // Simulate some computation
        long result = 0;
        for (int i = 0; i < 100; i++) {
            result += Math.sqrt(n * i);
        }
        return result;
    }

    /**
     * Demonstrate scenarios where parallel streams are NOT beneficial
     */
    private static void demonstrateWhenNotToUseParallel() {
        System.out.println("4. When NOT to Use Parallel Streams:");

        // 1. Small datasets
        System.out.println("\na) Small datasets (overhead > benefit):");
        List<Integer> smallList = Arrays.asList(1, 2, 3, 4, 5);

        long startTime = System.nanoTime();
        smallList.stream().mapToInt(n -> n * n).sum();
        long seqTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        smallList.parallelStream().mapToInt(n -> n * n).sum();
        long parTime = System.nanoTime() - startTime;

        System.out.println("Small list - Sequential: " + seqTime + " ns");
        System.out.println("Small list - Parallel: " + parTime + " ns");
        System.out.println("Parallel is " + (parTime > seqTime ? "slower" : "faster"));

        // 2. I/O bound operations
        System.out.println("\nb) I/O bound operations (not CPU intensive):");
        System.out.println("- File operations");
        System.out.println("- Database queries");
        System.out.println("- Network calls");
        System.out.println("- These benefit more from async programming than parallelism");

        // 3. Stateful operations
        System.out.println("\nc) Operations that require ordering or state:");
        List<String> words = Arrays.asList("hello", "world", "java", "streams");

        System.out.println("Sequential forEach (maintains order):");
        words.stream().forEach(word -> System.out.print(word + " "));

        System.out.println("\n\nParallel forEach (order not guaranteed):");
        words.parallelStream().forEach(word -> System.out.print(word + " "));

        System.out.println("\n\nUse forEachOrdered() for parallel with order:");
        words.parallelStream().forEachOrdered(word -> System.out.print(word + " "));

        System.out.println("\n\n" + "=".repeat(80) + "\n");
    }

    /**
     * Best practices and optimal use cases for parallel streams
     */
    private static void demonstrateBestPractices() {
        System.out.println("5. Best Practices and Optimal Use Cases:");

        System.out.println("\na) Perfect for CPU-intensive operations on large datasets:");

        // Mathematical computations
        List<Integer> numbers = IntStream.rangeClosed(1, 100_000)
                                       .boxed()
                                       .collect(Collectors.toList());

        // Prime number checking - CPU intensive
        long startTime = System.currentTimeMillis();
        List<Integer> primes = numbers.parallelStream()
                                    .filter(_6ParallelStreams::isPrime)
                                    .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println("Found " + primes.size() + " primes in " +
                          (endTime - startTime) + " ms using parallel streams");

        System.out.println("\nb) Data processing pipelines:");

        // Complex data transformation
        List<String> words = Arrays.asList(
            "java", "streams", "parallel", "processing", "performance",
            "optimization", "concurrency", "threading", "scalability"
        );

        Map<Integer, List<String>> wordsByLength = words.parallelStream()
                .filter(word -> word.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Words grouped by length: " + wordsByLength);

        System.out.println("\nc) Numeric computations:");

        // Calculate sum of squares efficiently
        long sumOfSquares = LongStream.rangeClosed(1, 10_000)
                                    .parallel()
                                    .map(n -> n * n)
                                    .sum();

        System.out.println("Sum of squares (1 to 10,000): " + sumOfSquares);

        System.out.println("\n" + "=".repeat(80) + "\n");
    }

    /**
     * Thread safety considerations with parallel streams
     */
    private static void demonstrateThreadSafety() {
        System.out.println("6. Thread Safety Considerations:");

        System.out.println("\na) Thread-safe collectors are essential:");

        List<Integer> numbers = IntStream.rangeClosed(1, 1000)
                                       .boxed()
                                       .collect(Collectors.toList());

        // Safe: Using thread-safe collectors
        Map<Boolean, List<Integer>> partitioned = numbers.parallelStream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers count: " + partitioned.get(true).size());
        System.out.println("Odd numbers count: " + partitioned.get(false).size());

        System.out.println("\nb) Avoiding shared mutable state:");

        // WRONG: This would cause race conditions
        // List<Integer> results = new ArrayList<>(); // Not thread-safe!
        // numbers.parallelStream().forEach(results::add); // DON'T DO THIS!

        // RIGHT: Use proper collectors or thread-safe collections
        List<Integer> safeResults = numbers.parallelStream()
                                         .filter(n -> n % 10 == 0)
                                         .collect(Collectors.toList());

        System.out.println("Numbers divisible by 10: " + safeResults.size());

        System.out.println("\nc) Custom thread pool (when needed):");

        // Using custom ForkJoinPool for specific parallelism level
        ForkJoinPool customPool = new ForkJoinPool(2);
        try {
            List<Integer> result = customPool.submit(() ->
                numbers.parallelStream()
                       .map(n -> n * 2)
                       .collect(Collectors.toList())
            ).get();

            System.out.println("Processed " + result.size() +
                             " elements with custom pool (2 threads)");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            customPool.shutdown();
        }

        System.out.println("\n" + "=".repeat(80) + "\n");
    }

    /**
     * Simple prime checking method for demonstration
     */
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Key Takeaways:
     *
     * 1. WHEN TO USE PARALLEL STREAMS:
     *    - Large datasets (thousands+ elements)
     *    - CPU-intensive operations
     *    - Independent operations (no shared state)
     *    - When splitting cost < parallelization benefit
     *
     * 2. WHEN NOT TO USE:
     *    - Small datasets (< 1000 elements typically)
     *    - I/O bound operations
     *    - Operations requiring strict ordering
     *    - When using non-thread-safe operations
     *
     * 3. PERFORMANCE FACTORS:
     *    - Dataset size
     *    - Operation cost
     *    - Available CPU cores
     *    - Overhead of splitting/merging
     *
     * 4. THREAD SAFETY:
     *    - Always use thread-safe collectors
     *    - Avoid shared mutable state
     *    - Consider using custom ForkJoinPool when needed
     *
     * 5. UNDER THE HOOD:
     *    - Uses ForkJoinPool.commonPool()
     *    - Work-stealing algorithm
     *    - Recursive divide-and-conquer approach
     *    - Automatic load balancing
     */
}
