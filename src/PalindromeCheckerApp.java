import java.util.Scanner;
import java.util.Stack;

/**
 * ==========================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ==========================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Initialize the strategy
        PalindromeStrategy strategy = new StackBasedStrategy();

        // Capture Start Time (in nanoseconds)
        long startTime = System.nanoTime();

        // Execute the algorithm
        boolean result = strategy.check(input);

        // Capture End Time (in nanoseconds)
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }
}

/**
 * Strategy interface and implementation from previous steps
 */
interface PalindromeStrategy {
    boolean check(String input);
}

class StackBasedStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}