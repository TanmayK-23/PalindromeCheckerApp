/**
 * =============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 *  - Removing spaces and symbols
 *  - Converting to lowercase
 *
 * Example:
 *  "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 10.0");
        System.out.println("Use Case 10: Normalized Palindrome Validation");
        System.out.println();

        String input = "A man a plan a canal Panama";

        // Normalize: remove non-alphanumeric characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The sentence \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("The sentence \"" + input + "\" is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Program finished.");
    }
}