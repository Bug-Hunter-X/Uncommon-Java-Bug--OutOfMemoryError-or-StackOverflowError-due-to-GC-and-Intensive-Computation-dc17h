# Uncommon Java Bug: OutOfMemoryError or StackOverflowError

This repository demonstrates an uncommon bug in Java that can occur when combining frequent garbage collection requests with intensive computation. The bug can manifest as either an `OutOfMemoryError` or a `StackOverflowError`, depending on the system's resources and the JVM settings.

## Description

The Java code simulates a scenario where a loop continuously executes, performing intensive computation and requesting garbage collection every 100,000 iterations. This could exhaust the heap memory or the stack, leading to either of the mentioned errors.

## Solution

The solution focuses on reducing memory consumption and mitigating the potential for stack overflow.  Refactoring the code to avoid resource-intensive operations within a continuous loop will often prevent this issue. For scenarios where memory use is unavoidably high, consider using techniques like object pooling, memory-mapped files, or adjusting JVM heap size.

## How to Reproduce

1. Clone this repository.
2. Compile the `UncommonBug.java` file.
3. Run the compiled class.
4. Observe the error message (either `OutOfMemoryError` or `StackOverflowError`).