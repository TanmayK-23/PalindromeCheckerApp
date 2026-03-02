import java.util.Stack;

/**
 * =============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Description:
 * This class demonstrates how different palindrome
 * validation algorithms can be selected dynamically
 * at runtime using the Strategy Design Pattern.
 *
 * @author Developer
 * @version 12.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 12.0");
        System.out.println("Use Case 12: Strategy Pattern Implementation");
        System.out.println();

        String input = "madam";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        if (result) {
            System.out.println("The word '" + input + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + input + "' is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Program finished.");
    }
}

/**
 * =============================================================
 * INTERFACE - PalindromeStrategy
 * =============================================================
 *
 * Defines a contract for all palindrome algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =============================================================
 * CLASS - StackStrategy
 * =============================================================
 *
 * Concrete strategy implementation using Stack.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}