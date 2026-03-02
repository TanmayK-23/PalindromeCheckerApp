import java.util.LinkedList;

/**
 * =============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *  - removeFirst()
 *  - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 8.0");
        System.out.println("Use Case 8: Linked List Based Palindrome Checker");
        System.out.println();

        // Declare and initialize input string
        String input = "radar";

        // Create LinkedList
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare from both ends
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
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