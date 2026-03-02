/**
 * =============================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * @author Developer
 * @version 11.0
 */

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 11.0");
        System.out.println("Use Case 11: Object-Oriented Palindrome Service");
        System.out.println();

        String input = "madam";

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println("The word '" + input + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + input + "' is NOT a palindrome.");
        }

        System.out.println("Program finished.");
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    public boolean checkPalindrome(String input) {

        if (input == null) return false;

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