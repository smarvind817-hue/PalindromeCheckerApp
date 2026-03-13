import java.util.Scanner;

/**
 * ==========================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * ==========================================
 * * Use Case 11: Object-Oriented Palindrome Service
 * * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 * * The palindrome logic is implemented inside a
 * PalindromeService class.
 * * This ensures:
 * - Reusability
 * - Readability
 * - Separation of concerns
 * * @author Developer
 * @version 11.0
 */
public class racecarPalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate the service object
        PalindromeService service = new PalindromeService();

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Call the service method
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            // Compare characters at both ends
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Mismatch found
            }

            // Move pointers inward
            start++;
            end--;
        }

        return true; // All characters matched
    }
}