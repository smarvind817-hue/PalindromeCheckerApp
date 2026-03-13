import java.util.Stack;
public class PalindromeCheckerApp {
        public static void main(String[] args) {

            String str = "madam";
            Stack<Character> stack = new Stack<>();

            // Push characters into stack
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            String reversed = "";

            // Pop characters from stack
            while (!stack.isEmpty()) {
                reversed += stack.pop();
            }

            // Compare original and reversed string
            if (str.equals(reversed)) {
                System.out.println(str + " is a Palindrome");
            } else {
                System.out.println(str + " is Not a Palindrome");
            }
        }
    }