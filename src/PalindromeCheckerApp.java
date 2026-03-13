import java.util.Scanner;

/**
 * MAIN CLASS - UseCase9RecursivePalindrome
 * * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for JVM.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Initial call to the recursive method
        // start index = 0, end index = length - 1
        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Is Palindrome? " + result);

        scanner.close();
    }

    /**
     * Recursively checks whether a string is palindrome.
     * * @param s      Input string
     * @param start  Starting index
     * @param end    Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Case 1: All characters compared (or empty string)
        if (start >= end) {
            return true;
        }

        // Base Case 2: A mismatch is found
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive Step: Move inward by incrementing start and decrementing end
        return check(s, start + 1, end - 1);
    }
}