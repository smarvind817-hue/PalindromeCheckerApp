public class PalindromeCheckerApp {
        public static void main(String[] args) {
            String str = "madam";

            // Convert string to character array
            char[] chars = str.toCharArray();

            int start = 0;
            int end = chars.length - 1;
            boolean isPalindrome = true;

            // Two-pointer comparison
            while (start < end) {
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            // Result
            if (isPalindrome) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is Not a Palindrome");
            }
        }
    }