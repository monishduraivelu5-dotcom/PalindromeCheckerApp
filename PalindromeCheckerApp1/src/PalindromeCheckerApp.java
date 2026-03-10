/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "racecar";

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        // Execute algorithm
        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate duration
        long duration = endTime - startTime;

        // Print results
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time (nanoseconds): " + duration);
    }
}


/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 *
 * Defines a contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}


/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 *
 * Stack based palindrome implementation.
 * Uses LIFO behavior to reverse characters.
 */

class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input input string to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare with popped characters
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}