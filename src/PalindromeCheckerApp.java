import java.util.Deque;
import java.util.LinkedList;

/**
 * =============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * Characters are inserted into the deque and then
 * compared by removing elements from both ends:
 *  - removeFirst()
 *  - removeLast()
 *
 * This avoids reversing the string and provides an
 * efficient front-to-back comparison approach.
 *
 * @author Developer
 * @version 7.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 7.0");
        System.out.println("Use Case 7: Deque Based Optimized Palindrome Checker");
        System.out.println();

        // Declare and initialize input string
        String input = "level";

        // Create Deque (Double Ended Queue)
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word '" + input + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + input + "' is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Program finished.");
    }
}