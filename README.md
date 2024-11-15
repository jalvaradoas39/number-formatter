# Number Formatter Program

## Description
This assignment was completed as part of my Java programming course. The task was to write a Java program that provides multiple formatting options for integers by implementing a `NumberFormatter` interface. This interface includes a single method, `format(int n)`, which is used to define custom formatting styles. The project required creating four classes that implement this interface, each with a unique formatting style.

### The classes implemented:
- **DefaultFormatter**: Formats an integer in the usual way without any special formatting.
- **DecimalSeparatorFormatter**: Formats an integer with commas as thousands separators. For example, one million is formatted as `1,000,000`.
- **AccountingFormatter**: Formats negative numbers with parentheses, making `-1` appear as `(1)`.
- **BaseFormatter**: Formats the integer in a specified base (from 2 to 36), which is provided in the constructor. This allows numbers to be represented in various bases such as binary (base 2) or hexadecimal (base 16).

Additionally, we were provided a file, `NumberFormatterTester.java`, for testing purposes. 
### Files included in this project:
1. `NumberFormatter.java` (interface)
2. `DefaultFormatter.java`
3. `DecimalSeparatorFormatter.java`
4. `AccountingFormatter.java`
5. `BaseFormatter.java`
6. `NumberFormatterTester.java` (test class)

## What I Learned
This project helped in understanding interfaces and polymorphism in Java by implementing multiple classes with varied formatting techniques through a common interface.
