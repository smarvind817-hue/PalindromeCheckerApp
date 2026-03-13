import java.util.Scanner;
import java.util.Stack;

/**
 * ==========================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * ==========================================
 * * Use Case 12: Strategy Pattern for Palindrome Algorithms
 * * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Using the Stack-based strategy
        PalindromeStrategy strategy = new StackBasedStrategy();
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * INTERFACE - PalindromeStrategy
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackBasedStrategy
 * Provides a Stack-based implementation of the PalindromeStrategy.
 */
class StackBasedStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using a Stack.
     * Logic: Pushing characters to a stack reverses their order.
     */
    @Override
    public boolean check(String input) {
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false; // If popped char doesn't match original, not a palindrome
            }
        }

        return true;
    }
}