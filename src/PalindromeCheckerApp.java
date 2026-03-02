import java.util.Scanner;

/**
 * =============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * =============================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("     PALINDROME CHECKER SYSTEM");
        System.out.println("====================================");
        System.out.println("Version: 4.0");
        System.out.println("Use Case 4: Character Array Based Validation");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();

        // Convert string to character array
        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word '" + word + "' is a PALINDROME.");
        } else {
            System.out.println("The word '" + word + "' is NOT a palindrome.");
        }

        System.out.println();
        System.out.println("Program finished.");

        scanner.close();
    }
}