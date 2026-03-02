/**
 * =============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using
 * object-oriented design.
 *
 * The palindrome logic is encapsulated inside a
 * PalindromeService class.
 *
 * This improves:
 *  - Reusability
 *  - Readability
 *  - Separation of concerns
 *
 * @author Developer
 * @version 11.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 11.0");
        System.out.println("Use Case 11: Object-Oriented Palindrome Service");
        System.out.println();

        String input = "madam";

        // Create service object
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

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
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}