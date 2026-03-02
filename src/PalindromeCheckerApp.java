import java.util.Stack;

/**
 * =============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * @author Developer
 * @version 13.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 13.0");
        System.out.println("Use Case 13: Performance Comparison");
        System.out.println();

        String input = "A man a plan a canal Panama";

        // Use strategy (Stack-based here)
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution duration
        long duration = endTime - startTime;

        if (result) {
            System.out.println("The input is a PALINDROME.");
        } else {
            System.out.println("The input is NOT a palindrome.");
        }

        System.out.println("Execution Time (nanoseconds): " + duration);
        System.out.println();
        System.out.println("Benchmarking completed.");
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based implementation
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        if (input == null) return false;

        // Normalize (for fair comparison)
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}